package Exercises;

import java.util.Scanner;
import java.lang.Math;
public class Exercise3_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size_array = sc.nextInt();
        System.out.print("\n");
        int[] myArrayDx = new int[size_array];
        for (int i = 0; i<size_array;i++)
        {
            System.out.print("Enter your number into array in position "+i+":");
            myArrayDx[i] = sc.nextInt();
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.println("Enter your number that you want find:");
        int number_to_find = sc.nextInt();
        boolean is_find = false;
        for (int i = 0; i < size_array;i++)
        {
            if(myArrayDx[i] == number_to_find) {
                is_find = true;
                System.out.println("Position " + i + " is the number to find");
                break;
            }
        }

        if(!is_find)
        {
            System.out.println("The number could not be found");
        }

    }
}
