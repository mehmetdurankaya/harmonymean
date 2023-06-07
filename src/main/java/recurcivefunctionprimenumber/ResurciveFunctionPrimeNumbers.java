package recurcivefunctionprimenumber;

import java.util.Scanner;

public class ResurciveFunctionPrimeNumbers {

           //Recursive fonksiyonla asal sayıları bulma uygulaması
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number, primeNumber ;

        System.out.print("enter a positive integer: ");
        number= scanner.nextInt();

        primeNumber=isPrime(number,number/2);

        if (primeNumber==1){
            System.out.println(number+" is a prime number");
        }else {
            System.out.println(number+" is not a prime number");
        }
    }

    private static int isPrime(int num, int i) {//Resursive function
        if (i==1){
            return 1;
        }else {
            if (num%i==0){
                return 0;
            }
            else return isPrime(num,i-1);
        }
    }
}
