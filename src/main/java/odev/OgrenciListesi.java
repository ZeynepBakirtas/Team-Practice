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


        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("========================== İŞLEMLER =======================\r\n"
                    + "   ____________________              ____________________    \n"
                    + "   | 1-OGRENCI EKLEME   |           |  2-OGRENCI SILME  |    \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯     \n"
                    + "   | 3-ISIM DEGISIKLIGI |           | 4-OGRENCI SAYISI  |   \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯     \n"
                    + "   |  5-OGRENCI ARAMA   |           |    6-CIKIS        |    \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯     \n");

            System.out.print("LUTFEN GIRMEK ISTEDIGINIZ ISLEMI SECİNİZ : ");

            String option = input.next();

            switch (option) {
                case "1":
                    addList();
                    break;
                case "2":
                    removeList();
                    break;
                case "3":
                    changeListElement();
                    break;
                case "4":
                    listSize();
                    break;
                case "5":
                    listElementSearch();
                    break;
                case "6":
                    System.out.println("----------Ogrenci listenizin son hali--------");
                    System.out.println(studentList);
                    break;
                default:
                    System.out.println("Yanlis değer girdiniz!..");
            }
        }

    }





    public static List<String> addList() {
        System.out.println("Lutfen eklemek istediginiz ogrenci ismini giriniz...");
        String student = input.nextLine().toLowerCase();


        if (studentList.contains(student)) {
            System.out.println("Girdiginiz isim listede bulunmaktadir...");
        } else {
            System.out.println("Girdiginiz isim listeye eklenmistir");
            studentList.add(student);
        }

        return studentList;
    }

    public static List<String> removeList() {

        System.out.println("Lutfen silmek istediginiz ogrenci ismini giriniz...");
        String student = input.nextLine().toLowerCase();

        if (studentList.contains(student)) {
            studentList.remove(student);
            System.out.println("Girdiginiz isim listeden cikartilmistir...");
        } else {
            System.out.println("Girdiginiz isim listede bulunmamaktadir...");
            removeList();
        }
        return studentList;
    }

    public static List<String> changeListElement () {
        System.out.println("Lutfen guncellemek istediginiz ogrenci ismini giriniz...");
        String oldName = input.nextLine().toLowerCase();

        System.out.println("Lutfen yeni ismini giriniz");
        String newName = input.nextLine().toLowerCase();

        if (studentList.contains(oldName)) {
            studentList.set(studentList.indexOf(oldName), newName);
        } else {
            System.out.println("Girdiginiz isim listede bulunmamaktadir...");
            changeListElement();
        }

        return studentList;
    }

    public static void listSize() {
        System.out.println("Ogrenci sayisi: " + studentList.size());
    }

    public static void listElementSearch() {
        System.out.println("Lutfen aramak istediginiz ogrenci ismini giriniz...");
        String student = input.nextLine().toLowerCase();

        if (studentList.contains(student)) {
            System.out.println("Aradiginiz isim listede bulunmaktadir...");
        } else {
            System.out.println("Girdiginiz isim listede bulunmamaktadir...");
        }

    }

}
