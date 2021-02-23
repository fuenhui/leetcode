/**
 * https://leetcode-cn.com/problems/hamming-distance/
 *
 * @author fuenhui
 * @date 2021/02/23
 */
public class Question461 {

    public int hammingDistance(int x, int y) {

        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        int cut = 0;
        if (sb1.length() < sb2.length()) {
            cut = sb2.length() - sb1.length();
            for (int i = 0; i < cut; i++) {
                sb1.insert(0, "0");
            }
        } else {
            cut = sb1.length() - sb2.length();
            for (int i = 0; i < cut; i++) {
                sb2.insert(0, "0");
            }
        }

        int count = 0;
        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) != sb2.charAt(i)) {
                count++;
            }
        }

        return count;
    }
}
