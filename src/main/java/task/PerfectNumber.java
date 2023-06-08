package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     : 1,2,3
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number = input.nextInt();

        mukemmelMi(number);

    }

    private static void mukemmelMi(int number) {


        List<Integer> bolenList = new ArrayList<>();

        int bolenToplam = 0;

        for (int i = 1; i < number; i++) {//bolumunden kalan 0 olursa calisacak
            if(number % i == 0){
                bolenList.add(i);
                bolenToplam += i;
            }
        }

        if (bolenToplam == number){
            System.out.println(number+ " Sayisi mukemmeldir \n"+ "Bolenler listesi: " + bolenList);
        } else {
            System.out.println(number + " Sayiniz mukemmel degildir.");
        }

    }
}
