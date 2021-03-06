import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/design-an-ordered-stream/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question1656 {

    List<String> list = new ArrayList<>();
    int ptl = 0;

    public Question1656(int n) {
        for (int i = 0; i < n; i++) {
            list.add(null);
        }
    }

    public List<String> insert(int idKey, String value) {

        list.set(idKey - 1, value);
        List<String> result = new ArrayList<>();
        int k = ptl;
        while (k < list.size() && list.get(k) != null) {
            result.add(list.get(k));
            k++;
        }
        if (idKey - 1 == ptl) {
            while (ptl < list.size() && list.get(ptl) != null) {
                ptl++;
            }
        }
        return result;
    }
}
