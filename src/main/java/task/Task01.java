package task;

public class Task01 {
    public static void main(String[] args) {
        /* task1
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
       */
        double high = 240;
        double toplamYol = 0;
        int count = 0;//yere vurma sayisi

        do{
            toplamYol += high;
            high += 0.75;
            toplamYol += high;
            count++;
        }while(high>100);
        toplamYol += high;

        System.out.println("Topun aldigi toplam yol: " + toplamYol + "cm Topun yere vurma sayisi: "+ count);

    }
}
