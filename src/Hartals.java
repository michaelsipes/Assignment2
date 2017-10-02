import java.io.*;
import java.util.*;

class Hartals {

    public static void main(String[] args){

        Scanner fin = null;
        try {
            if(args.length == 1){
                File file = new File(args[0]);
                fin = new Scanner(file);
            }else
                fin = new Scanner(System.in);

            int cases = Integer.parseInt(fin.nextLine());
            int i = 0;
            while(i < cases){
                int numberOfDays = Integer.parseInt(fin.nextLine());
                int numberOfParties = Integer.parseInt(fin.nextLine());
                ArrayList<Integer> hartals = new ArrayList<>();
                int j = 0;
                while(j < numberOfParties){
                    hartals.add(Integer.parseInt(fin.nextLine()));
                    j++;
                }
                System.out.println(daysLost(numberOfDays,numberOfParties,hartals));
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static int daysLost(int numberOfDays, int numberOfParties, ArrayList<Integer> hartals){

        int daysLost = 0;
        for (int i=1;i<=numberOfDays;i++){
            if (i%7!=6 && i%7!=0) {
                for (int j = 0; j < numberOfParties; j++) {
                    if (i % hartals.get(j) == 0) {
                        daysLost++;
                        break;
                    }
                }
            }
        }

        return daysLost;
    }

}