/**
 * https://leetcode-cn.com/problems/path-sum/
 *
 * @author fuenhui
 * @date 2021/03/01
 */
public class Question112 {

    class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int flag = 0;

    private void sum(TreeNode root, int sum, int target) {

        if (root.left == null && root.right == null) {
            if (sum + root.val == target) {
                flag = 1;
            }
            return;
        } else {
            if (root.left != null)
                sum(root.left, sum + root.val, target);
            if (root.right != null)
                sum(root.right, sum + root.val, target);
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }
        sum(root, 0, targetSum);
        return flag == 1;
    }
}