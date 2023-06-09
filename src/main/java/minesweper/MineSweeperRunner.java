package minesweper;

import java.util.Scanner;

public class MineSweeperRunner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int row,column;
        System.out.println("Mayın Tarlas oyununa hoş geldiniz.");
        System.out.println("Lüftfen oynamak isteğiniz boyutları giriniz");
        System.out.print("Satr Sayısı : ");
        row= scan.nextInt();
        System.out.print("Sütun saysı : ");
        column=scan.nextInt();

        MineSweeper mine= new MineSweeper(row,column);
        mine.run();


    }
}
