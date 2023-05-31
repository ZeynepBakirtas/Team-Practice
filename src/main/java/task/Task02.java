package task;

import java.util.Scanner;

public class Task02 {
        /* task2 :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6
                */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");
            int number = scanner.nextInt();

            int factorial = calculateFactorial(number);

            System.out.print("Faktöriyel: ");
            for (int i = number; i >= 1; i--) {
                System.out.print(i);
                if (i != 1) {
                    System.out.print("*");
                }
            }
            System.out.println("=" + factorial);
        }

        public static int calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorial(n - 1);
            }
        }
}
