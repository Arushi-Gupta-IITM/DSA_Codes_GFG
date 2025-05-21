/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static int getSize(Node node) {
        // code here
        if(node == null) return 0;
        int leftSize = getSize(node.left);
        int rightSize = getSize(node.right);
        
        return 1 + leftSize + rightSize;
    }
}
