public class Solution {
    public int strongPasswordChecker(String s) {
        int length = s.length();
        ArrayList<Integer> rptlen = new ArrayList<Integer>();
        Boolean[] types = {false, false, false, false};
        int i = 0;
        int j = 1;

        while (i < length) {
            while ((i+j < length) && (s.charAt(i) == s.charAt(i+j))) {j += 1;}
            if (j >= 3) {
                rptlen.add(j);
            }
            int tmp = classifier(s.charAt(i));
            types[tmp] = true;
            i += j;
            j = 1;
        }
        Integer[] work = {0,0,0};     
        if (length < 6) {
            work[0] = 6-length;
        }
        else if (length > 20) {
            work[1] = length-20;
            int allbydel = 0;
            int tmp = 0;
            for (int k = 0; k < rptlen.size(); k++) {
                allbydel += (rptlen.get(k)-2);
                tmp += rptlen.get(k)/3;
            }
            if (work[1] < allbydel) {
                work[2] = Math.max(tmp-work[1], (allbydel-work[1]+2)/3);
            }
        }
        else {
            for (int x = 0; x < rptlen.size(); x++) {
                work[2] += rptlen.get(x)/3;
            }
        }

        int countmiss = 0;
        for (int t = 0; t < 3; t ++) { if (types[t] == false) countmiss++;}
        return work[0]+work[1]+Math.max(work[2], countmiss-work[0]);
    }
    private int classifier(char c) {
        if (Character.isUpperCase(c)) return 0;
        else if (Character.isLowerCase(c)) return 1;
        else if (Character.isDigit(c)) return 2;
        else return 3;
    }
}