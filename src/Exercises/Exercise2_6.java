package Exercises;
import java.util.Scanner;
import java.lang.Math;
public class Exercise2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float gradeMath = sc.nextFloat();
        float gradePhysics = sc.nextFloat();
        float gradeChemistry = sc.nextFloat();
        System.out.println(gradeMath >= 65 && gradePhysics >= 55 && gradeChemistry >= 50);

    }
}
