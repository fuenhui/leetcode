/**
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 *
 * @author fuenhui
 * @date 2021/03/01
 */
public class Question111 {

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

    int min = 99999;

    private void loop(TreeNode root, int depth) {

        if (root.left == null && root.right == null) {
            if (depth < min) {
                min = depth;
            }
            return;
        }

        if (root.left != null) {
            loop(root.left, depth + 1);
        }

        if (root.right != null) {
            loop(root.right, depth + 1);
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        loop(root, 1);
        return min;
    }
}
