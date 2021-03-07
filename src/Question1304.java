import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero/
 *
 * @author fuenhui
 * @date 2021/03/07
 */
public class Question1304 {

    public int[] sumZero(int n) {

        List<Integer> result = new ArrayList<>();
        if (n % 2 == 0) {
            for (int i = 1; i <= n / 2; i++) {
                result.add(i);
                result.add(-i);
            }
        } else {
            for (int i = 1; i <= n / 2; i++) {
                result.add(i);
                result.add(-i);
            }
            result.add(0);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
