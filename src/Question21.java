import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 *
 * @author fuenhui
 * @date 2021/01/06
 */
public class Question21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        ListNode n1 = l1;
        while (n1 != null) {
            list.add(n1.val);
            n1 = n1.next;
        }
        ListNode n2 = l2;
        while (n2 != null) {
            list.add(n2.val);
            n2 = n2.next;
        }
        Collections.sort(list);
        ListNode k = new ListNode();
        ListNode result = k;

        for (int i = 0; i < list.size(); i++) {
            k.val = list.get(i);
            if (i != list.size() - 1) {
                k.next = new ListNode();
                k = k.next;
            } else {
                k.next = null;
            }
        }
        return result;
    }
}

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