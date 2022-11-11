package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation {

    public static void main(String args[]){

        int[] num={1,2,3};
       // printAllRecursive(3,num,',');

        List<Integer> input=new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(2);
        List<List<Integer>> result=new ArrayList<>();
        permutationHelper(new ArrayList<>(input),0,result);
       
        System.out.println(result);

    }

    public static void permutationHelper(List<Integer> slate,int placed ,List<List<Integer>> result){

        if(placed>=slate.size()) //when reached end of slate
        {
            
            result.add(new ArrayList<>(slate));
return;
        }

        Set<Integer> intSet=new HashSet();

        for (int index=placed; index<slate.size();index++){
            if(!intSet.contains(slate.get(index)))
            
            {
                intSet.add(slate.get(index));
                Collections.swap(slate, placed, index);

            permutationHelper(slate,placed+1,result);
            
            Collections.swap(slate, placed, index);
            }
        }

    }
    
    public static void printAllRecursive(int n, int[] elements, char delimiter){

        if(n==1){
            printArray(elements);
        }
        else {
            for(int i = 0; i < n-1; i++) {
                printAllRecursive(n - 1, elements, delimiter);
                if(n % 2 == 0) {
                    swap(elements, i, n-1); 
                } else {
                    swap(elements, 0, n-1);
                }
            }
            printAllRecursive(n - 1, elements, delimiter);
        }

    }

    private static void swap(int[] input, int a, int b) {
        Integer tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }
    private static void printArray(int[] input) {
        System.out.print('\n');
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
    }

   
}
