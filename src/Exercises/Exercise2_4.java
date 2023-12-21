package Exercises;
import java.util.Scanner;
public class Exercise2_4 {
    public static boolean isLeap(int year)
    {
        return (year%4 == 0 && year%100 != 0) || (year%400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year:");
        int year_x = sc.nextInt();
        System.out.println();
        System.out.println("Is leap:"+ (isLeap(year_x)));
    }
}
