/**
 * https://leetcode-cn.com/problems/number-of-students-doing-homework-at-a-given-time/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1450 {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                count++;
            }
        }

        return count;
    }
}
