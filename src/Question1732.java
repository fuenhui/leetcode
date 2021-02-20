/**
 * https://leetcode-cn.com/problems/find-the-highest-altitude/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1732 {

    public int largestAltitude(int[] gain) {

        if (gain.length == 0) {
            return 0;
        }

        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude[i + 1] = altitude[i] + gain[i];
        }

        int max = -999999999;
        for (int i = 0; i < altitude.length; i++) {
            if (altitude[i] > max) {
                max = altitude[i];
            }
        }

        return max;
    }
}
