import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/self-dividing-numbers/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question728 {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            String s = "" + i;
            int flag = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '0' || i % (s.charAt(j) - '0') != 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
