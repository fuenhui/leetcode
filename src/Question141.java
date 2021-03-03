import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 *
 * @author fuenhui
 * @date 2021/03/03
 */
public class Question141 {

    class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    Map<ListNode, Integer> map = new HashMap<>();

    public boolean hasCycle(ListNode head) {

        while (head != null) {

            if (map.containsKey(head)) {
                return true;
            }
            map.put(head, 1);
            head = head.next;
        }

        return false;
    }
}
