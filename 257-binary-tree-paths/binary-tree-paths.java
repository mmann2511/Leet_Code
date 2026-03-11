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
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        String path = "";

        recursion(root, result, path);

        return result;
    }

    private void recursion(TreeNode root, List<String> result, String path) {
        if (root == null) {
            return;
        }

        
        

        // NLR
        path += Integer.toString(root.val); // Node

        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }

        path += "->";
        recursion(root.left, result, path); // Left
        recursion(root.right, result, path); // Right


    }
}