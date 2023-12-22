package Exercises;
import java.util.Scanner;
public class Fibonacci_exercise {

    public static int fibonacci(int n)
    {
        if(n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        //Fibonacci
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number Fibonacci:"+fibonacci(n));
        System.out.println();
        int n1 = 1;
        int n2 = 1;
        int i = 1;
        while (i < n)
        {
            System.out.print(n1+",");
            int n3 = n1 +n2;
            n1 = n2;
            n2 = n3;
            i++;
        }
        System.out.print(n1);
        System.out.println();
        System.out.println("The number Fibonacci is :"+n1);
    }
}
