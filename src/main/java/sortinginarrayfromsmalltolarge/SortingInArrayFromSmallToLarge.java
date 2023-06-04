package sortinginarrayfromsmalltolarge;

import java.util.Arrays;
import java.util.Scanner;
   /*
    Kullanıcının eleman sayısını ve elemanlarını belirttiği bir dizi
    oluşturuluyor ve dizi küçükten büyüğe sıralanıp console yazdırılıyor.
  */
public class SortingInArrayFromSmallToLarge {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");//Dizinin boyutunu kullanıcı belirliyor
        int demension=scan.nextInt();
        int element;
        int count=1;
        int[] list=new int[demension];

        System.out.println("Dizinin elemanlarını giriniz:");//Dizinin elemanlarını kullanıcı belirliyor
        for(int i=0;i<list.length;i++){

            System.out.print(count + " .elemanı: ");
             element=scan.nextInt();
             list[i]=element;
             count++;
        }
        Arrays.sort(list);//dizi küçükten büyüğe sıralandı

        System.out.print("Sıralama: ");
        for(int w: list){
            System.out.print(w + " ");
        }

    }


}
