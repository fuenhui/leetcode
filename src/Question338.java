import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/counting-bits/
 *
 * @author fuenhui
 * @date 2021/03/03
 */
public class Question338 {

    public int[] countBits(int num) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= num; i++) {

            int count = 0;
            String s = Integer.toBinaryString(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    count++;
                }
            }
            list.add(count);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
