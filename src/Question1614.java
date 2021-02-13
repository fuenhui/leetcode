import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question1614 {

    public int maxDepth(String s) {

        Stack<Character> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add('(');
                if (stack.size() > max) {
                    max = stack.size();
                }
            } else if (s.charAt(i) == ')') {
                stack.pop();
            }
        }

        return max;
    }
}