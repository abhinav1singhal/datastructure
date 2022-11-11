package recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PermUniqueLetters {

public static void main(String args[]){

    List<Integer> arr=new ArrayList<>();
    
    arr.add(1);
    arr.add(2);
    arr.add(3);
    List<List<Integer>> result=get_permutations(arr);

    System.out.println(result);
}

static List<List<Integer>> get_permutations(List<Integer> arr) {

List<List<Integer>> result=new ArrayList<>();
permHelper(arr, 0, result);
return result;
}

public static void permHelper(List<Integer> slate, int placed, List<List<Integer>> result){
if(placed>=slate.size())
{
    //base condition
    result.add(new ArrayList<Integer>(slate));
    return;
}

for(int index=placed; index<slate.size();index++){

   Collections.swap(slate, placed, index);

   permHelper( slate,  placed+1,  result);

   Collections.swap(slate, placed, index);


}

}

    
}
