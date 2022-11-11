package recursion;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String args[]){

        String  input ="a12b";

        List<String> results=new ArrayList<>();

        for(int index=0;index<input.length();index++){
            convertStringtoUpperAndLower(input, index,results);
        }

        //caseConversion( input, 0, new char[input.length()],  results);
        
    }
    public static void convertStringtoUpperAndLower(String input, int index,List<String> results){
    
        Character ch=input.charAt(index);
        if(Character.isLetter(ch)){

            String toUpperString=convertToUpper(input,index,ch);

            String toLowerString=convertToLower(input,index,ch);

            System.out.println(toUpperString);
            
            System.out.println(toLowerString);
        }

    }
    static String convertToUpper(String input, int index, char ch){

        Character uppercasCharacter=Character.toUpperCase(ch);
        String subString="";
        if(index==0)
        {
             subString=subString+uppercasCharacter;
             return subString;
        }
        if(index>0)
        subString=subString+input.substring(0, index-1)+uppercasCharacter;
        if(index<input.length())
        subString=subString+input.substring(index+1, input.length());

         return subString;


    }

    static String convertToLower(String input, int index, char ch){

        Character lowerCaseCharacter=Character.toLowerCase(ch);
        
        return input.substring(0, index-1)+lowerCaseCharacter+input.substring(index+1, input.length());

    }

    public static void caseConversion(String input,  int index, char[] slate, List<String> results){
       if(index>=input.length()){
           System.out.println(slate);
            results.add(new String(slate));
            return;
        }
        char ch=input.charAt(index);
        if(Character.isLetter(ch)){
            System.out.println(slate);
            slate[index]=Character.toLowerCase(ch);
            caseConversion( input,   index,  slate,  results);
            slate[index]=Character.toUpperCase(ch);
            caseConversion( input,   index,  slate,  results);
        }
        else{
            slate[index]=ch;
            caseConversion( input,   index++,  slate,  results);
        }
        
    }
    
}
