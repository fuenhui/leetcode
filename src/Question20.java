import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @author fuenhui
 * @date 2021/01/06
 */
public class Question20 {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == '[') {
                stack.push('[');
            } else if (s.charAt(i) == '{') {
                stack.push('{');
            } else if (s.charAt(i) == ')') {
                if (stack.size() <= 0 || !(stack.pop() == '(')) {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (stack.size() <= 0 || !(stack.pop() == '[')) {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (stack.size() <= 0 || !(stack.pop() == '{')) {
                    return false;
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
