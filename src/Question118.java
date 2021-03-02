import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/pascals-triangle/
 *
 * @author fuenhui
 * @date 2021/03/02
 */
public class Question118 {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            if (i == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                result.add(list);
            } else if (i == 1) {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(1);
                result.add(list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                for (int j = 0; j < result.get(i - 1).size(); j++) {
                    if (j + 1 < result.get(i - 1).size()) {
                        list.add(result.get(i - 1).get(j) + result.get(i - 1).get(j + 1));
                    }
                }
                list.add(1);
                result.add(list);
            }
        }

        return result;
    }
}