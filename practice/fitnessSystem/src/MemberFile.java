import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberFile {
    public static void writeToFile(String fileName, Member member) {
        if (!fileName.isEmpty()) {
            File file = new File(fileName);
            FileWriter fileWriter;
            BufferedWriter bufferedWriter;
            try {
                fileWriter = new FileWriter(file, true);
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(String.format("%s,%s,%s,%s", member.getMemberName(), member.getGender(),
                        member.getMembershipType(), member.getDateOfBirth()));
                bufferedWriter.newLine();
                bufferedWriter.close();
                fileWriter.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static ArrayList<Member> readFromFile(String fileName) {
        File file = new File(fileName);
        ArrayList<Member> members = new ArrayList<Member>();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {

                StringTokenizer stringTokenizer = new StringTokenizer(line);
                String name = stringTokenizer.nextToken(",");
                String gender = stringTokenizer.nextToken(",");
                String membershipType = stringTokenizer.nextToken(",");
                String dateOfBirth = stringTokenizer.nextToken(",");
                Member member = new Member(name, gender, membershipType, dateOfBirth);
                members.add(member);

            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {

        }
        return members;

    }

}
