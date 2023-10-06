public class Main {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        for (int i = 0; i < d.NUMBER_OF_CARDS; i++) {
            Card c = d.dealCard();
            System.out.println(c);

        }
    }

}
