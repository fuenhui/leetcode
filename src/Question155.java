import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/min-stack/
 *
 * @author fuenhui
 * @date 2021/03/03
 */
public class Question155 {

    Stack<Long> stack = new Stack<>();

    public Question155() {
    }

    public void push(long x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public long top() {
        return stack.peek();
    }

    public long getMin() {

        long min = stack.get(0);

        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) < min) {
                min = stack.get(i);
            }
        }

        return min;
    }
}
