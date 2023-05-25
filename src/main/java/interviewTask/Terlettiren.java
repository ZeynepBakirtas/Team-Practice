package interviewTask;

import java.util.Scanner;

public class Terlettiren {
    public static void main(String[] args) {

        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */


        Scanner input = new Scanner(System.in) ;
        System.out.println("Lutfen bir cumle giriniz");
        String sentence = input.nextLine().replaceAll("\\p{Punct}","").trim();//noktalama isaretlerini kaldirdik. Kenar bosluklari sildik.

        System.out.println(LongestWord(sentence));//sonucu return ediyor

    }
    public static String LongestWord(String cumle) {

        String result = "";//Kelimeleri bos stringe aticaz
        int num = cumle.replaceAll("\\S", "").length()+1;//Cumledeki kelime sayisi, dongunun ne kadar donecegine karar verir.

        for (int i = 0; i < num ; i++) {

            if (cumle.split(" ")[i].length()>result.length()) {
                result = cumle.split(" ")[i];
            }

        }
        //System.out.println(result);//for disina koydukki bize her sonucu dondurmesin en son result a ne atandiysa onu dondurur.
        return result;
    }
}
