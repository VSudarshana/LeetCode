class Solution {
    public int countPrefixes(String[] arr, String s) {
        int cnt = 0;
        for (String str : arr) {
            if (s.startsWith(str))
                cnt++;
        }
        return cnt;
    }
}