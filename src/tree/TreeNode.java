package tree;

public class TreeNode {

    int value;
    TreeNode lefNode;
    TreeNode rightNode;

    public TreeNode(int value, TreeNode lefNode, TreeNode rightNode) {
        this.value = value;
        this.lefNode = lefNode;
        this.rightNode = rightNode;
    }
    
  
    public TreeNode getLefNode() {
        return lefNode;
    }

    public void setLefNode(TreeNode lefNode) {
        this.lefNode = lefNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode [lefNode=" + lefNode + ", rightNode=" + rightNode + ", value=" + value + "]";
    }

   
    
    
}
