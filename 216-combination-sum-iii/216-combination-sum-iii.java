class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        solve(1, k, n, new ArrayList<>(), res);
        return res;
    }
    public void solve(int start, int k, int n, List<Integer> temp, List<List<Integer>> res){
        if(n == 0 && temp.size() == k){
            res.add(new ArrayList<>(temp));
        }
        System.out.println(start + " " + k  + " " + n  + " ");
        for(int i = start; i <= 9; i++){
            temp.add(i);
            System.out.println("temp - " + temp.toString());
            solve(i + 1, k, n - i, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
}