import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/number-of-recent-calls/
 *
 * @author fuenhui
 * @date 2021/03/08
 */
public class Question933 {

    List<Integer> time;

    public Question933() {
        time = new ArrayList<>();
    }

    public int ping(int t) {

        time.add(t);
        int count = 0;
        for (int i = time.size() - 1; i >= 0; i--) {
            if (time.get(i) >= t - 3000 && time.get(i) <= t) {
                count++;
            }
        }
        return count;
    }
}
