package ifStatementsTask;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  TASK :
     *  Kullanicidan 3 tene pozitif  tam sayi alniz.
     *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
        INFO :
         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
        a=b=c ise es kenar ucgen

     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc tane sayi giriniz..");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        boolean result = a+b>c && c>a-b &&
                        a+c>b && b>a-c &&
                        b+c>a && a>b-c;


        if (result){
            if(a==b && a==c){
                System.out.println("Eskenar ucgendir");
            } else {
                System.out.println("Ucgendir ama eskenar degildir.");
            }
        } else {
            System.out.println("Ucgen degildir.");
        }
    }
}
