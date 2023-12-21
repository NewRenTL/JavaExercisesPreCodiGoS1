package Exercises;

import java.util.Scanner;
public class Exercise3_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int times = sc.nextInt();
        for (int j = 0 ; j<times+1;j++)
        {
            System.out.println(j);
        }
        System.out.print("\n");
    }
}
