class Solution {
    public int longestPalindrome(String s) {
        boolean isOdd = false;
        Map<Character, Integer> map = new HashMap<>();
        for( int i = 0 ; i< s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        
        int count = 0;
        for(char i : map.keySet()){
            if(map.get(i)%2 == 0){
                count += map.get(i);
                // map.remove(i);
            }else {
                count += map.get(i) - 1;
                isOdd = true;
            }
        }
        if (isOdd) count++;
    return count;
    }
}