class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i< numRows; i++){
             ArrayList<Integer> a = new ArrayList<>();
                for (int j = 0 ; j<= i; j++){
                    if (j == 0 || j == i){
                    a.add(1);
                    }else{
                    a.add(arr.get(i-1).get(j-1) + arr.get(i-1).get(j));
                    }
                    }
            arr.add(a);            
        }
        return arr;
    }
}