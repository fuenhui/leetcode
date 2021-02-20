/**
 * https://leetcode-cn.com/problems/minimum-time-visiting-all-points/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1266 {

    public int minTimeToVisitAllPoints(int[][] points) {

        if (points.length == 0 || points.length == 1) {
            return 0;
        }

        int sum = 0;
        int[] last = points[0];

        for (int i = 1; i < points.length; i++) {

            int x1 = last[0];
            int y1 = last[1];
            int x2 = points[i][0];
            int y2 = points[i][1];

            int x = x1 - x2;
            int y = y1 - y2;

            if (x == 0) {
                sum += Math.abs(y);
            } else if (y == 0) {
                sum += Math.abs(x);
            } else {
                if (Math.abs(x) > Math.abs(y)) {
                    sum += Math.abs(y);
                    if (Math.abs(x + Math.abs(y)) < Math.abs(x)) {
                        sum += Math.abs(x + Math.abs(y));
                    } else {
                        sum += Math.abs(x - Math.abs(y));
                    }
                } else if (Math.abs(x) < Math.abs(y)) {
                    sum += Math.abs(x);
                    if (Math.abs(y + Math.abs(x)) < Math.abs(y)) {
                        sum += Math.abs(y + Math.abs(x));
                    } else {
                        sum += Math.abs(y - Math.abs(x));
                    }
                } else {
                    sum += Math.abs(x);
                }
            }
            last = points[i];
        }
        return sum;
    }
}