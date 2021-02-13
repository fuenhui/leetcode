/**
 * https://leetcode-cn.com/problems/symmetric-tree/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question101 {

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

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return judge(root.left, root.right);
    }

    /**
     * 判断左右子树是否对称
     *
     * @param left
     * @param right
     * @return
     */
    public boolean judge(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null && right != null) {
            return false;
        } else if (left != null && right == null) {
            return false;
        } else {
            return left.val == right.val && judge(left.left, right.right) && judge(left.right, right.left);
        }
    }
}
