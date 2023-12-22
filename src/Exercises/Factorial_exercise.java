package Exercises;
import java.util.Scanner;
public class Factorial_exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int count = n1;
        int factorial = 1;
        while (n1 > 0)
        {
            factorial*=n1;
            n1--;
        }
        System.out.println("Factorial de "+count+" es:"+factorial);
    }
}

