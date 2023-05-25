package ifStatementsTask;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        System.out.println("Lutfen dort islemden biriniz seciniz (+, -, *, /) ");
        char ch = scan.next().charAt(0);

        switch (ch){
            case '+' :
                System.out.println(num1 + num2);
            case  '-' :
                System.out.println(num1 - num2);
            case '*' :
                System.out.println(num1 * num2);
            case  '/' :
                System.out.println(num1 / num2);
        }

    }
}
