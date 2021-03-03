import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 *
 * @author fuenhui
 * @date 2021/03/03
 */
public class Question160 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Map<ListNode, Integer> map = new HashMap<>();

        while (headA != null) {
            map.put(headA, 1);
            headA = headA.next;
        }

        while (headB != null) {

            if (map.containsKey(headB)) {
                return headB;
            } else {
                map.put(headB, 1);
                headB = headB.next;
            }
        }
        return null;
    }
}