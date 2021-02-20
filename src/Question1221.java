import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1221 {

    public int balancedStringSplit(String s) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int flag = 1;
        for (int i = 0; i < s.length(); i++) {
            if (stack.size() == 0) {
                if (s.charAt(i) == 'R') {
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
            if (s.charAt(i) == 'R' && flag == 1) {
                stack.push(1);
            } else if (s.charAt(i) == 'R' && flag == 0) {
                stack.pop();
            } else if (s.charAt(i) == 'L' && flag == 0) {
                stack.push(1);
            } else {
                stack.pop();
            }
            if (stack.size() == 0) {
                count++;
            }
        }
        return count;
    }
}
