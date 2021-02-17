import java.util.*;

/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 *
 * @author fuenhui
 * @date 2021/02/17
 */
public class Question107 {

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        LinkedList<List<Integer>> result = new LinkedList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                list.add(t.val);
                if (t.left != null)
                    queue.add(t.left);
                if (t.right != null)
                    queue.add(t.right);
            }
            result.addFirst(list);
        }

        return result;
    }
}
