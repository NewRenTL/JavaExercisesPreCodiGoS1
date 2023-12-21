package Exercises;
import java.util.Scanner;
public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        if(n1%2 == 0)
        {
            System.out.println("The number is even:"+true);
        }
        else
        {
            System.out.println("The number is not even:"+false);
        }
    }
}
