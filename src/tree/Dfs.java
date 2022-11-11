package tree;

import java.util.*;

public class Dfs {
    

    public static void main(String agrs[]){

        TreeApp treeApp=new TreeApp();
        treeApp.insert(3);
        treeApp.insert(9);
        treeApp.insert(20);
        treeApp.insert(15);
        treeApp.insert(7);
       
       // TreeNode tree=createtree(treeList);
    }

    static Boolean path_sum(TreeNode root, int k){
        
       
        int target=k;
        
        return dfs(root,0,target); // node, current Sum, TargetSum
        
       
        
    }
    
    /**
     * SUM of the PATH
     * 
     */
    public static Boolean dfs(TreeNode node,int runningSum,int targetSum){
        
        if(node==null){
            return false;
        }
        
        //arrive at leaf node
        //Base condition
        if(node.left_ptr==null  &&  node.right_ptr==null ){
            
            if(targetSum==runningSum+node.val){
                return true;
            }
            else
            return false;
        }
        
        return dfs( node.left_ptr,runningSum+node.val, targetSum) ||
               dfs( node.right_ptr,runningSum+node.val, targetSum);
        
    }


   
}


/***
 * DFS to sum all paths
 */  public static void  dfs(TreeNode currentNode,int runningSum,List<Integer> slate, List<List<Integer>> result,int k){
        //base condition
        if(currentNode==null)
        return ;
       
        
        
        if(currentNode.left_ptr==null&&currentNode.right_ptr==null){
            
            if(k==runningSum+currentNode.val){
               
               slate.add(currentNode.val);
               result.add(new ArrayList<Integer>(slate));
               slate.remove(slate.size()-1);
                return;
            }
        }    
            
        runningSum+=currentNode.val;
        slate.add(currentNode.val);
        
        if(currentNode.left_ptr!=null){
            
            dfs( currentNode.left_ptr, runningSum,slate, result, k);
        }
         
         
        if(currentNode.right_ptr!=null){
          
            dfs( currentNode.right_ptr, runningSum,slate, result, k);
        }
            
        slate.remove(slate.size()-1);
        
        
    }
