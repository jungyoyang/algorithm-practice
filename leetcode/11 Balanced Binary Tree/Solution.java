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
    public boolean isBalanced(TreeNode root) {
<<<<<<< HEAD
        return checkHeight(root) != -1;
    }

    // 높이를 재면서, 불균형한 경우 -1을 리턴하는 함수
    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;  // 왼쪽이 불균형

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1; // 오른쪽이 불균형

        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // 현재 노드가 불균형

        return 1 + Math.max(leftHeight, rightHeight); // 현재 노드의 높이 리턴
    }
}
=======
            if (root == null) return true;

            int left = getDepth(root.left);
            int right = getDepth(root.right);

            if (Math.abs(left - right) > 1) return false;

            return isBalanced(root.left) && isBalanced(root.right);
        }

    private int getDepth(TreeNode node) {
            if (node == null) return 0;
            return Math.max(getDepth(node.left), getDepth(node.right)) + 1;
        }
}
>>>>>>> 33501d0b6a6ce8483430f7ac78d0486c26e3aa70
