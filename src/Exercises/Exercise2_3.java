package Exercises;

import java.util.Scanner;
public class Exercise2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        if(n1 < 0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is positive");
        }
    }
}
