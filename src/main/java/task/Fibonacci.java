package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     0,1, 0+1, 1+1, 1+2, 2+3, 3+5, 5+8,
     */

        Scanner input = new Scanner(System.in);
        System.out.println("1 den buyuk sayi giriniz..");
        int number = input.nextInt();

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);

        int i = 0;

        while (fibonacciList.get(i)+fibonacciList.get(i+1) <= number){//her dongude kendisinden onceki iki sayinin toplamini alir.
            fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i+1));//sirayla ekleme yaptigi icin index girmedik.
            i++;
        }

        System.out.println(fibonacciList);
    }
}
