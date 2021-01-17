import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 *
 * @author fuenhui
 * @date 2021/01/17
 */
public class Question1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = -99999;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}
