package Exercises;

import java.util.Scanner;
import java.lang.Math;
public class Exercise3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] myArray = new int[n][m];
        int columnWidth = 5;
        int count = 1;
        for (int i = 0 ; i< n; i++){
            for (int j = 0 ; j < m;j++){
                if(i > 0)
                {
                    myArray[i][j] = myArray[i-1][j] + 1;
                    //count = myArray[i-1][j] + count;
                    System.out.printf("%-" + columnWidth + "d", myArray[i][j]);
                }
                else
                {
                    myArray[i][j] = count;
                    System.out.printf("%-" + columnWidth + "d", myArray[i][j]);
                    count+=3;
                }
            }
            System.out.print("\n");
        }
        System.out.println();
        System.out.println("Part 2 Exercise 3_11: Row enumeration");

        int x = sc.nextInt();
        int[][] myArray2 = new int[n][m];
        int icont = 1;
        for (int i = 0;i < n;i++)
        {
            for (int j = 0; j < m;j++)
            {
                myArray2[i][j] = icont;
                System.out.printf("%-" + columnWidth + "d", myArray2[i][j]);
                icont++;
            }
            System.out.print("\n");
        }
        // 7
        System.out.println();
        int newcont = 0;
        int numberfind =-1;
        boolean brokenAll = false;
        for (int j = 0; j < m;j++)
        {
            for (int i = 0; i < n ; i++)
            {
                System.out.print(myArray2[i][j]+" ");
                if(newcont < x-1)
                {

                    newcont++;
                }
                else
                {
                    numberfind = myArray2[i][j];
                    brokenAll = true;
                    break;
                }
            }
            if (brokenAll)
            {
                break;
            }
        }
        System.out.println();
        System.out.println("The number "+x+" and index "+(x-1)+" in matrix with row enumeration is : "+numberfind);


    }
}

