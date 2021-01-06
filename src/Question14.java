/**
 * https://leetcode-cn.com/problems/longest-common-prefix/
 *
 * @author fuenhui
 * @date 2021/01/06
 */
public class Question14 {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        int min = 99999999;
        int minIndex = 0;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
                minIndex = i;
            }
        }

        int k;
        int flag = 0;
        for (k = 0; k < min; k++) {
            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].substring(0, k + 1).equals(strs[minIndex].substring(0, k + 1))) {
                    return strs[minIndex].substring(0, k);
                }
            }
        }
        return strs[minIndex];
    }
}