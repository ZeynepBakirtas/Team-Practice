package interviewTask;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // TASK 3: Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz..");
        String pwd = input.nextLine();

        if (pwd.contains(" ")){
            System.out.println("Girdiginiz sifre bosluk karakteri icerir.");
        }else {
            System.out.println("Girdiginiz sifre bosluk karakteri icermez.");
        }

    }
}
