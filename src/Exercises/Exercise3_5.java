package Exercises;
import java.util.Scanner;

public class Exercise3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int number_x = sc.nextInt();
        boolean is_prime = true;
        for (int i = 2;i < number_x;i++){
            if(number_x%i == 0)
            {
                is_prime = false;
                break;
            }
        }
        if(is_prime)
        {
            System.out.println("The number "+ number_x+" is prime : "+is_prime);
        }
        else
        {
            System.out.println("The number "+number_x+" not is prime:"+is_prime);
        }
    }
}
