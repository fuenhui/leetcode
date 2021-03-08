import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/di-string-match/
 *
 * @author fuenhui
 * @date 2021/03/08
 */
public class Question942 {

    public int[] diStringMatch(String S) {

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < S.length() + 1; i++) {
            num.add(i);
        }
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                result.add(num.get(0));
                num.remove(0);
            } else {
                result.add(num.get(num.size() - 1));
                num.remove(num.size() - 1);
            }
        }

        result.add(num.get(0));

        return result.stream().mapToInt(i -> i).toArray();
    }
}
