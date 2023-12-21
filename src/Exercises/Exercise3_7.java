package Exercises;

import java.util.Scanner;
import java.lang.Math;
public class Exercise3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i<n;i++)
        {
            myArray[i] = sc.nextInt();
        }
        System.out.println("Print:");
        for (int i = 0; i < n;i++)
        {
            System.out.print(myArray[i]+" ");
        }
    }
}
