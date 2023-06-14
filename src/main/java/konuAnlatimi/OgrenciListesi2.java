package konuAnlatimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciListesi2 {

    static List<String> studentList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

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
    public static void main(String[] args) {

        studentList.add("benna");
        studentList.add("gokhan");
        studentList.add("abdullah");
        studentList.add("mihriban");
        studentList.add("zeynep");
        studentList.add("nihal");

        entry();

    }

    private static void entry() {
        input.nextLine();
        System.out.println("Lutfen asagidaki seceneklerden birine basiniz!.. \n" +
                "1: Ogrenci ekleme \t 2: Ogrenci silme \n " +
                "3: Isim degisikligi \t 4: Ogrenci Sayisi \n" +
                "5: Ogrenci arama \t 6: Cikis");

        String option = input.next();

        switch (option) {
            case "1":
                addStudent();
                break;
            case "2":
                deleteStudent();
                break;
            case "3":
                changeName();
                break;
            case "4":
                numberOfAllStudent();
                break;
            case "5":
                searchNameOfStudent();
                break;
            case "6":
                System.out.println("Ogrenci listenizin son hali: " + studentList);
                break;
            default:
                System.out.println("Dogru bir secenek giriniz");
                entry();
        }


    }


    public static List<String> addStudent() {
        System.out.println("Lutfen eklemek istediginiz ogrenci ismini giriniz...");
        String studentName = input.nextLine().toLowerCase();
        input.nextLine();
        if (studentList.contains(studentName)) {
            System.out.println("Girdiginiz isim listede bulunmaktadir...");
        } else {
            studentList.add(studentName);
        }

        entry();
        return studentList;

    }


    public static List<String> deleteStudent() {
        input.nextLine();
        System.out.println("Lutfen silmek istediginiz ogrenci ismini giriniz...");
        String student = input.nextLine().toLowerCase();

        if (studentList.contains(student)) {
            studentList.remove(student);
        } else {
            System.out.println("Girdiginiz isim listede bulunmamaktadir...");
            deleteStudent();
        }
        System.out.println(studentList);

        entry();
        return studentList;

    }



    public static List<String> changeName() {
        System.out.println("Lutfen degistirmek istediginiz ogrenci ismini giriniz...");
        String oldName = input.nextLine().toLowerCase();
        input.nextLine();

        System.out.println("Lutfen ogrencinin yeni ismini giriniz...");
        String newName = input.nextLine().toLowerCase();

        if (studentList.contains(oldName)) {
            studentList.set(studentList.indexOf(oldName), newName);
        } else {
            System.out.println("Listede bulunmayan bir isim girdiniz...");
        }

        entry();
        return studentList;

    }


    public static void numberOfAllStudent() {
        System.out.println("Tum ogrencilerin sayisi: " + studentList.size());

        entry();
    }


    public static void searchNameOfStudent() {
        System.out.println("Lutfen aramak istediginiz ogrenci ismini giriniz...");
        String studentName = input.nextLine().toLowerCase();

        if (studentList.contains(studentName)) {
            System.out.println("Aradiginiz isim listede bulunmaktadir...");
        } else {
            System.out.println("Aradiginiz isim listede bulunmamaktadir...");
        }

        entry();
    }


}
