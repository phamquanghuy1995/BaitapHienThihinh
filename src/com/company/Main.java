package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác vuông");
            System.out.println("3. Hình tam giác cân");
            System.out.println("4. lối ra");
            System.out.println("Other. default");
            System.out.println("Enter the right corner: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hinh Chữ Nhật");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Hình Tam Giác Vuông");
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    for (int i = 1; i < 8; i++) {
                        for (int j = 1; j < 8 - i; j++)
                            System.out.print(" ");
                        for (int j = 1; j < 2 * i-1; j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
