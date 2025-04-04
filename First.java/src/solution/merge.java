package solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.next(); 
        
        System.out.print("Enter second word: ");
        String word2 = sc.next();

        sc.close(); 

      
        String mergedString = mergeAlternately(word1, word2);
        System.out.println("Merged String: " + mergedString);
    }

   
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
