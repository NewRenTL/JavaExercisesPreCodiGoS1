package Exercises;
import java.util.Scanner;
public class Exercise2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number " + (i+1) + " :");
            int n1 = sc.nextInt();
            if (n1 > max) {
                max = n1;
            }
        }

        System.out.println("The maximum number is:"+max);
    }

}
