package solution;

/**
 * https://leetcode-cn.com/problems/the-number-of-full-rounds-you-have-played/
 */
public class NumberOfRounds {
    public int numberOfRounds(String loginTime, String logoutTime) {
        int startHour = Integer.parseInt(loginTime, 0, 2, 10);
        int startMinute = Integer.parseInt(loginTime, 3, 5, 10);

        int endHour = Integer.parseInt(logoutTime, 0, 2, 10);
        int endMinute = Integer.parseInt(logoutTime, 3, 5, 10);

        if(startHour * 60 + startMinute > endHour * 60 + endMinute)
        {
            return getCount(24, 0, false) - getCount(startHour, startMinute, true)
            + getCount(endHour, endMinute, false) - getCount(0, 0, true);
        }
        int count = getCount(endHour, endMinute, false) - getCount(startHour, startMinute, true);
        if(count < 0)
        {
            count = 0;
        }
        return count;
    }

    /**
     * 格式化为刻度时间
     * @param hour
     * @param minute
     * @param isStart
     * @return
     */
    int getCount(int hour, int minute, boolean isStart)
    {
        if(isStart)
        {
            return hour * 4 + (minute + 14) / 15;
        }
        else
        {
            return hour * 4 + minute / 15;
        }
    }
}
