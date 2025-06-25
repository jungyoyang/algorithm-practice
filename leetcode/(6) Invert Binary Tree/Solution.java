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
    public TreeNode invertTree(TreeNode root) {
        // 1. 트리가 비어 있으면 그대로 종료
        if (root == null) return null;

        // 2. 왼쪽과 오른쪽 자식 트리를 각각 반전해서 변수에 저장
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // 3. 반전된 결과를 서로 바꿔 끼우기
        root.left = right;
        root.right = left;

        // 4. 반전이 끝난 트리의 루트를 반환
        return root;
    }
}