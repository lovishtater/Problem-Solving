class Solution {
public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    private void backtracking(List<List<Integer>> res, List<Integer> arr, int[] nums, boolean[] visited) {
        if (arr.size() == nums.length)
            res.add(new ArrayList<>(arr));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) continue;
                arr.add(nums[i]);
                visited[i] = true;
                backtracking(res, arr, nums, visited);
                visited[i] = false;
                arr.remove(arr.size() - 1);
            }
        }
    }
}