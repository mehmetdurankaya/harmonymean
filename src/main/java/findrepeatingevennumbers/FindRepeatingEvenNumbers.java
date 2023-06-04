package findrepeatingevennumbers;



public class FindRepeatingEvenNumbers {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Dizi içerisindeki tekrar eden çift sayıları bulur ve ekrana yazdırır.

        int[] list ={2,3,7,3,3,2,8,9,10,21,1,33,9,1,8,2,10};
        int[] dublicate =new int[list.length];
        int startIndex=0;

        for(int i=0;i<list.length;i++){//tekrar eden sayılar
            for (int j = 0; j <list.length ; j++) {
                if((i!=j) && list[i]==list[j]){
                        if(!isFind(dublicate,list[i])){
                            dublicate[startIndex++]=list[i];
                        }

                    break;
                    }
                }
        }

        for (int value: dublicate){//tekrar eden çiftsayılar
            if(value%2==0){

                System.out.print(value +" - ");
            }
        }

    }

}







