//Udacity course "Intro to Java: Functional Programming"
//Problem set 4
//Question 6
//Write a method that finds the range covered by an array of integers

public class FindArrayRange {
    public static void main(String[] args)
    {
        int[] myArray = {1,3,-7,8,4};
        int myArrayRange = findRange(myArray);
        System.out.println("Array range is " + myArrayRange);
    }
    public static int findRange(int[] IntArray)
    {
        int smallestInt = IntArray[0];
        int largestInt = IntArray[0];

        if (IntArray.length == 0)
        {
            return -1;
        }
        else
        {
            for (int i = 1; i < IntArray.length; i++)
            {
                if (smallestInt > IntArray[i])
                {
                    smallestInt = IntArray[i];
                }
                else if (largestInt < IntArray[i])
                {
                    largestInt = IntArray[i];
                }
            }
        }
        return largestInt - smallestInt;
    }
}
