//Udacity course "Intro to Java: Functional Programming"
//Problem set 4
//Question 5
//Write a method that reverses the order of elements in a String array

public class ReverseStringList {
    public static void main(String[] args)
    {
        String[] daysOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};
        printInReverse(daysOfWeek);
    }
    public static void printInReverse(String[] StringArray)
    {
        for (int i = StringArray.length - 1; i >= 0; i--)
        {
            System.out.println(StringArray[i]);
        }
    }
}
