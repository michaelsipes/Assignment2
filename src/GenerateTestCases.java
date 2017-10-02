import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GenerateTestCases {


    public static void main(String[] args){

        File file = new File("output.txt");
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(file));
            out.write("3650");
            out.newLine();
            out.write("100");
            out.newLine();
            Random ran = new Random();
            int i = ran.nextInt(101);
            int j = 0;
            while(j < 100){
                while(i % 7 == 0){
                    i = ran.nextInt(101);
                }
                out.write(i + "\n");
                j++;
                i = ran.nextInt(101);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }


}
