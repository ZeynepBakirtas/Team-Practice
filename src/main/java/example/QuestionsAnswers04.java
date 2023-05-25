package example;

import java.util.Scanner;

public class QuestionsAnswers04 {
    public static void main(String[] args) {
        /*
        Soru 7) Kullanicidan 100 üzerinden notunu isteyin. Not'u harf sistemine çevirip yazdirin. 50’den kucukse "D",
        50-60 arasi "C", 60-80 arasi "B", 80’nin üzerinde ise "A"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz..");
        double  note =scan.nextDouble();

        if(note<50 && note>0){
            System.out.println("D");
        } else if (note>=50 && note<60) {
            System.out.println("C");
        } else if (note>=60 && note<80) {
            System.out.println("B");
        } else if (note>=80){
            System.out.println("A");
        } else {
            System.out.println("Lutfen 100 ile 0 arasinda bir not giriniz!");
        }

        /*
        Soru 8) Kullanicidan maaş için bir teklif isteyin ve asagidaki değerlere gore cevap azdirin. Teklif 80.000’in üzerinde
        ise "Kabul ediyorum",60 - 80.000 arasinda ise "Konuşabiliriz", 60.000’nin altinda ise "Maalesef Kabul edemem" yazdirin
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen maas teklifinizi giriniz..");
        double salary = input.nextDouble();

        if (salary>80000){
            System.out.println("Kabul ediyorum");
        } else if (salary<=80000 && salary>60000) {
            System.out.println("Konusabiliriz");
        } else{
            System.out.println("Maalesef kabul edemem");
        }


    }
}
