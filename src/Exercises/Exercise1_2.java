package Exercises;

import java.util.Scanner;
import java.lang.Math;
public class Exercise1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        System.out.println("Suma: "+(n1+n2));
        System.out.println("Resta: "+(n1-n2));
        System.out.println("Producto: "+(n1*n2));
        System.out.println("Media: "+((n1+n2)/2));
        System.out.print("Distancia: "+Math.abs(n1-n2));

    }
}
