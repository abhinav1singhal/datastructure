package recursion;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String args[]){
      //  boolean b=check_if_sum_possible([2,4,6], 6);
    }

    public static String[] wellformed(int n){
        List<String> output_arr=new ArrayList<>();
        backTracking(output_arr, "",0,0,n);
        String[] result=new String[output_arr.size()];
        for(int i=0;i<output_arr.size();i++){
            result[i]=output_arr.get(i);

        }
        return result;

    }

    static void backTracking(List<String> output_arr, String currentString, int open,int close,int max){
        if(currentString.length()==max*2){
            output_arr.add(currentString);
            return;
        }

        if(open<max)
        backTracking( output_arr, currentString+"(",  open+1, close, max);
        if(close<open)
        backTracking( output_arr, currentString+")",  open, close+1, max);

    }

    static boolean check_if_sum_possible(long[] arr, long k) {
        
        boolean result=false;
        long sum=k;
        long n2=0;
        
        for(int i=0; i<arr.length;i++){
            n2=sum-arr[i]; 
            
            for(int j=i; j<arr.length;j++){
                if(arr[j]==n2)
                 result=true;
            }
            //arr contains n2 then return true
            
        }
    
        /*subset( arr, new long[], 0,sum, result);*/
        return result;
    }
}
