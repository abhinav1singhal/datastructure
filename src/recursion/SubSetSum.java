package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSetSum {

    public static void main(String args[]){

        List<Integer> input=new ArrayList<>();
        input.add(2);
        input.add(3);
        input.add(5);

        int sum=5;
        
        List<List<Integer>> result=new ArrayList<>();
        
        subSetSumHelper(input,sum,0, 0, new ArrayList(),result);

    }
    public static void subSetSumHelper(List<Integer> input,int sum, int slateSum, int index, List<Integer> slate, List<List<Integer>> result){

        
        if(index>=slate.size())//Hanlde sum condition and subsets
            result.add(new ArrayList<>(slate));

        //move to next item in input
        int number=input.get(index);
        slate.add(number); //add to temp slate
        slateSum+= number;
        subSetSumHelper(input, index+1, sum, slate, result);
        slate.remove(slate.size()-1);
        subSetSumHelper(input, index+1, sum, slate, result);

    }
    
}
