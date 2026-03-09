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
    public int countNodes(TreeNode root) {
        int leftHeight = 0;
        TreeNode current = root;
        while (current != null) {
            leftHeight++;
            current = current.left;
        } 

        int rightHeight = 0;
        current = root;
        while (current != null) {
            rightHeight++;
            current = current.right;
        }

        if (leftHeight == rightHeight) {
            return (int) Math.pow(2, rightHeight) - 1;
        }
        else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }    
    }
}