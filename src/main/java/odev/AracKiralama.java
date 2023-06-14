package odev;

import java.util.Scanner;

public class AracKiralama {
    public static void main(String[] args) {
        /*
        Üç farklı method oluşturun.
          - İlk method, bir aracın günlük kira bedelini parametre olarak alacak ve toplam
          kira bedelini hesaplayıp döndürecek.
          - İkinci method, bir aracın günlük kira bedeli ve kiralama süresi parametrelerini alacak
          ve toplam kira bedelini hesaplayıp döndürecek.
          - Üçüncü method ise bir aracın günlük kira bedeli, kiralama süresi ve indirim oranı
          parametrelerini alacak ve
            indirimli toplam kira bedelini hesaplayıp döndürecek.
        Bu methodları kullanarak farklı araçların kira bedellerini hesaplayın.
    */
        System.out.println("Kiralama toplam bedeli: " + totalRent(500));
        System.out.println("Kira toplam bedeli 2: " + totalRent(500,4));
        System.out.println("Kira toplam bedeli 3: " + totalRent(500,4,20));
    }
    static Scanner input = new Scanner(System.in);
    public static double totalRent(double dailyRent){
        System.out.println("Lutfen araci kac gun kiralamak istediginiz belirtiniz");
        double totalSum = dailyRent * input.nextInt();
        return totalSum;
    }

    public static double totalRent(double dailyRent, int days){
        double totalSum = dailyRent * days;
        return  totalSum;
    }

    public static double totalRent(double dailyRent, int days, int discountRate){
        double totalSum = dailyRent * days;
        double discount = totalSum * discountRate / 100;
        totalSum -= discount;
        return  totalSum;
    }
}
