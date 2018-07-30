import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class listNum {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int x = 0;
        int sum = 0;

        do {
            System.out.println("Podaj liczbę:");
            x = input.nextInt();
            if (x < 0){
                break;
            }
            num.add(x);
            sum += x;

        } while(x > 0);

        System.out.println("Wyświetlenie listy w odwrotnej kolejności: ");
        Collections.reverse(num);
        for(int numbers: num) {
            System.out.print(numbers + " ");
        }
        Collections.reverse(num);
        System.out.println("\n" + "Suma wpisanych liczb dodatnich: ");
        for(int numbers: num) {
            System.out.print(numbers + "+");
        }
        System.out.println("...="+ sum);

        Collections.max(num);
        System.out.println("Największa liczba: " + Collections.max(num));
        Collections.min(num);
        System.out.println("Najmniejsza liczba: " + Collections.min(num));


    }
}
