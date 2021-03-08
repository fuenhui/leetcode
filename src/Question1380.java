import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix/
 *
 * @author fuenhui
 * @date 2021/03/08
 */
public class Question1380 {

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            map.put(min, 1);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            if (map.containsKey(max)) {
                result.add(max);
            }
        }
        return result;
    }
}
