/**
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question104 {

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

    int max = -1;

    public int maxDepth(TreeNode root) {
        int layer = 0;
        post(root, layer);
        return max;
    }

    public void post(TreeNode t, int layer) {

        if (t != null) {
            post(t.left, layer + 1);
            post(t.right, layer + 1);
        } else {
            if (layer > max) {
                max = layer;
            }
        }
    }
}
