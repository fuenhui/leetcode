/**
 * https://leetcode-cn.com/problems/merge-strings-alternately/
 *
 * @author fuenhui
 * @date 2021/03/04
 */
public class Question1768 {

    public String mergeAlternately(String word1, String word2) {

        if (word1 == null || word1.length() == 0) {
            return word2;
        }

        if (word2 == null || word2.length() == 0) {
            return word1;
        }

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;
        int flag = 0;

        while (word1.length() + word2.length() != sb.length()) {
            if (flag == 0) {
                if (i < word1.length()) {
                    sb.append(word1.charAt(i));
                }
                flag = 1;
                i++;
            } else {
                if (j < word2.length()) {
                    sb.append(word2.charAt(j));
                }
                flag = 0;
                j++;
            }
        }

        return sb.toString();
    }
}
