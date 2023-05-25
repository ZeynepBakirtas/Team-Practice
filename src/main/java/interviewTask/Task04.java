package interviewTask;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK 4:
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ad soyadiniz giriniz");
        String nameSurname = input.nextLine();

        String name = nameSurname.trim().split(" ")[0];
        String surname = nameSurname.trim().split(" ")[1];

        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
    }
}
