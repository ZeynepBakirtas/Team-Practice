package interviewTask;

import java.util.Scanner;

public class Task01 {

    /*  Task-01
   Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz.      */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen; Para yatirma, Para cekme, Bakiye ogrenme, Cikis islemlerinden birini seciniz..");
        String islem = input.nextLine().toLowerCase();

        double bakiye = 1000;
        atmApp (bakiye,islem);


    }//main

    private static void atmApp(double bakiye, String islem) {

        Scanner input = new Scanner(System.in);

        switch (islem){
            case "bakiye ogrenme" :
                System.out.println("Hesabinizdaki para miktari: "+bakiye);
                break;
            case "para cekme" :
                System.out.println("Cekilecek miktari giriniz...");
                double cekilentutar = input.nextDouble();

                if (bakiye < cekilentutar) {
                    System.out.println("Cekilecek miktar bakiyeden fazla olamaz.. Yeniden deneyiniz...");
                } else  {
                    System.out.println("Yeni bakiye: "+(bakiye-cekilentutar));
                }
                break;
            case "para yatirma" :
                System.out.println("Yatirilacak miktari giriniz...");
                double yatanparaile = input.nextDouble();
                System.out.println("Yeni bakiyeniz: "+(yatanparaile+bakiye));
                break;
            case "cikis" :
                System.out.println("Iyi gunler dileriz...");
                break;
            default:
                System.out.println("Lutfen gecerli bir islem giriniz");
        }


    }//atmApp

}
