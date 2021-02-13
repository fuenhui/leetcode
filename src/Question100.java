/**
 * https://leetcode-cn.com/problems/same-tree/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question100 {

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

    public boolean isSameTree(TreeNode p, TreeNode q) {

        StringBuilder pre1 = new StringBuilder();
        StringBuilder center1 = new StringBuilder();
        StringBuilder post1 = new StringBuilder();
        StringBuilder pre2 = new StringBuilder();
        StringBuilder center2 = new StringBuilder();
        StringBuilder post2 = new StringBuilder();

        pre(p, pre1);
        center(p, center1);
        post(p, post1);
        pre(q, pre2);
        center(q, center2);
        post(q, post2);

        return pre1.toString().equals(pre2.toString()) && center1.toString().equals(center2.toString())
                && post1.toString().equals(post2.toString());
    }

    public void pre(TreeNode t, StringBuilder s) {

        if (t != null) {
            s.append(t.val + " ");
            pre(t.left, s);
            pre(t.right, s);
        } else {
            s.append("null");
        }
    }

    public void center(TreeNode t, StringBuilder s) {

        if (t != null) {
            center(t.left, s);
            s.append(t.val + " ");
            center(t.right, s);
        } else {
            s.append("null");
        }
    }

    public void post(TreeNode t, StringBuilder s) {

        if (t != null) {
            post(t.left, s);
            post(t.right, s);
            s.append(t.val + " ");
        } else {
            s.append("null");
        }
    }
}