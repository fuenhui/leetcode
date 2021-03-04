import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/remove-outermost-parentheses/
 *
 * @author fuenhui
 * @date 2021/03/04
 */
public class Question1021 {

    public String removeOuterParentheses(String S) {

        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                if (stack.size() == 0) {
                    list.add(i);
                }
                stack.push(1);
            } else {
                stack.pop();
                if (stack.size() == 0) {
                    list.add(i);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (!list.contains(i)) {
                sb.append(S.charAt(i));
            }
        }

        return sb.toString();
    }
}