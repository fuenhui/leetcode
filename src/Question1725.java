import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/number-of-rectangles-that-can-form-the-largest-square/
 *
 * @author fuenhui
 * @date 2021/02/23
 */
public class Question1725 {

    public int countGoodRectangles(int[][] rectangles) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i][0] < rectangles[i][1]) {
                if (!map.containsKey(rectangles[i][0])) {
                    map.put(rectangles[i][0], 1);
                } else {
                    map.replace(rectangles[i][0], map.get(rectangles[i][0]) + 1);
                }
            } else {
                if (!map.containsKey(rectangles[i][1])) {
                    map.put(rectangles[i][1], 1);
                } else {
                    map.replace(rectangles[i][1], map.get(rectangles[i][1]) + 1);
                }
            }
        }

        int max = -1;
        for (Integer integer : map.keySet()) {
            if (integer > max) {
                max = integer;
            }
        }

        return map.get(max);
    }
}