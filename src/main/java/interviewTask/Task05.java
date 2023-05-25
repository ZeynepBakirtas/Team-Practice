package interviewTask;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* TASK-5: Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
      Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
         */
        System.out.println(" Adinizi ve Soyadinizi giriniz.. ");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();

        char first  = userName.trim().toUpperCase().charAt(0);
        char second = userName.trim().toUpperCase().split(" ")[1].charAt(0);
        char third  = userName.trim().toUpperCase().split(" ")[2].charAt(0);

        System.out.println("TASK-5: "+first+"."+second+"."+third+".");
    }
}
