/**
 * https://leetcode-cn.com/problems/palindrome-number/
 *
 * @author fuenhui
 * @date 2021/01/06
 */
public class Question9 {

    public boolean isPalindrome(int x) {
        String s = "" + x;
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
