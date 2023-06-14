package task;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /* TASK :
 Kullanicidan aldigimiz 8 elemanli arrayin icinde
3 e bölünebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sekiz elemanli bir array giriniz");
        int arr[] = new int[8];
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Lutfen " + (i+1) + ". elemani giriniz...");
            arr[i] = input.nextInt();
            if (arr[i] % 3 == 0){
                count++;
            }
        }
        System.out.println("Array inizde 3 e bolunebilen " + count + " sayi bulunmaktadir...");
    }
}
