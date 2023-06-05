package numberofrepeatingelements;
public class NumberOfRepeatingElements {
    static boolean isFund(int list[], int value){
        for (int i = 0 ; i<list.length;i++){
            if(value==list[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //Dizi içerisindeki tekrar eden sayıları bulur ve tekrar sayısını yazdırır.

        int[] list ={10,20,20,10,10,20,5,20};
        int[] dublicate = new int[list.length];

        int count = 0;

        System.out.println(" Repet Numbers: ");

            for(int i=0; i<list.length;i++){
            int idx = 1 ;
                for(int j=0;j<list.length;j++){
                if ((i!=j) && (list[i]==list[j]) ){
                    idx++;
                }
            }
            if (isFund(dublicate, list[i])){

                dublicate[count]=list[i];
                count++;

                System.out.println(" Number:\t" + list[i] +"\trepeated:\t" + idx );
            }
        }

    }
}