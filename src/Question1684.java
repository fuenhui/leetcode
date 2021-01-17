/**
 * https://leetcode-cn.com/problems/count-the-number-of-consistent-strings/
 *
 * @author fuenhui
 * @date 2021/01/17
 */
public class Question1684 {

    public int countConsistentStrings(String allowed, String[] words) {

        char[] chars = allowed.toCharArray();
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            boolean t = true;
            for (int j = 0; j < words[i].length(); j++) {
                boolean b = false;
                for (int k = 0; k < chars.length; k++) {
                    if (words[i].toCharArray()[j] == chars[k]) {
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    t = false;
                    break;
                }
            }
            if (t) {
                count++;
            }
        }

        return count;
    }
}
