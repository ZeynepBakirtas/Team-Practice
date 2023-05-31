package task;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /* task4 :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.
	 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();
        int arr[] = new int[num];

        System.out.println("Lutfen " + num + " tane array e atanacak sayi giriniz");
        for (int i = 0; i < num; i++) {
            System.out.println((i+1)+ ". elemani giriniz:");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);//Array deki elemanlari siraladik
        System.out.println(Arrays.toString(arr));

        int fark = arr[num-1]-arr[0];
        System.out.println("En buyuk elemanla en kucuk elemanin farki: " + fark);




        //2. Yol
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < num; i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("En buyuk elemanla en kucuk elemanin farki: " +(max-min));

    }
}
