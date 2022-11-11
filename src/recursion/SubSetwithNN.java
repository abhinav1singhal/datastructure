package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSetwithNN {
    public static void main(String args[]){
        List<List<Integer>> result= find_combinations(5, 2);

        System.out.println(result);

    }
    


public static List<List<Integer>> find_combinations(int n, int k) {
        
    List<List<Integer>> result =new ArrayList<>();
    List<Integer> number=new ArrayList();
    
    int subSetSize=k;
    int integerRange=n;
    
    for(int i=0;i<integerRange;i++){
        number.add(i+1);
    }
    
    if(n>=1 && n<=20){
        combinationHelper(number, new ArrayList(),0,subSetSize,result);
    }
    
    return result;
    
    
}

public static void combinationHelper(List<Integer> number, List<Integer> slate ,int index,int subSetSize,  List<List<Integer>> result){
    if(slate.size()==subSetSize )
   {    result.add(new ArrayList<>(slate));
        return;
    }

    if(index==number.size())
    return;
    
    int num=number.get(index);
    slate.add(num);//add number to slate
    

    combinationHelper( number,  slate , index+1, subSetSize,   result);
    
    slate.remove(slate.get(slate.size()-1));
    combinationHelper( number,  slate , index+1, subSetSize,   result);
}

}

