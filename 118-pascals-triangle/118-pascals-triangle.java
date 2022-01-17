class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> prev = new ArrayList<>();
        for (int i = 0; i< numRows; i++){
             ArrayList<Integer> a = new ArrayList<>();
                for (int j = 0 ; j<= i; j++){
                    if (j == 0 || j == i){
                    a.add(1);
                    }else{
                    a.add(prev.get(j-1) + prev.get(j));
                    }
                    }
            prev = a;
            arr.add(a);            
        }
        return arr;
    }
}