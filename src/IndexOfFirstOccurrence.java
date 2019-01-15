//Udacity course "Intro to Java: Functional Programming"
//Problem set 4
//Question 3
//Write a method that returns the lowest index of a target string in a String array

public class IndexOfFirstOccurrence {
    public static void main(String[] args)
    {
        String[] sentence = {"Learning", "is", "Java", "fun."};
        int indexOfWordJava = indexOfFirstOccurrence(sentence, "Java");
        System.out.println(indexOfWordJava);
    }

    /**
     * Looks up the first instance of a string in an array and returns its index
     * @param stringArray array of strings to be looked through
     * @param target target string which should be looked for in the array
     * @return int index of first occurrence of target in array
     */
    public static int indexOfFirstOccurrence(String[] stringArray, String target)
    {
        // Go through each element in stringArray
        for (int i = 0; i < stringArray.length; i++)
        {
            // Get the string stored at stringArray[i]
            String currentString = stringArray[i];
            if (currentString.equals(target))
            {
                return i;
            }
        }
        return -1;
    }
}
