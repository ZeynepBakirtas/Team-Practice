package task;

import java.util.Arrays;
import java.util.Scanner;

public class BakkalKazanci {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortaslama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan aşağıysa o günleri return yap.
         * */
        Scanner input = new Scanner(System.in);

        String gunler[] = {"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};
        double gunlukKazanclar[] = new double[7];

        int i = 0;
        while (i < gunlukKazanclar.length) {
            System.out.println("Lutfen " + (i + 1) + " . gunun kazancini giriniz..");
            gunlukKazanclar[i] = input.nextDouble();
            i++;
        }
        System.out.println(Arrays.toString(gunlukKazanclar));

        double ort = getOrtalamKazanc(gunlukKazanclar);
        System.out.println(ort);
        getOrtalamaninUstundeKazancGünleri(ort, gunlukKazanclar, gunler);
        getOrtalamaninAltindaKazancGünleri(ort, gunlukKazanclar, gunler);
    }
    private static void getOrtalamaninAltindaKazancGünleri(double ort, double[] gunlukKazanclar, String[] gunler) {
        System.out.println("\nOrtalamanin  altinda kalan gunler :");
        String ortGunAlt="";

        for (int i = 0; i < gunler.length; i++) {

            if (gunlukKazanclar[i] < ort) {
                ortGunAlt = gunler[i];
                System.out.print(" "+ortGunAlt);
            }
        }
    }
    public static double getOrtalamKazanc(double[] gunlukKazanclar) {
        double sum = 0;
        for (double w : gunlukKazanclar) {
            sum += w;
        }
        double ortalama = sum / gunlukKazanclar.length;
        return ortalama;
    }
    public static void getOrtalamaninUstundeKazancGünleri(double ort, double[] gunlukKazanclar, String[] gunler) {
        String ortGunUst="";
        System.out.println("Ortalamanin  ustunde olan gunleri: ");
        for (int i = 0; i < gunler.length; i++) {
            if (gunlukKazanclar[i] > ort) {
                ortGunUst = gunler[i];
                System.out.print(" "+ortGunUst);
            }
        }
        System.out.println();
    }
}