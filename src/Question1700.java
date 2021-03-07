import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/number-of-students-unable-to-eat-lunch/
 *
 * @author fuenhui
 * @date 2021/03/07
 */
public class Question1700 {

    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            queue.add(students[i]);
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            stack.add(sandwiches[i]);
        }

        while (!stack.isEmpty() && queue.contains(stack.peek())) {
            if (queue.peek().equals(stack.peek())) {
                queue.poll();
                stack.pop();
            } else {
                Integer n = queue.poll();
                queue.add(n);
            }
        }

        return queue.size();
    }
}
