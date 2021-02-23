import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 *
 * @author fuenhui
 * @date 2021/02/23
 */
public class Question2 {

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        ListNode node = l1;
        while (node != null) {
            stack1.add(node.val);
            node = node.next;
        }
        StringBuilder sb1 = new StringBuilder();
        while (!stack1.isEmpty()) {
            sb1.append("" + stack1.pop());
        }
        sb1 = sb1.reverse();

        node = l2;
        while (node != null) {
            stack2.add(node.val);
            node = node.next;
        }
        StringBuilder sb2 = new StringBuilder();
        while (!stack2.isEmpty()) {
            sb2.append("" + stack2.pop());
        }
        sb2 = sb2.reverse();

        if (sb1.length() > sb2.length()) {
            int cut = sb1.length() - sb2.length();
            for (int i = 0; i < cut; i++) {
                sb2.append("0");
            }
        } else {
            int cut = sb2.length() - sb1.length();
            for (int i = 0; i < cut; i++) {
                sb1.append("0");
            }
        }

        StringBuilder result = new StringBuilder();
        int tp = 0;

        for (int i = 0; i < sb1.length(); i++) {
            int add = (sb1.charAt(i) - '0') + (sb2.charAt(i) - '0') + tp;
            if (add >= 10) {
                result.append("" + (add - 10));
                tp = 1;
            } else {
                result.append("" + add);
                tp = 0;
            }
        }

        if (tp == 1) {
            result.append("1");
        }

        ListNode rt = new ListNode();
        ListNode first = rt;
        for (int i = 0; i < result.length(); i++) {
            rt.next = new ListNode(result.charAt(i) - '0');
            rt = rt.next;
        }

        return first.next;
    }
}
