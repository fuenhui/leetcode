/**
 * https://leetcode-cn.com/problems/add-digits/
 *
 * @author fuenhui
 * @date 2021/03/08
 */
public class Question258 {

    public int addDigits(int num) {

        int data = num;

        while (data > 9) {
            String s = "" + data;
            data = 0;
            for (int i = 0; i < s.length(); i++) {
                data += s.charAt(i) - '0';
            }
        }

        return data;
    }
}
