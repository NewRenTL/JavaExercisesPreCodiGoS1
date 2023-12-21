package Exercises;
import java.util.Scanner;
public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 == n2)
        {
            System.out.println("The numbers are the same");
        }
        else
        {
            System.out.println("The numbers are different");
        }
    }
}
