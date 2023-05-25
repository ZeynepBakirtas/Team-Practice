package example;

import java.util.Scanner;

public class QuestionsAnswers02 {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu olduğunu yazdirin
        Örnek: gun=Pazar output = "Hafta sonu" gun=Sali output = "Hafta ici"
                *** String için equals method'unu kullanin
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen hangi gun oldugunu giriniz");
        String day = input.next();

        boolean resul1 = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                day.equals("Thursday") || day.equals("Friday");

        boolean result2 = day.equals("Saturday") || day.equals("Sunday");

        if (resul1){
            System.out.println("Haftaici");
        } else if (result2) {
            System.out.println("Haftasonu");
        } else {
            System.out.println("Lutfen bir gun ismi giriniz!");
        }


        //Soru 4) Kullanicidan dikdörtgenin kenar uzunluklarini isteyin ve dikdörtgenin kare olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin iki kenar uzunlugunu giriniz");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        System.out.println(num1==num2 ? "Dikdortgen ayni zamanda karedir" : "Kare degildir");

        /*
        Soru 5) Kullanicidan bir gun alin eğer gun
        "Cuma" ise ekrana "Muslumanlar için kutsal gun" yazdirin.
        "Cumartesi" ise ekrana "Yahudiler için kutsal gun" yazdirin.
        "Pazar" ise ekrana "Hiristiyanlar için kutsal gun" yazdirin
         */

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String day2 = scan2.next();
        boolean lastDay = day2.equalsIgnoreCase("monday") || day2.equalsIgnoreCase("Tuesday") ||
                day2.equalsIgnoreCase("wednesday") || day2.equalsIgnoreCase("thursday");

        if (day2.equalsIgnoreCase("friday")){
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (day2.equalsIgnoreCase("saturday")) {
            System.out.println("Yahudiler için kutsal gun");
        } else if (day2.equalsIgnoreCase("sunday")) {
            System.out.println("Hiristiyanlar için kutsal gun");
        } else if (lastDay) {
            System.out.println("Diger gunler..");
        } else {
            System.out.println("Lutfen gun ismi giriniz..");
        }


    }
}
