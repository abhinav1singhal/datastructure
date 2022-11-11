package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSetSolution {

    public static void main(String args[]){

        List<Integer> input=new ArrayList();
        input.add(1);
        input.add(2);
        input.add(3);
        
        List<List<Integer>> results=new ArrayList<List<Integer>>();

        //subsets(0, input, new ArrayList<Integer>(), results);

        helper(input,0, new ArrayList<>(), results);
        
        System.out.println(results);
    
    }
public static void subsets(int index, 
                                List<Integer> input,
                                 List<Integer> current, 
                                 List<List<Integer>>subsets){
     
subsets.add(new ArrayList<>(current));

for(int i=index; i< input.size();i++){ 

current.add(input.get(i));
subsets(i+1, input, current, subsets);
current.remove(current.size()-1);

}

                                }

    public static void helper(List<Integer> input, int index, List<Integer> slate, List<List<Integer>> results){


        if(index>=input.size()){
            /*List<Integer> list=new ArrayList<>();
            for(Integer s:slate)
            list.add(s);
*/
            results.add(new ArrayList<>(slate));
            return;
        }

        Integer num=input.get(index);
        slate.add(num);
        helper( input,  index+1, slate, results);

        slate.remove(slate.size()-1);//remove last element
        helper( input,  index+1, slate, results);

    }


    
}
