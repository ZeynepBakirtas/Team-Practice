package task;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class KahveMakinesi {
    String coffie1 = "Turk Kahvesi";
    String coffie2 = "Filtre Kahve";
    String coffie3 = "Expresso";
    String sut = "";
    String kacSeker = "";

    String kahveBoyut = "";
    Scanner input = new Scanner(System.in);

    public String Giris() {
        System.out.println("Hangi kahveyi istersiniz? \n" + "Turk Kahvesi \n" + "Filtre Kahve \n" + "Expresso");
        String hangiKahve = input.nextLine().toLowerCase();//kucuk harf

        switch (hangiKahve) {
            case "turk kahvesi":
                System.out.println("Turk kahvesi hazirlaniyor");
                break;
            case "filtre kahve":
                System.out.println("Filtre kahve hazirlaniyor");
                break;
            case "expresso":
                System.out.println("Expresso hazirlaniyor");
                break;
            default:
                System.out.println("Hatali giris yaptiniz, makinede bulunan  kahvelerden biriniz seciniz...");
                Giris();
        }
        return hangiKahve;
    }

    public String SutIstermi(){
        System.out.println( "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
        sut = input.next().toLowerCase();

        switch (sut) {
            case "evet":
                System.out.println("Sut ekleniyor");
                break;
            case "hayir":
                System.out.println("Sut eklenmiyor");
                break;
            default:
                System.out.println("Lufen dogru giris yapiniz");
                SutIstermi();
        }
        return sut;
    }
    public String SekerIstermi() {
        System.out.println("Seker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
        String seker = input.next().toLowerCase();

        if (seker.equals("evet")) {
            System.out.println("Kac seker olsun");
            kacSeker = input.next();
            System.out.println(kacSeker + " " + "seker ekleniyor");
        } else {
            System.out.println("Seker eklenmiyor");
        }
        return seker;
    }

    public  String HangiBoy(){
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy)");
        input.nextLine();//(dummy)kullanicidan istenen scanner objesinin data type i degistigi icin, degistigi yerden itibaren
        //scanner objesini yeni data type in cevirmek icin kullanildi.
        kahveBoyut = input.nextLine().toLowerCase();
        System.out.println("Kahveniz " + kahveBoyut + " hazirlaniyor.");
        return  kahveBoyut;

    }

    public void Cikis(){
        System.out.println("Afiyet olsun");
    }
}
