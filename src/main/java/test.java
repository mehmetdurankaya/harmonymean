import java.util.Scanner;

public class test {

        public static int FirstFactorial(int num) {
            for(int i= 2; i<=num; ++i){
                num*=i;
                num--;
            }

            return num;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
           int num=s.nextInt();
            System.out.print(FirstFactorial(num));
        }
    }

