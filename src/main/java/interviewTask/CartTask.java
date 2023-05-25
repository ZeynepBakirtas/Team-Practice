package interviewTask;

import java.util.Scanner;

public class CartTask {
    public static void main(String[] args) {
        /*
         * TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Urun adedini giriniz..");
        double numberOfProduct = input.nextDouble();

        System.out.println("Liste fiyatini giriniz..");
        double listPrise = input.nextDouble();

        System.out.println("Musteri kartiniz var mi? Lutfen true veya false olarak cevap veriniz..");
        boolean isCart = input.nextBoolean();


        if (isCart){
            if (numberOfProduct>10){
                double result1 = (listPrise * 80) /100;
                System.out.println("%20 indirim kazandiniz = " + result1);
            } else {
                double result2 = (listPrise * 85) /100;
                System.out.println("%15 indirim kazandiniz = " + result2);
            }
        } else {
            if (numberOfProduct>10){
                double result3 = (listPrise * 85) /100;
                System.out.println("%15 indirim kazandiniz = " + result3);
            } else {
                double result4 = (listPrise * 90) /100;
                System.out.println("%10 indirim kazandiniz = " + result4);
            }
        }

    }
}
