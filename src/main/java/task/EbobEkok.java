package task;

import java.util.Scanner;

public class EbobEkok {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Hos geldiniz");
        System.out.println("Bir islem seciniz \n 1-EBOB \n 2-EKOK");

        int secim = input.nextInt();
        if (secim == 1){
            ebob();
        } else if (secim == 2) {
            ekok();
        }

    }

    public static void ebob(){
        int ebob = 0;

        System.out.println("Birinci sayiyi giriniz");
        int sayi1 = input.nextInt();

        System.out.println("Ikinci sayiyi giriniz");
        int sayi2 = input.nextInt();

        for (int i = 1; i <= sayi1; i++) {

            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }

        }
        System.out.println("Ebob = " + ebob);
    }

    public static void ekok(){
        int ekok = 0;

        System.out.println("Birinci sayiyi giriniz");
        int sayi1 = input.nextInt();

        System.out.println("Ikinci sayiyi giriniz");
        int sayi2 = input.nextInt();

        int max = sayi1 * sayi2;

        for (int i = max; i > 0; i--) {

            if (i % sayi1 == 0 && i % sayi2 == 0) {

                ekok = i;
            }

        }
        System.out.println("EKOK = " + ekok);

    }

}
