package Exercises;

import java.util.Scanner;

public class Exercise1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float width = sc.nextFloat(); // ancho
        float length = sc.nextFloat(); // largo
        float area = width*length;
        System.out.println("El area de un rectangulo de largo "+length+ " y ancho "+width+" es: "+area);
    }
}
