/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question237 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {

        ListNode current = node;
        ListNode last = node;

        while (current.next != null) {
            current.val = current.next.val;
            last = current;
            current = current.next;
        }
        last.next = null;
    }
}
