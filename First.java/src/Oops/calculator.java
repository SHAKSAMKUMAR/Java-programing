package solution;

import java.util.Scanner;

public class Solution { // Class names should start with uppercase

    public static void main(String[] args) { // Corrected main method signature
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.next(); // Fixed data type
        
        System.out.print("Enter second word: ");
        String word2 = sc.next();

        sc.close(); // Close the scanner to prevent resource leaks

        // Call the merge function and print the result
        String mergedString = mergeAlternately(word1, word2);
        System.out.println("Merged String: " + mergedString);
    }

    // Function to merge two strings in alternating order
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                merged.append(word2.charAt(j));
                j++;
            }
        }

        return merged.toString();
    }
}
