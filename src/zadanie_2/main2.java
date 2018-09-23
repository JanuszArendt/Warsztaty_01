package zadanie_2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        int counter =1;
        int number =0;
        int ileTrafionych=0;
        ArrayList<Integer> wytpowane = new ArrayList<>();
        ArrayList<Integer> wylosowane = new ArrayList<>();
        ArrayList<Integer> trafienia = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Podaj " + counter + " z 6 liczb");
            try {
                number = scan.nextInt();

            }catch (InputMismatchException e){
                System.out.println("To nie jest liczba");
                scan.nextLine();
                continue;
            }
            if (number < 1 || number > 49){
                System.out.println("Liczba powinna być w zakresi od 1 do 49");
            }else if (wytpowane.contains(number)){
                System.out.println("tą liczbę już wcześniej podałeś");
                continue;
            }else  {
                wytpowane.add(number);
                counter++;
            }

        }while (wytpowane.size()<6);
        scan.close();
        wytpowane.sort(Integer::compareTo);
        System.out.println("Liczby, które wytypowałeś: " + wytpowane.toString());

        while (wylosowane.size()<6){
            int wylosowana = randomNumber();

            if (!wylosowane.contains(wylosowana)){
                wylosowane.add(wylosowana);
            }
        }

        System.out.println("liczby wylosowane: " + wylosowane.toString());

        for (Integer nuber: wylosowane){
            for (Integer nuberWybrane: wytpowane){
                if (nuber==nuberWybrane){
                    ileTrafionych++;
                    trafienia.add(nuber);
                }
            }
        }
        if (ileTrafionych>2){
            System.out.println("Trafiłeś " + ileTrafionych);
            System.out.println("Twoje trafione liczby:" + trafienia.toString());
        }else {
            System.out.println("Brak wygranej - próbuj szczęścia dalej");
        }


    }

    static int randomNumber(){
        Random rnd = new Random();
        return rnd.nextInt(49)+1;
    }
}
