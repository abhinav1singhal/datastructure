package recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterPermutation {

    public static void main(String arg[]){

        String letter="a1z";
        List<String> stringList=letter_case_permutations(letter);

    }

    // Complete the function below.
public static List<String> letter_case_permutations(String str) {
        
    List<String> result=new ArrayList<>();
    permutationHelper(str,0,result);
    
    return result;
    
}

public static void permutationHelper(String slate, int index, List<String> result){
    
    if(index>=slate.length())
    {  result.add(new String(slate));//when done with the length
        return;
    }
    
   
        Character letter=slate.charAt(index);
        if(Character.isLetter(letter)){
            Character upperCase=Character.toUpperCase(letter); //converet letter to UpperCase
            String newString=slate.substring(0, index)+upperCase+slate.substring(index+1);

            permutationHelper(newString, index+1,result);
            
            Character lowerCase=Character.toLowerCase(letter);
            newString=slate.substring(0, index)+lowerCase+slate.substring(index+1);
            permutationHelper(newString, index+1,result);
        }
        else
        {
            permutationHelper(slate, index+1,result);
        }
        //Character lower=slate.get(index)
        //permutationHelper( slate,  index, result);
        //Swap(slate,placed,index);
    
}


    
}


