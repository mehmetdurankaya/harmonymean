package harmonicmean;

import java.text.DecimalFormat;
import java.util.Arrays;

public class HormonicMean {

    public static void main(String[] args) {

        DecimalFormat df=new DecimalFormat("00.00");
        System.out.println("Harmonik ortalama, bir veri dizisinde bulunan ve diğerlerinden\n"
                +"çok yüksek değere sahip elemanların ortalamaya etkisini azaltmak için de kullanılır.");
        System.out.println();

        double[] arr = {34, 55, 67, 44, 200, 55, 84};//array

        int count=0;
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += 1 / arr[i];
            count+=arr[i];
        }

        double arithmeticMean= count/arr.length;//Aritmetik ortalama formülü uygulandı.
        double  harmonicMean = arr.length / sum;//Harmonic ortalama formülü uygulandı.
        System.out.println(Arrays.toString(arr));//dizi console yazdırıldı.
        System.out.println();
        System.out.println("Dizinin Aritmetik Ortalaması :\t" + df.format(arithmeticMean));
        System.out.println("Dizinin Harmonik  Ortalaması :\t" + df.format(harmonicMean));



    }
}
