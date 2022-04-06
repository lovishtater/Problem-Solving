class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        int mod = 1000000007;
        for (int i = 0; i < arr.length; i++) {
            res = (res + mp.getOrDefault(target - arr[i], 0)) % mod;
            // System.out.println(res);
            for (int j = 0; j < i; j++) {
                int temp = arr[i] + arr[j];
                mp.put(temp, mp.getOrDefault(temp, 0) + 1);
            }
        }
        // mp.forEach((key, value) -> System.out.println(key + " " + value));
        return res;
    }
}