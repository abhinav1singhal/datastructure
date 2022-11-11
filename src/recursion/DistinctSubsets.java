package recursion;

import java.util.ArrayList;
import java.util.List;

public class DistinctSubsets {
    
    public static void main(String args[]){
        String input="aab";
        
        List<String> result=get_distinct_subsets(input);
        System.out.println(result);

    }

    public static List<String> get_distinct_subsets(String str) {
        List<String> result=new ArrayList<String>();
        ditinctSubset(str,0, "",result);
        return result;

        
    }
    public static void ditinctSubset(String str,int placed, String slate,List<String> result){

        if(placed>=str.length()){
            if(!result.contains(slate))
            result.add(new String(slate));
            return;
            
        }

        Character s=str.charAt(placed);
        slate=slate+s;
        ditinctSubset( str, placed+1,  slate,result);

        slate=slate.substring(0, slate.length()-1);//remove last charfrom string
        ditinctSubset( str, placed+1,  slate,result);

    }


        
}
