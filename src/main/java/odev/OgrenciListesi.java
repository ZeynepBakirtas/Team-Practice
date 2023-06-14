package odev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciListesi {
    static Scanner input = new Scanner(System.in);
    static List<String> studentList = new ArrayList<>();

    public static void main(String[] args) {
         /*
    Soru: Bir öğrenci listesi tutan bir program yazmanız isteniyor.
          Program, aşağıdaki seçenekleri sunmalı:
        - Öğrenci ekleme: Kullanıcıdan bir öğrenci adı alacak ve öğrenciyi listeye ekleyecek.
        - Öğrenci silme: Kullanıcıdan silmek istediği öğrenci adını alacak ve listeden bu öğrenciyi silecek.
        - Öğrenci adı güncelleme: Kullanıcıdan güncellemek istediği öğrenci adını ve yeni adını alacak ve
          listede ilgili öğrenci adını güncelleyecek.
        - Toplam öğrenci sayısını sorgulama: Listedeki toplam öğrenci sayısını hesaplayacak ve ekrana yazdıracak.
        - Öğrenci arama: Kullanıcıdan aramak istediği öğrenci adını alacak ve listede bu öğrencinin olup olmadığını
          kontrol edecek.
    Program, kullanıcının seçtiği işlemi gerçekleştirdikten sonra seçenekleri tekrar sunmalı ve
    kullanıcı programdan çıkmak istediğinde çıkış yapmalıdır.
*/

        studentList.add("zeynep bakirtas");
        studentList.add("ali can");
        studentList.add("mihriban hur");
        studentList.add("benna coskun");
        studentList.add("ali keskin");
        studentList.add("gokhan yildiz");
        studentList.add("fatma yildiz");
        studentList.add("nihal gul");

        start();


    }

    private static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("========================== İŞLEMLER =======================\r\n"
                + "   ____________________              ____________________    \n"
                + "   | 1-OGRENCI EKLEME   |           |  2-OGRENCI SILME  |    \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯     \n"
                + "   | 3-ISIM DEGISIKLIGI |           | 4-OGRENCI SAYISI  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯     \n"
                + "   |  5-OGRENCI ARAMA   |           |    6-CIKIS        |    \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯     \n");

        System.out.print("ISLEM SECİNİZ : ");

        String option = input.next();

        switch (option) {
            case "1":
                addStudent();
                break;
            case "2":
                removeStudent();
                break;
            case "3":
                changeName();
                break;
            case "4":
                numberOfAllStudent();
                break;
            case "5":
                searchStudent();
                break;
            case "6":
                System.out.println("----------Ogrenci listenizin son hali--------");
                System.out.println(studentList);
                break;
            default:
                System.out.println("Yanlis değer girdiniz!..");
                start();
        }

    }

    public static List<String> addStudent() {
        System.out.println("Lutfen eklemek istediginiz ogrenci ismini giriniz...");
        String student = input.nextLine().toLowerCase();


        if (studentList.contains(student)) {
            System.out.println("Girdiginiz isim listede bulunmaktadir...");
        } else {
            studentList.add(student);
        }

        start();
        return studentList;
    }

    public static List<String> removeStudent() {

        System.out.println("Lutfen silmek istediginiz ogrenci ismini giriniz...");
        String student = input.nextLine().toLowerCase();

        if (studentList.contains(student)) {
            studentList.remove(student);
            System.out.println("Girdiginiz isim listeden cikartilmistir...");
        } else {
            System.out.println("Girdiginiz isim listede bulunmamaktadir...");
            removeStudent();
        }
        start();
        return studentList;
    }

    public static List<String> changeName() {
        System.out.println("Lutfen guncellemek istediginiz ogrenci ismini giriniz...");
        String oldName = input.nextLine().toLowerCase();

        System.out.println("Lutfen yeni ismini giriniz");
        String newName = input.nextLine().toLowerCase();

        if (studentList.contains(oldName)) {
            studentList.set(studentList.indexOf(oldName), newName);
        } else {
            System.out.println("Girdiginiz isim listede bulunmamaktadir...");
            changeName();
        }

        start();
        return studentList;
    }

    public static void numberOfAllStudent() {
        System.out.println("Ogrenci sayisi: " + studentList.size());
        start();
    }

    public static void searchStudent() {
        System.out.println("Lutfen aramak istediginiz ogrenci ismini giriniz...");
        String student = input.nextLine().toLowerCase();

        if (studentList.contains(student)) {
            System.out.println("Aradiginiz isim listede bulunmaktadir...");
        } else {
            System.out.println("Girdiginiz isim listede bulunmamaktadir...");
        }

        start();
    }

}
