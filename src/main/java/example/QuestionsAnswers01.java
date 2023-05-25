package example;

import java.util.Scanner;

public class QuestionsAnswers01 {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya çift olduğunu yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        byte num = input.nextByte();

        System.out.println(num%2 == 0 ? "Even number" : "odd number");

        /*
        Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle başlayan gun isimlerini yazdirin
        Örnek: ilkHarf=P output = "Pazar, Pazartesi veya Perşembe" ilkHarf=S output = "Sali"
                *** Buyuk kucuk harf problem olmamasi için toUpperCase methodunu kullanin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen herhangi bir gunun ilk harfini giriniz");
        String nameDay = scan.next();
        String big = nameDay.toUpperCase();

        if (big.equals("M")) {
            System.out.println("Monday");
        } else if (big.equals("T")){
            System.out.println("Tuesday or Thursday");
        } else if  (big.equals("W")){
            System.out.println("Wednesday");
        } else if (big.equals("F")){
            System.out.println("Friday");
        } else if (big.equals("S")){
            System.out.println("Saturday or Sunday");
        } else {
            System.out.println("Invalid first letter of the day");
        }


    }
}
