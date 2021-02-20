import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/increasing-decreasing-string/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1370 {

    public String sortString(String s) {

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while (list.size() != 0) {
            list.sort(new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return o1 - o2;
                }
            });
            result.append(list.get(0));
            char c = list.get(0);
            list.remove(0);
            if (list.size() == 0) break;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > c) {
                    result.append(list.get(i));
                    c = list.get(i);
                    list.remove(i);
                    i--;
                }
            }
            if (list.size() == 0) break;

            list.sort(new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return o2 - o1;
                }
            });
            result.append(list.get(0));
            c = list.get(0);
            list.remove(0);
            if (list.size() == 0) break;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < c) {
                    result.append(list.get(i));
                    c = list.get(i);
                    list.remove(i);
                    i--;
                }
            }
            if (list.size() == 0) break;
        }
        return result.toString();
    }
}