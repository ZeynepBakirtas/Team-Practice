package sorubankasi;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/
        Scanner input = new Scanner(System.in);

        double prize = 0;

        do {
            System.out.println("Lutfen hagi sehre gitmek istediginizi giriniz: B, C, D");
            String city = input.next().toUpperCase();

            switch(city){
                case "B" :
                    prize = bSehriYolUcreti();
                    break;
                case "C" :
                    prize = cSehriYolUcreti();
                    break;
                case "D" :
                    prize = dSehriYolUcreti();
                    break;
                default:
                    System.out.println("Yanlis sehir ismi girdiniz...");
                    continue;
            }
            break;
        } while (true);

        System.out.println("Lutfen yasinizi giriniz...");
        int yas = input.nextInt();
//
        System.out.println("Biletinizi gidis donus ister misiniz. Lutfen evet veya hayir olarak cevap veriniz...");
        String roundTrip = input.next();
        boolean turn = roundTrip.equalsIgnoreCase("evet");
//
        if (turn){
            prize *= 0.2;
            if (yas<=12){
                prize *= 0.5;
            } else if (yas>12 && yas<24){
                prize *= 0.1;
            } else if (yas>65){
                prize *= 0.3;
            }
        } else {
            if (yas<=12){
                prize *= 0.5;
            } else if (yas>12 && yas<24){
                prize *= 0.1;
            } else if (yas>65){
                prize *= 0.3;
            }
        }

        DecimalFormat df = new DecimalFormat("0.00");// Ondaligi iki basamak gosterir
        String newPrize = df.format(prize);
        System.out.println("Biletiniz hazirdir. Lutfen " + newPrize + "$ odeme yapiniz");
    }


    private static double dSehriYolUcreti() {
        double bDistance = 900;
        double dPrice = 0.1 * bDistance;
        return dPrice;
    }

    private static double cSehriYolUcreti() {
        double cDistance = 700;
        double cPrice = 0.1 * cDistance;
        return cPrice;
    }

    private static double bSehriYolUcreti() {
        double bDistance = 500;
        double bPrice = 0.1 * bDistance;
        return bPrice;
    }
}