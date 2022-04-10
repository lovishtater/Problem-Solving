class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> arr = new ArrayList<>();
        int j =0;
        for (int i = 0; i< ops.length; i++){
            if(ops[i].equals("C")){
                arr.remove(j-1);
                j--;
            }else if (ops[i].equals("D")){
                arr.add(2 * arr.get(j-1));
                j++;
            } else if (ops[i].equals("+")) {
                arr.add(arr.get(j-1) + arr.get(j-2));
                j++;
            }else{
                arr.add(Integer.parseInt(ops[i]));
                j++;
            }
        }
        int sum = 0 ;
        for (int i = 0 ; i < arr.size(); i++){
            sum += arr.get(i);
        }
        return sum;
    }
}