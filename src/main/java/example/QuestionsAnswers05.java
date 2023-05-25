package example;

import java.util.Scanner;

public class QuestionsAnswers05 {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        String character = scan.next();

        Boolean result = character.replaceAll("[^A-Za-z]","").length()>0;
        System.out.println(result);
        String rsl = result ? "Girdiginiz karakter harftir" : "Girdiginiz karakter harf degildir.";
        System.out.println(rsl);

        //Soru 2) Kullaniciya yasini sorun, eğer yas 65’den kucuk ise "emekli olamazsin, çalışmalısın", 65’e eşit veya büyükse
        //        "Emekli olabilirsin" yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz..");
        int old = input.nextInt();

        if(old < 65){
            System.out.println("Emekli olamazsin, calismalisin");
        } else if ( old >= 65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Lutfen gecerli bir yas giriniz..");
        }

        //Soru 3) Kullanicidan bir üçgenin uc kenar uzunluğunu alin eğer uc kenar uzunluğu birbirine eşit ise ekrana
        //        "Eşkenar ucgen" yazdirin. Diğer durumlarda ekrana "Eşkenar değil" yazdirin.

        Scanner scan02 = new Scanner(System.in);
        System.out.println("Lurfen 3 kenar uzunlugu giriniz");
        double a = scan02.nextDouble();
        double b = scan02.nextDouble();
        double c = scan02.nextDouble();

        String result2 = a==b && a==c ? "Eskenar ucgen" : "Eskenar degil";
        System.out.println(result2);



    }
}
