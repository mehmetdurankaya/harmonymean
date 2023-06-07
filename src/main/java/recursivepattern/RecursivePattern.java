package recursivepattern;

import java.util.Scanner;

public class RecursivePattern {
          //Recursive Pattern Modele göre Girilen sayı '0' veya negatif olduğu yere kadar girilen sayıdan 5 rakamı çıkarıldı.
          // Her çıkarma işlemi sırasında ekrana son değeri yazdırıldı. Sayı negatif veya 0 olduktan sonra tekrar 5 eklendi.
          // her ekleme işleminde sayının son değeri ekrana yazdırıld.
    static void recursiveModel(int i) {
        System.out.print(i + " ");
        if (i <= 0) {
            return;
        }
        recursiveModel(i - 5);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Number: ");
        int n = input.nextInt();
        System.out.print("Output : ");

        recursiveModel(n);


    }

}
