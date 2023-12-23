import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        // how to create file
        try {
            File f = new File("maha/myFile.txt");
            if (!f.exists()) {
                f.createNewFile();
                System.out.println("file created");
            } else {
                System.out.println("file already exists");
            }

        } catch (IOException e) {
            System.out.println("error has occured");
            e.printStackTrace();

        }
        // how to read file
        try {
            BufferedReader bf = new BufferedReader(new FileReader("maha/myfile.txt"));
            System.out.println("file reading method");
            String linesInfile = bf.readLine();
            while (linesInfile != null) {
                System.out.println(linesInfile);
                linesInfile = bf.readLine();
            }

        } catch (IOException e) {
            System.out.println("error has occured in reading a file");
            e.printStackTrace();
        }

        // how to write file
        try

        {
            FileWriter fw = new FileWriter("myfile.txt");
            fw.write("i have to learn how to read and  write in file");
            System.out.println("successfully written");
            fw.close();
        } catch (IOException e) {
            System.out.println("error ocuured");
            e.printStackTrace();

        }
    }

}
