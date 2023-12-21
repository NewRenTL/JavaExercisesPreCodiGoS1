package Exercises;
import java.util.Scanner;
public class Exercise3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times to print 'Hello World':");
        int times = sc.nextInt();
        System.out.println("Print "+times+" 'Hello world'");
        for (int j = 0; j < times; j++) {
            System.out.println("Hello world");
        }
        System.out.print("\n");
    }
}
