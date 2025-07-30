class Solution {
    public boolean isRobotBounded(String instructions) {
        int moveX = 0;
        int moveY = 0; 
        int directionR = 0;  // 0-N, 1-E, 2-S, 3-W

        for (int i = 0; i < instructions.length(); i++) {
            char ch = instructions.charAt(i);
            if (ch == 'G') {
                if (directionR == 0) moveY++;      // North
                else if (directionR == 1) moveX++; // East
                else if (directionR == 2) moveY--; // South
                else moveX--;                      // West
            } else if (ch == 'R') {
                directionR = (directionR + 1) % 4;
            } else if (ch == 'L') {
                directionR = (directionR + 3) % 4; // same as -1 mod 4
            }
        }

        return (moveX == 0 && moveY == 0) || directionR != 0;
    }
}
