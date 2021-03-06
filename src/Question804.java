import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/unique-morse-code-words/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question804 {

    public int uniqueMorseRepresentations(String[] words) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                sb.append(get(words[i].charAt(j)));
            }
            map.put(sb.toString(), 1);
        }
        return map.keySet().size();
    }

    private String get(char c) {
        switch (c) {
            case 'a': {
                return ".-";
            }
            case 'b': {
                return "-...";
            }
            case 'c': {
                return "-.-.";
            }
            case 'd': {
                return "-..";
            }
            case 'e': {
                return ".";
            }
            case 'f': {
                return "..-.";
            }
            case 'g': {
                return "--.";
            }
            case 'h': {
                return "....";
            }
            case 'i': {
                return "..";
            }
            case 'j': {
                return ".---";
            }
            case 'k': {
                return "-.-";
            }
            case 'l': {
                return ".-..";
            }
            case 'm': {
                return "--";
            }
            case 'n': {
                return "-.";
            }
            case 'o': {
                return "---";
            }
            case 'p': {
                return ".--.";
            }
            case 'q': {
                return "--.-";
            }
            case 'r': {
                return ".-.";
            }
            case 's': {
                return "...";
            }
            case 't': {
                return "-";
            }
            case 'u': {
                return "..-";
            }
            case 'v': {
                return "...-";
            }
            case 'w': {
                return ".--";
            }
            case 'x': {
                return "-..-";
            }
            case 'y': {
                return "-.--";
            }
            case 'z': {
                return "--..";
            }
            default: {
                return null;
            }
        }
    }
}
