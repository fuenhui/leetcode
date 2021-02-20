/**
 * https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1290 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int getDecimalValue(ListNode head) {

        if (head == null) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
