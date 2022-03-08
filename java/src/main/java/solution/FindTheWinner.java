package solution;

import java.util.ArrayList;

/**
 * https://leetcode-cn.com/problems/find-the-winner-of-the-circular-game/
 */
public class FindTheWinner {

    public int findTheWinner(int n, int k) {

        var players = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            players.add(i+1);
        }

        int index = 0;
        int counter = 1;
        for (;;) {
            if(players.size() == 1) {
                return players.get(0);
            }

            // 数到这个人了，离场
            if(counter == k) {
                var value = players.remove(index);
                counter = 1;
            } else {
                counter++;
                index = (index + 1) % players.size();
            }
        }
    }
}
