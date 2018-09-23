package zadanie_3;

import java.util.Scanner;
import java.util.SplittableRandom;

public class main3 {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        int guess = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Pomyśl o liczbie w zakresie od 0 do 1000 - a ja ją odgadne maksymalnie w 10 ruchach.");

        while (true) {
            guess = guessing(max, min);
            System.out.println("zgaduję, że pomyślałeś o liczbie: " + guess);
            String test = answer(scan);
            if (test.equals("większa")) {
                min = guess;
            } else if (test.equals("mniejsza")) {
                max = guess;
            } else {

                break;
            }
        }
        System.out.println("zgadłem to była liczba: " + guess);

    }

    static String answer(Scanner scan) {
        String odp = "";

        while (!(odp.equals("większa") || odp.equals("mniejsza") || odp.equals("zgadłeś"))) {
            System.out.println("odpowiedz: większa / mniejsza lub zgasłeś");
            odp = scan.nextLine();
        }
        return odp;
    }




    static int guessing(int max, int min){

        return ((max -min)/2)+min;
    }
}
