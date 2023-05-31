package task;


import java.util.Enumeration;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*  task3:
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        while (num <= 0) {//Once condition kontrol edilir
            System.out.println("Lutfen pozitif bir sayi giriniz");
            num = input.nextInt();
        }

        int i = 1;
        while (i <= num) {// i degiskeniyle satir sayisini kontrol eder
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");// j degiskeniyle her satirda yazilacak bosluk sayisini kontrol eder
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");// k degiskeniyle her satirda yazilacak "*" sayisini kontrol eder.
            }
            System.out.println();
            i++;
        }
    }
}
