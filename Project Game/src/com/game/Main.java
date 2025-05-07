package com.game;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    boolean isRun = true;
    Scanner input = new Scanner(System.in);

    while (isRun){
        int pilih = menu();
        switch (pilih){
            case 1:
                gameplay();
                break;
            case 2:
                System.out.print("Masukkab batas atas: ");
                int max = input.nextInt();
                System.out.print("Masukkab batas bawah: ");
                int min = input.nextInt();
                random(max,min);
                break;
            case 3:
                isRun = false;
                break;
            default:
                System.err.println("Input anda tidak ditemukan\nSilahkan pilih [1-3]");
        }
    }
    }


    // FUNCTION: main menu
    public static int menu(){
        Scanner input = new Scanner(System.in);
        int pilih;
        System.out.println("\n===== MENU =====\n");
        System.out.println("1. Start");
        System.out.println("2. Generate Random Number");
        System.out.println("3. Exit");
        System.out.println("---------------------------");
        System.out.print("Pilihan anda : ");
        pilih = input.nextInt();
        return pilih;
    }

    // FUNCTION: generate angka random
    public static int random(int max, int min){
        int num = (int)(Math.random() * (max - min + 1)) + min;
        System.out.printf("random = %d",num);
        return num;
    }

    // FUNCTION: gameplay
    public static void gameplay(){
        System.out.println("Game Start");
    }

}
