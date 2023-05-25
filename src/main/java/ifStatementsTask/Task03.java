package ifStatementsTask;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
         /* TASK :
     *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
    INFO :
    BMI = kilo(kg) /(boy*boy)(m)
    BMI <=20 oldukca zayifsiniz
    20<BMI<=25 Normal sinirlardasiniz
    25<BMI<=30 Sisman kategorisindesiniz
    30<BMI ==> Obez grubundasiniz.

     */

        Scanner scan = new Scanner(System.in); System.out.println("Passwordunuzu giriniz"); String password = scan.nextLine(); while(!(password.equals("AliCan"))) {
            System.out.println("Yanlış"); System.out.println("Passwordunuzu giriniz"); password = scan.nextLine();
        } System.out.println("Doğru");
    }
}
