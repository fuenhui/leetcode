/**
 * https://leetcode-cn.com/problems/flipping-an-image/
 *
 * @author fuenhui
 * @date 2021/03/04
 */
public class Question832 {

    public int[][] flipAndInvertImage(int[][] image) {

        StringBuilder[] strings = new StringBuilder[image.length];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = new StringBuilder();
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    strings[i].append("" + 1);
                } else {
                    strings[i].append("" + 0);
                }
            }
            strings[i].reverse();
        }

        int[][] result = new int[image.length][image.length];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                result[i][j] = strings[i].charAt(j) - '0';
            }
        }

        return result;
    }
}
