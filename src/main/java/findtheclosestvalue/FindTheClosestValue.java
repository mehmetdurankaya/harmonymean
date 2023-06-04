package findtheclosestvalue;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheClosestValue {
    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};

       closestToMinMax(list);//method call


    }
    static void closestToMinMax(int[] list){
        Scanner scan =new Scanner(System.in);
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        System.out.print("Number = ");
        int num = scan.nextInt();


        int min = list[0];
        int max = list[0];
        int index;

        for(int i:list) {
            if (num < i) {
                max = i;
                System.out.println("closest to maximum value \t= " + max);

                index = Arrays.binarySearch(list,max)-1;//liste içerisinde ara, maximum değerin index numarasını bul ve bir önceki indexin değerini

                if (num!= list[index]) {                // eşit değilse

                    System.out.println("closest to minumum value  \t= " + list[index]);
                }else{
                    System.out.println("closest to minumum value  \t= " + list[index-1]);
                }
                break;
            }
        }
    }
}
