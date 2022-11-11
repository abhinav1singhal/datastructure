package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
public class Solution {


    public static void main (String args[]){

        ArrayList<Integer> leftArrayList=new ArrayList<>();
        leftArrayList.add(1);
        leftArrayList.add(3);
        leftArrayList.add(5);
        ArrayList<Integer> rightArrayList=new ArrayList<>();

        rightArrayList.add(2);
        rightArrayList.add(4);
        rightArrayList.add(6);
        rightArrayList.add(0);
        rightArrayList.add(0);
        rightArrayList.add(0);

        leftArrayList.stream()
                    .sorted()
                    .forEach(System.out::println);

        rightArrayList.stream()
        
                    .sorted()
                    .forEach(System.out::println);


    }
    
}*/


class Result {

    
    public static void fizzBuzz(int n) {
   
    
     for (int number = 1; number <= n; number++) {
         
        boolean isMultipleOf3 = (number % 3 == 0);
        boolean isMultipleOf5 = (number % 5 == 0);
        
        if (isMultipleOf3 && isMultipleOf5) {
                // Multiple of both 3 and 5
                System.out.println("FizzBuzz");
            } else if (isMultipleOf3) {
                // Multiple of 3
                System.out.println("Fizz");
            } else if (isMultipleOf5) {
                // Multiple of 5
                System.out.println("Buzz");
            } else {
                // Not Multiple of both 3 and 5
                System.out.println(number);
            }
         

        }
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
