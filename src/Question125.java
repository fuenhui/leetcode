import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-palindrome/
 *
 * @author fuenhui
 * @date 2021/03/02
 */
public class Question125 {

    public boolean isPalindrome(String s) {

        StringBuilder ss = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9') ) {
                ss.append(s.charAt(i));
            }
        }

        String sb = ss.toString().toLowerCase();
        System.out.println(sb);

        if (sb.length() % 2 == 0) {
            for (int i = 0; i < sb.length(); i++) {
                if (i < sb.length() / 2) {
                    stack.push(sb.charAt(i));
                } else {
                    if (!(stack.pop() == sb.charAt(i))) {
                        return false;
                    }
                }
            }
        } else {

            for (int i = 0; i < sb.length(); i++) {
                if (i < sb.length() / 2) {
                    stack.push(sb.charAt(i));
                } else if (i > sb.length() / 2) {
                    if (!(stack.pop() == sb.charAt(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
