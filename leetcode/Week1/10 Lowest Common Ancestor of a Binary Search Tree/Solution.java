/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    while (root != null) {
        if (p.val < root.val && q.val < root.val) {
            // 둘 다 왼쪽
            root = root.left;
        } else if (p.val > root.val && q.val > root.val) {
            // 둘 다 오른쪽
            root = root.right;
        } else {
            // 하나는 왼쪽, 하나는 오른쪽 → 여기가 LCA!
            return root;
        }
    }
    return null;
}

}