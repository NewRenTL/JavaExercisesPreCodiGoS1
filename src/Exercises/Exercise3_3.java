package Exercises;

import java.util.Scanner;
public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int numberRange = sc.nextInt();
        System.out.print("\n");
        for (int k = 0; k < numberRange; k++) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }
    }
}
