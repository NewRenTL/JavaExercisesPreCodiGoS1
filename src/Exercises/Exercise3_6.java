package Exercises;

import java.util.Scanner;

public class Exercise3_6 {
    static boolean isPrime(int x)
    {
        if(x <= 1)
        {
            return false;
        }
        for (int i = 2;i<=x/2;i++)
        {
            if(x%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int cont = 0;
        int cantNumber = sc.nextInt();
        while (cont < cantNumber)
        {
            if(isPrime(i))
            {
                System.out.print(i +",");
                sum+=i;
                cont++;
            }
            i++;
        }
        System.out.print("\n");
        System.out.println("La suma de los "+cantNumber+" primeros numeros primos es:"+sum);
    }
}
