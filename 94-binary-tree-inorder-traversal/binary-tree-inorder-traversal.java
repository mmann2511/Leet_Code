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
    public List<Integer> inorderTraversal(TreeNode root) {
        // inorder means LNR (left, node, right)
        List<Integer> result = new ArrayList<>();

        // Now traverse through tree and append to List
        recursion(root, result);

        // after recursion complete return list
        return result;
    }

    // doesn't return anything, just traversing and appends to List<Integer>
    private void recursion(TreeNode root, List<Integer> result) {
            // base case
            if (root == null) {
                return;
                // stop and go back
            }

            // Inorder LNR
            recursion(root.left, result);
            result.add(root.val);
            recursion(root.right, result);
    }   
}