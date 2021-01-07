import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/length-of-last-word/
 *
 * @author fuenhui
 * @date 2021/01/07
 */
public class Question58 {

    public int lengthOfLastWord(String s) {
        String[] list = s.split(" ");
        List<String> strings = Arrays.asList(list);
        for (int i = strings.size() - 1; i >= 0; i--) {
            if (!strings.get(i).trim().equals("")){
                return strings.get(i).length();
            }
        }
        return 0;
    }
}
