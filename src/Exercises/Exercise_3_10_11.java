package Exercises;


import java.util.Scanner;

public class Exercise_3_10_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while (n < 1)
        {
            System.out.print("Enter your Array Size :");
            n = sc.nextInt();
        }

        System.out.print("Enter your time :");
        int t = sc.nextInt();

        int[] myArray = new int[n];
        for (int i = 0; i < n;i++)
        {
            System.out.print("Enter your element "+i+" :");
            myArray[i] = sc.nextInt();
        }

        int maxReadBooks = 0;
        for (int i = 0 ; i< myArray.length;i++)
        {
            int newCont = 0;
            int newi = i;
            int newtime = t;
            while (newi < myArray.length && newtime - myArray[newi] >= 0)
            {
                if(newtime == 0)
                {
                    break;
                }
                newCont++;
                newtime = newtime - myArray[newi];
                newi++;
            }
            if(newCont > maxReadBooks)
            {
                maxReadBooks = newCont;
            }
        }
        System.out.println("My max read books is : "+maxReadBooks);
    }
}
