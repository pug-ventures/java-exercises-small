//Udacity course "Intro to Java: Functional Programming"
//Problem set 4
//Question 4
//Write a method that determines the number of years necessary to save up 1 million
//Interest rate: 5% annually

import java.util.*;

public class YearsTillOneMillion {
    public static void main(String[] args)
    {
        System.out.println("How many € are in your account, currently?");
        Scanner in = new Scanner(System.in);
        double startingAmount = in.nextDouble();
        System.out.println("What's your account's annual interest rate?");
        double interestRate = in.nextDouble();
        int yearsNeeded = yearsToOneMillion(startingAmount, interestRate);
        System.out.println("It will take "
                + yearsNeeded
                + " years to reach 1,000,000 € with a "
                + interestRate
                + " rate");
    }
    public static int yearsToOneMillion(double initialBalance, double rate)
    {
        int years = 0;
        while (initialBalance < 1000000)
        {
            //Calculate yearly interest
            initialBalance = initialBalance + (initialBalance * rate);
            years++;
        }
        return years;
    }
}
