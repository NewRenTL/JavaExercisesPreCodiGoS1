package Exercises;

import java.util.Scanner;
import java.lang.Math;
public class Exercise2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in degrees Celsius:");
        float celsiusDegree = sc.nextFloat();
        if(celsiusDegree < 0)
        {
            System.out.println("Helado");
        } else if (celsiusDegree>= 0 && celsiusDegree<10) {
            System.out.println("Frio");
        }
        else if(celsiusDegree>=10 && celsiusDegree<20)
        {
            System.out.println("Mucho frio");
        }
        else if(celsiusDegree>= 20 && celsiusDegree<30)
        {
            System.out.println("Templado");
        }
        else if(celsiusDegree>= 30 && celsiusDegree<40)
        {
            System.out.println("Calor");
        } else if (celsiusDegree >= 40) {
            System.out.println("Mucho calor");
        }
    }
}
