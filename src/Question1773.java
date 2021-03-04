import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/count-items-matching-a-rule/
 *
 * @author fuenhui
 * @date 2021/03/04
 */
public class Question1773 {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        Map<String, Integer> type = new HashMap<>();
        Map<String, Integer> color = new HashMap<>();
        Map<String, Integer> name = new HashMap<>();

        for (List<String> item : items) {
            if (!type.containsKey(item.get(0))) {
                type.put(item.get(0), 1);
            } else {
                type.replace(item.get(0), type.get(item.get(0)) + 1);
            }
            if (!color.containsKey(item.get(1))) {
                color.put(item.get(1), 1);
            } else {
                color.replace(item.get(1), color.get(item.get(1)) + 1);
            }
            if (!name.containsKey(item.get(2))) {
                name.put(item.get(2), 1);
            } else {
                name.replace(item.get(2), name.get(item.get(2)) + 1);
            }
        }

        if ("type".equals(ruleKey)) {
            if (type.containsKey(ruleValue)) {
                return type.get(ruleValue);
            } else {
                return 0;
            }
        } else if ("color".equals(ruleKey)) {
            if (color.containsKey(ruleValue)) {
                return color.get(ruleValue);
            } else {
                return 0;
            }
        } else {
            if (name.containsKey(ruleValue)) {
                return name.get(ruleValue);
            } else {
                return 0;
            }
        }
    }
}
