package example;

import java.util.Scanner;

public class QuestionsAnswers03 {
    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim geçerli bir gun ise gun isminin 1., 2. ve 3.harflerini
        ilk harf buyuk diğer ikisi kucuk olarak yazdirin, gun ismi geçerli değilse "Geçerli gun ismi giriniz" yazdirin
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz..");
        String day = input.next();
        boolean normalDay = day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("Tuesday") ||
                day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday") ||
                day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("saturday") ||
                day.equalsIgnoreCase("sunday");


        if (normalDay){
            System.out.println(day.substring(0, 1).toUpperCase() + day.substring(1, 3).toLowerCase());
        } else {
            System.out.println("Gecerli gun ismi giriniz..");
        }

        /*
        Soru 6) Kullanicidan iki şayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, sayilarin ikisi de
        negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli işaretlere sahipse "farkli işaretlerde sayilarla
        işlem yapamazsin" yazdirin, sayilardan sifira eşit olan varsa "sifir çarpmaya gore yutan elemandir" yazdirin.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz..");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        
        if(num1>0 && num2>0){
            System.out.println(num1+num2);
        } else if (num1<0 && num2<0) {
            System.out.println(num1*num2);
        } else if (num1==0 || num2==0) {
            System.out.println("sifir çarpmaya gore yutan elemandir");
        } else {
            System.out.println("farkli işaretlerde sayilarla işlem yapamazsin");
        }


    }

}
