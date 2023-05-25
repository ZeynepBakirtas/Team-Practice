package interviewTask;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task 2
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz...");
        String name = input.next();

        System.out.println("Lutfen 1 ile 10 arasinda bir sayi giriniz...");
        int num = input.nextInt();

        System.out.println(ilkSonHarf(name, num));
    }
    public static String ilkSonHarf(String a, int b){
        String firstAndLast = a.substring(0,1) + a.charAt(a.length()-1);
        System.out.println("Girilen kelimenin ilk ve son harfi : " + firstAndLast);

        String output = "";
        for (int i = 1; i<=b; i++){
            output += firstAndLast;
        }
        //return firstAndLast.repeat(b);

        return output;
    }

}


