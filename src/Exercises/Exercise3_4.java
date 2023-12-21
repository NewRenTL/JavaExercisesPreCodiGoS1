package Exercises;

import java.util.Scanner;

public class Exercise3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int x_number = sc.nextInt();
        int sum = 0;
        for (int i = 0;i <=x_number;i++)
        {
            sum+=i;
        }
        System.out.println("The sum of the first "+x_number+" natural numbers is ->"+sum);
    }
}
