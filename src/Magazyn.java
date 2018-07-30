import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Magazyn {
    public static void main(String[] args) throws IOException {

        File file = new File("stan_magazynu.csv");

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String nextLine = scan.nextLine();
                System.out.println(nextLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


//        int a;
//        if (a > 0 && a < 5 ){
//            System.out.println(" ");
//        } else if (a > 5 && a <= 10 ){
//            System.out.println("*");
//
//        }

    }
}