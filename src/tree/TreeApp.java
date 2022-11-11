package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreeApp {

    public TreeNode rootnode=null;
    
    public static void main(String arge[]){
        TreeApp treeApp=new TreeApp();
        
        treeApp.insert(3);
        treeApp.insert(9);
        treeApp.insert(20);
        treeApp.insert(15);
        treeApp.insert(7);
        
        System.out.println(treeApp.rootnode);
        List<Integer> bfsArray=BFS(treeApp.rootnode);
        System.out.println("BFS"+bfsArray);

        System.out.println(""+treeApp.findElement(treeApp.rootnode,5));

    }

    public static List<List<Integer>> level_order_traversal(TreeNode root) {
        
        Stack<List<Integer>> result=new Stack<>();
        
        
        if(root==null)
        return result;
        
        Queue queue=new LinkedList();
        queue.add(root);
       // List<Integer> temp=new ArrayList();
       // result.add(root.)
        
        while(!queue.isEmpty()){

            List<Integer> temp=new ArrayList();
            int queueSieze=queue.size();
            
             for(int i=0;i<queueSieze;i++)    {

            TreeNode node=(TreeNode)queue.poll();
             
               temp.add(node.label);
               
                if(node.left_ptr!=null)
                  queue.add(node.left_ptr);
                
                    
                if(node.right_ptr!=null)
                    queue.add(node.right_ptr); 
            }
            
            
            result.add(temp);
        }
        
        return result;
    }

    public static List<List<Integer>> reverse_level_order_traversal(TreeNode root) {
        
        List<List<Integer>> result=new ArrayList();
        Stack<List<Integer>> stackresult=new Stack();
        
        if(root==null)
        return result;
        
        Queue queue=new LinkedList();
        queue.add(root); //Add the root to the Queue

        
        
        while(!queue.isEmpty()){
            
            List<Integer> temp=new ArrayList(); //hold values of each pop from queue
            int queueuSize=queue.size();
            
            
            for(int i=0;i<queueuSize;i++){
                TreeNode node=(TreeNode)queue.poll();
                temp.add(node.label); //Add popped values from queue
                
                if(node.left_ptr!=null)
                    queue.add(node.left_ptr);
                
                if(node.right_ptr!=null)
                    queue.add(node.right_ptr);
                  
            }
            
            stackresult.add(temp);
            
            
        }
        
        while(!stackresult.isEmpty()){
            result.add(stackresult.pop());
        }
        
       
        
        return result;
        
        
    }

    public static List<Integer> BFS(TreeNode root){

        List<Integer> result=new ArrayList();
        
        if (root==null) 
        return result;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
           
            int size=queue.size();
            TreeNode popedNode=(TreeNode)queue.poll();

            if(popedNode.lefNode!=null)
            queue.add(popedNode.lefNode);

            
            if(popedNode.rightNode!=null)
            queue.add(popedNode.rightNode);

            result.add(popedNode.getValue());
            int i=Collections.max(result);
            
        }
        
        return result;



    }

    public static void DFS(TreeNode treeNode){

    }

    public void insert(int value){

        //this.rootnode=addNodeRecursively(this.rootnode,value);
        this.rootnode=addTreeNode(this.rootnode,value);

    }


    public TreeNode addTreeNode(TreeNode currentNode, int value){

        if(currentNode==null){
             return new TreeNode(value, null, null);
        }
        if(value>currentNode.getValue()){
            TreeNode leftNode=addTreeNode(currentNode.getLefNode(),value);
            currentNode.setLefNode(leftNode);
        }
        else{
            TreeNode rightNode=addTreeNode(currentNode.getRightNode(),value);
            currentNode.setRightNode(rightNode);
        }
        return currentNode;
    }

    public TreeNode deleteNode(TreeNode currentNode, int value){
        if(currentNode==null){
            return null;
        }
        if(currentNode.getValue()==value){
            //delete node
            if(currentNode.getLefNode()==null && currentNode.getRightNode()==null)
                return null;
            else{
                return currentNode.getLefNode()!=null? currentNode.getLefNode():currentNode.getRightNode();
            }    
        }
        if(value>currentNode.getValue()){
            currentNode.setLefNode(deleteNode(currentNode.getLefNode(), value));
        }
        else{
            currentNode.setRightNode(deleteNode(currentNode.getRightNode(), value));
        }
        return currentNode;

    }


    public boolean findElement(TreeNode currentNode, int value){

        if(currentNode==null){
            return false;
        }
        if(currentNode.getValue()==value){
            return true;
        }
        return value>currentNode.getValue()?
             findElement( currentNode.getLefNode(),  value)
            : findElement( currentNode.getRightNode(),  value);
             
    }

    public TreeNode getRootnode() {
        return rootnode;
    }

    public void setRootnode(TreeNode rootnode) {
        this.rootnode = rootnode;
    }
}
