package Exercises;

import java.util.Scanner;
import java.lang.Math;
public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float PI = 3.14f;
        double radio = sc.nextDouble();
        System.out.println("El area de un circulo de radio "+radio+" es:"+PI*Math.pow(radio,2));
    }
}
