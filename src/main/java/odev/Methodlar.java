package odev;

import java.util.List;
import java.util.Scanner;

public class Methodlar {
    static Scanner input = new Scanner(System.in);
    public static void addList(List<String> list) {
        System.out.println("Lutfen eklemek istediginiz datayi giriniz...");
        String student = input.nextLine().toLowerCase();


        if (list.contains(student)) {
            System.out.println("Girdiginiz data listede bulunmaktadir...");
        } else {
            System.out.println("Girdiginiz data listeye eklenmistir");
            list.add(student);
        }

    }

    public static void removeList(List<String> list) {

        System.out.println("Lutfen silmek istediginiz datayi giriniz...");
        String student = input.nextLine().toLowerCase();

        if (list.contains(student)) {
            list.remove(student);
            System.out.println("Girdiginiz data listeden cikartilmistir...");
        } else {
            System.out.println("Girdiginiz data listede bulunmamaktadir...");
            removeList(list);
        }

    }
}
