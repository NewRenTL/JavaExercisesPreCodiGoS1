package Exercises;
import java.util.Scanner;
import java.lang.Math;

public class Exercise3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >1)
        {
            if(n%2 == 0)
            {
                System.out.println(n);
                n = 3*n+1;
            }
            else
            {
                System.out.println(n);
                n = n/2;
            }
        }
    }
}
