package recursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneLetters {


    public static void main(String args[]){
     
        String digits="23";
        List<String> result=phoneNumberPermutation(  digits);
  
    }

    public static List<String> phoneNumberPermutation( String digits){
        List<String> result=new ArrayList<>();

        if(digits.length()==0||digits==null){
            return result;
        }

       
        String[] mapping={
            "0",//0
            "1",
            "abc",//2
            "def",//3
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        phoneNumbersCombination(digits,mapping,"", 0, result);

System.out.println(result);
        return result; 

    }

    //digits="123"
    public static void  phoneNumbersCombination(String digits,String[] mapping,String slate, int placed, List<String>result){

        if(placed==digits.length()){
            result.add(slate);
            return;
        }

        String letters=mapping[digits.charAt(placed)-'0'];
        for(int index=0;index<letters.length();index++){
           
            phoneNumbersCombination( digits,mapping, slate+letters.charAt(index),  placed+1, result);
        }

   }






    
}
