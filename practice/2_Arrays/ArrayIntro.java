public class ArrayIntro {

    public static void main(String[] args) {
        int[] arr = { 5, 8, 11, 0, 5, 5, 8 };
        int[] freq = new int[12];
        int counter = 0;
        int sum = 0;
        for (counter = 0; counter < arr.length; counter++) {
            sum = sum + arr[counter];
            int element = arr[counter];
            freq[element]++;
        }
        System.out.println(sum);

    }
}
