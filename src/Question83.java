/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question83 {

    class ListNode {
        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null) {
            if (current.next != null && current.next.val == current.val) {
                current.next = current.next.next;
                continue;
            }
            current = current.next;
        }

        return head;
    }
}
