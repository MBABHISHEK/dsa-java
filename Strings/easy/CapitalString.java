import java.util.* ;
import java.io.*; 
public class Solution{
	public static String convertString(String str) {
            // Write your code here
        StringBuilder result = new StringBuilder();

// Split the input string into words
       String[] words = str.split(" ");

       for (String word : words) {
        if (!word.isEmpty()) { // Check if the word is not empty
        result.append(Character.toUpperCase(word.charAt(0)));
        if (word.length() > 1) {
            result.append(word.substring(1));
        }
        result.append(" "); // Add a space between words
    }
}

// Remove the trailing space and return the result
return result.toString().trim();
    
    }
    }
