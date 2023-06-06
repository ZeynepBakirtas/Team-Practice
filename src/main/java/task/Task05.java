package task;

import java.util.Scanner;

public class Task05 {
    /* TASK :
       String girildiginde ilk iki karakteri haric string return eden java method yaziniz
       Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
      ORNEK:
       INPUT      :  goat
                     photo
                     ghost
                     kalem
       OUTPUT :      gat
                     hoto
                     ghost

                     lem
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = input.next().toLowerCase();
        System.out.println(kelimeKontrol(kelime));
    }

    public static String kelimeKontrol(String kelime) {
        String ilkHarf = "";
        String ikinciHarf = "";

        if (kelime.charAt(0) == 'g'){
            ilkHarf = kelime.substring(0, 1);
        }

        if (kelime.charAt(1) == 'h') {
            ikinciHarf = kelime.substring(1, 2);
        }

        String yeniKelime = ilkHarf + ikinciHarf + kelime.substring(2);
        return yeniKelime;
    }
}
