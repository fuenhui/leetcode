/**
 * https://leetcode-cn.com/problems/shuffle-string/
 *
 * @author fuenhui
 * @date 2021/03/04
 */
public class Question1528 {

    public String restoreString(String s, int[] indices) {

        char[] c = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            c[indices[i]] = s.charAt(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(c[i]);
        }

        return sb.toString();
    }
}
