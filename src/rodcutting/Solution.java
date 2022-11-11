import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMinimumDifference' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY a
     *  2. STRING_ARRAY b
     */

    public static List<Integer> getMinimumDifference(List<String> str1, List<String> str2) {
    
    List<Integer> anagramIndexCounts=new ArrayList<>();
    
    //Traverse each element in the list, assuming size of s1 is same as s2
    for(int index=0;index<str1.size();index++){
        
    //Add counts in list for each set of calculation
    anagramIndexCounts.add(countMinimumDifference( str1.get(index),  str2.get(index)));
    }

    return anagramIndexCounts;
    }
    
    // Counts the number of manipulations required
    static int countMinimumDifference(String s1, String s2)
    {
        
        if(s1.length()!=s2.length())//If size is not same then return -1
            return -1;
            
        // crreate array for both string and calculate frequency of each character
        int count = 0;
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];
        
        for (int index = 0; index < s1.length(); index++)
        {
            char character = s1.charAt(index); 
            countS1[character-'a']++; //count for caharacter in string 
        }
        
        for (int index = 0; index < s2.length(); index++)
        {
            char character = s2.charAt(index);
            
            countS2[character-'a']++;
        }
        
        for (int index = 0; index < 26; index++)
        {
            System.out.println("countS1[index] "+countS1[index]+ "countS2 [index] " + countS2[index]);
            if (countS1[index] > countS2[index])
                count += countS1[index] - countS2[index];
        }
        return count;
    }
    
   

}

public class Solution {