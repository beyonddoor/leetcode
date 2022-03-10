package solution;

public class JudgeCircle {

    public boolean judgeCircle(String moves) {
        int xPos = 0;
        int yPos = 0;
        for (int i = 0; i < moves.length(); i++) {
            char action = moves.charAt(i);
            switch (action) {
                case 'U':
                    yPos++;
                    break;
                case 'D':
                    yPos--;
                    break;
                case 'L':
                    xPos--;
                    break;
                case 'R':
                    xPos++;
                    break;
                default:
                    break;

            }
        }
        return xPos == 0 && yPos == 0;
    }
}
