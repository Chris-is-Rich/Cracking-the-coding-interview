import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {

        //Create a copy of the first string to manipulate, firstCopy - to manipulate, first - to iterate
        String firstCopy = first;
        //iterate over every character in first string
        for(char c : first.toCharArray()) {
            //if second string contains the character it will return a 0 or positive value depending on position, else -1
            if(second.indexOf(c) != -1) {
                //if second string DOES contain character from first string
                //delete the first found character match from firstCopy
                firstCopy = firstCopy.replaceFirst(c + "", "");
                //delete the first found character match from the second string
                second = second.replaceFirst(c + "", "");
            }
        }
        //After this for() loop what we have left are characters in both strings not found in each other.
        //So we would have to delete this many characters to get the anagram.
        // firstCopy.length() + second.length are the number of deletions needed.
        return firstCopy.length() + second.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
