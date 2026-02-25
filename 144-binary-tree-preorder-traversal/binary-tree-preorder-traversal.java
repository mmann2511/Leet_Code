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
    public List<Integer> preorderTraversal(TreeNode root) {
        // preorder is NLR
        List<Integer> result = new ArrayList<>();

        recursion(root, result);

        return result;
    }

    private void recursion(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        // NLR
        result.add(root.val);
        recursion(root.left, result);
        recursion(root.right, result);
    }
}