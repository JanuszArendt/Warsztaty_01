package zadanie_1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {

        int secretNumber = generateNumber();
        int number = 0;
        int counter =0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Guess the number - from 1 to 100");
             try{
                 number = scan.nextInt();
             }catch (InputMismatchException e){
                 System.out.println("Thi is not a number");
                 scan.nextLine();
                 continue;
             }
             counter++;

             if (number<secretNumber){
                 System.out.println("The number is too small");
             }else if (number>secretNumber){
                 System.out.println("The number is to large");
             }
        }while (secretNumber!= number);
        scan.close();

        System.out.println("You guessed the number after " + counter +" times");

    }

    static int generateNumber(){
        Random rnd = new Random();
        return rnd.nextInt(99)+1;
    }

}
