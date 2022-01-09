class Solution {
    public boolean isRobotBounded(String instructions) {
        int[] cur = new int[] {0, 0};
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int dir = 0;
        
        for (char in : instructions.toCharArray()) {
            if (in == 'G') {
                cur[0] += dirs[dir][0];
                cur[1] += dirs[dir][1];
            } else if (in == 'L') {
                dir = (dir + 3) % 4;
            } else {
                dir = (dir + 1) % 4;
            }
        }
        if (cur[0] == 0 && cur[1] == 0) {
            return true;
        }
        if (dir == 0 && !(cur[0] == 0 && cur[1] == 0)) { 
            return false;
        }
        return true;
    }
}