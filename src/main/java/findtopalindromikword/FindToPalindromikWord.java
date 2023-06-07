package findtopalindromikword;

import java.util.Scanner;

public class FindToPalindromikWord {//kullanıcı tarafından girilen kelimenin palindrom olup olmadığını kontrol eder.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.print("Kelime giriniz: ");
        String word = scan.nextLine();
        String reverse = "";

        for(int i = (word.length()-1); i >= 0; i--) {

            reverse += word.charAt(i);
        }
        if(reverse.equals(word)){
            System.out.println("Girilen kelime Palindrom bir kelimedir.");
        }
        else{
            System.out.println("Girdiginiz kelime Palindrom bir kelime degildir.");
        }



        }
    }

