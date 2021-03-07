import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-common-characters/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question1002 {

    public List<String> commonChars(String[] A) {

        int[][] map = new int[26][A.length];
        List<String> result = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                map[A[i].charAt(j) - 'a'][i]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            int min = map[i][0];
            for (int j = 0; j < A.length; j++) {
                if (map[i][j] < min) {
                    min = map[i][j];
                }
            }
            for (int j = 0; j < min; j++) {
                result.add("" + (char) (i + 'a'));
            }
        }
        return result;
    }
}
