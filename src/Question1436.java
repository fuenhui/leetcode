import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/destination-city/
 *
 * @author fuenhui
 * @date 2021/03/04
 */
public class Question1436 {

    public String destCity(List<List<String>> paths) {

        Map<String, Integer> map1 = new HashMap<>();

        int k = 0;

        for (List<String> path : paths) {
            if (!map1.containsKey(path.get(0))) {
                map1.put(path.get(0), k++);
            }
            if (!map1.containsKey(path.get(1))) {
                map1.put(path.get(1), k++);
            }
        }

        int[][] mp = new int[k][k];

        for (List<String> path : paths) {
            mp[map1.get(path.get(0))][map1.get(path.get(1))] = 1;
        }

        for (String s : map1.keySet()) {
            int count = 0;

            for (int i = 0; i < k; i++) {
                if (mp[map1.get(s)][i] == 1) {
                    count++;
                }
            }
            if (count == 0) {
                return s;
            }
        }

        return null;
    }
}