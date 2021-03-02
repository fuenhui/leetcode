import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 *
 * @author fuenhui
 * @date 2021/03/01
 * <p>
 * abcabc
 * i00j00
 */
public class Question3 {

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {
                flag = 1;
                break;
            }
            map1.put(s.charAt(i), 1);
        }
        if (flag == 0) {
            return s.length();
        }

        int i = 0;
        int j = 0;
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (j != s.length()) {
            if (!map.containsKey(s.charAt(j))) {
                if (j != s.length() - 1) {
                    map.put(s.charAt(j), 1);
                } else {
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                    }
                }
                j++;
            } else {

                if (j - i > max) {
                    max = j - i;
                }

                for (int k = i; k < j; k++) {
                    map.remove(s.charAt(k));
                    if (s.charAt(k) == s.charAt(j)) {
                        i = k + 1;
                        break;
                    }
                }
            }
        }

        return max;
    }
}
