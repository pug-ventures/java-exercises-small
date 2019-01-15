//Udacity course "Intro to Java: Functional Programming"
//Problem set 4
//Question 2
//Write a method that returns the product of all numbers from 1 to given number n
//e.g. factorial(5) should return 120 (1*2*3*4*5)

import java.util.*;

public class CalculateFactorial {
    public static void main(String[] args)
    {
        System.out.println("What number would you like to calculate the factorial of?\n" +
                "Only use integers from 1 to 20!");
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();
        long result = factorial(inputNumber);
        System.out.printf("The factorial of " + inputNumber + " is " + result);
    }
    /**
     * Factorial calculates factorial of any given integer between 1 and 20
     * @param n integer to be calculated the factorial of
     * @return long, integer with the resulting product
     */
    public static long factorial(int n)
    {
        long product = 1;
        for (long i = 1; i <= n; i++)
        {
            product = product * i;
        }
        return product;
    }
}
