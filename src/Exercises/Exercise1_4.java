package Exercises;

import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float temp = a;
        a = b;
        b = temp;
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de b es: "+b);
    }
}
