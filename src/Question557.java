/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 *
 * @author fuenhui
 * @date 2021/03/07
 */
public class Question557 {

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            StringBuilder sb = new StringBuilder(strings[i]);
            sb.reverse();
            if (i == 0) {
                result.append(sb.toString());
            } else {
                result.append(" " + sb.toString());
            }
        }
        return result.toString();
    }
}
