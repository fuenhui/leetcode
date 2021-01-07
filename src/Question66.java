import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode-cn.com/problems/plus-one/
 *
 * @author fuenhui
 * @date 2021/01/07
 */
public class Question66 {

    public int[] plusOne(int[] digits) {

        int temp = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                digits[i] = digits[i] + 1;
                if (digits[i] == 10) {
                    digits[i] = 0;
                    temp = 1;
                }
            } else {
                digits[i] = digits[i] + temp;
                if (digits[i] == 10) {
                    digits[i] = 0;
                    temp = 1;
                } else {
                    temp = 0;
                }
            }
        }

        if (temp == 0) {
            return digits;
        } else {
            List<Integer> list = Arrays.stream(digits).boxed().collect(Collectors.toList());
            list.add(0, temp);
            return list.stream().mapToInt(Integer::valueOf).toArray();
        }
    }
}
