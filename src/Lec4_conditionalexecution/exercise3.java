package Lec4_conditionalexecution;

import java.util.Scanner;

public class exercise3 {

    public static int findMaxNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = scanner.nextInt();
        System.out.print("nhap b: ");
        int b = scanner.nextInt();
        if (a == b) {
            System.out.print("please enter a!=b");
        } else {
            System.out.print("Max number " + findMaxNumber(a, b));
        }
    }
}
