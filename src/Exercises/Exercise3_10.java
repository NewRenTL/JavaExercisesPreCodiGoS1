package Exercises;
import java.util.Scanner;
import java.lang.Math;

public class Exercise3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 1)
        {
            n = sc.nextInt();
        }
        int t = sc.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n;i++)
        {
            myArray[i] = sc.nextInt();
        }
        //System.out.println("Enter the position you want to read:");

        //The formula to generate a random integer in a range is:
        /* TopMin + (int)(Math.random() * ((TopMax-TopMin)+1) */
        int random1 = 0 + (int)(Math.random() * (((n-1)-0)+1));
        int cont = 0;
        /*
        for (int i = random1;i < n;i++)
        {
            if (myArray[i] <= t && t > 0)
            {
                System.out.println("Book read number "+i+" : timeBook["+myArray[i]+"]");
                System.out.println("My time is : "+t);
                t = t-myArray[i];
                cont++;
            }
            else
            {
                break;
            }
        }
        */
        int i = random1;
        while (true)
        {
            if(t <= 0)
            {
                break;
            }
            if(t-myArray[i] < 0)
            {
                break;
            }
            else
            {
                System.out.println("Book read number "+i+" : timeBook["+myArray[i]+"]");
                System.out.println("My time is : "+t);
                t = t -myArray[i];
                i = (i+1)% n;
                cont++;
            }
        }
        System.out.println("The number books read is:"+cont);
    }
}

