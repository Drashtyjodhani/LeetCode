/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int min(TreeNode root){
        if(root==null)
        {
            return 0;
        }
        int leftmin,rightmin;
        leftmin=2147483647;
        rightmin=2147483647;
        if(root.left!=null && root.right!=null)
        {
             leftmin=min(root.left);
             rightmin=min(root.right);
        }
        else if(root.left==null && root.right!=null)
        {
            rightmin=min(root.right);
        }
        else if(root.left!=null && root.right==null)
        {
            leftmin=min(root.left);
        }
        else{
            return 1;
        }
        return Math.min(leftmin,rightmin)+1;
    }
    public int minDepth(TreeNode root) {
        return min(root);
    }
}