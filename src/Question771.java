import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/jewels-and-stones/
 *
 * @author fuenhui
 * @date 2021/01/17
 */
public class Question771 {

    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;
        List<Character> list = new ArrayList<>();

        for (char c : jewels.toCharArray()) {
            list.add(c);
        }

        for (char c : stones.toCharArray()) {
            if (list.contains(c)) {
                count++;
            }
        }

        return count;
    }
}
