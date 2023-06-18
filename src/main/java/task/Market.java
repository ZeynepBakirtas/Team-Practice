package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {

    public static List<String> urunlerList = new ArrayList<>();

    public static List<Double> fiyat = new ArrayList<>();

    public static List<String> urunSepeti = new ArrayList<>();
    public static List<Double> sepetTutari = new ArrayList<>();

    public static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {
        		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve ödeme sonrasında programı bitirinzi.
		 */
        urunlerList.add("Domates");
        urunlerList.add("Patates");
        urunlerList.add("Biber");
        urunlerList.add("Soğan");
        urunlerList.add("Havuç");
        urunlerList.add("Elma");
        urunlerList.add("Muz");
        urunlerList.add("Çilek");
        urunlerList.add("Kavun");
        urunlerList.add("Üzüm");
        urunlerList.add("Limon");
        urunlerList.add("Portakal");

        fiyat.add(2.10);
        fiyat.add(3.20);
        fiyat.add(1.50);
        fiyat.add(2.30);
        fiyat.add(3.10);
        fiyat.add(1.20);
        fiyat.add(1.90);
        fiyat.add(6.10);
        fiyat.add(4.30);
        fiyat.add(2.70);
        fiyat.add(0.50);
        fiyat.add(0.70);


        urunListesi();

        System.out.println("Urununuzu kac kg almak istersiniz?");
        double urunKg =  input.nextDouble();

        urunEkle(urunKg);

        while (true){
            System.out.println("Baska bir urun eklemek ister misiniz, evet ise (1) hayir ise (2) tuslayiniz...");
            String option = input.next();

            switch (option){
                case "1" :
                    urunListesi();
                    break;
                case "2" :
                    System.out.println("Iyi gunler dileriz:))");
                    break;
                default:
                    System.out.println("Yanlis giris yaptiniz, tekrar tuslayiniz");
            }

        }

    }

    public static void urunListesi(){
        System.out.println("No   ürünler        Fiyatlar");
        System.out.println("==== ===========    ======");

        for (int i = 0; i < urunlerList.size(); i++) {
            System.out.println( i +" " + urunlerList.get(i)+" " + fiyat.get(i)+ " Tl");
        }
    }

    public static void urunEkle(double kg){
        System.out.println("Lütfen sectiginiz ürünün no'sunu giriniz: ");
        int no = input.nextInt();

        urunSepeti.add(urunlerList.get(no));// urunleri listeye ekledik

        double totalUruFyt = kg * fiyat.get(no);
        sepetTutari.add(totalUruFyt);// fiyatlari listeye ekledik

        for (int i = 0; i < urunlerList.size(); i++) {
            System.out.println(urunlerList.get(i) + " ==> " + sepetTutari.get(i));
        }

    }



}
