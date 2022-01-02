class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m = mass;
        int len = asteroids.length;
        for (int i = 0; i < len; i++) {
            if (m >= asteroids[i]) {
                m += asteroids[i];
            } else {
                return false;
            }
        }
        return true;
    }
}