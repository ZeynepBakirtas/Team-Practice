package task;

import java.util.Scanner;

public class Task02 {
        /* task2 :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz:
        Faktöriyeli 3*2*1 =6
                */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");
            int number = scanner.nextInt();

            //int factorial = calculateFactorial(number);

            //System.out.print("Faktöriyel: "+ factorial);


            int faktoriyel =1;
            String faktoriyeFormul = "";

            for (int i = number;  i>=1;   i--){
                faktoriyel *=i;
                faktoriyeFormul += i;
                if (i !=1){ //
                    faktoriyeFormul += "*";
                }
            }
            System.out.println("Faktoriyel Formulu: " +faktoriyeFormul);
            System.out.println("Faktoriyeli: "+ faktoriyel);
        }

        //public static int calculateFactorial(int n) {
        //    if (n == 0 || n == 1) {
        //        return 1;
        //    } else {
        //        return n * calculateFactorial(n - 1);
        //    }
        //}
}
