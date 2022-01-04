class Solution {
    public int bitwiseComplement(int n) {
    int a = 1;
    while (a < n) 
      a = (a << 1) | 1;
    return n ^ a;
    }
}