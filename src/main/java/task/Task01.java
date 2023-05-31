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
        double toplamYol = high;
        int count = 0;//yere vurma sayisi

        do{
            high = (high*3)/4;
            toplamYol += (high*3)/4;
            if(high<=100){
                break;
            }
            count++;
        }while(true);

        System.out.println("Topun aldigi toplam yol: " + toplamYol + "cm Topun yere vurma sayisi: "+ count);

    }
}
