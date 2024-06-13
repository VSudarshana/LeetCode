class Solution {
    public String reverseWords(String s) {
        String rev = "";
        int i=0;
        int j=0;
        while(j < s.length()){
            while(i<s.length() && s.charAt(i) == ' ')i++;
            j=i;
            while(j<s.length() && s.charAt(j) != ' '){
                j++;
            }
            if(i >= s.length()) break;
            if(rev == "") rev = s.substring(i,j);
            else rev = s.substring(i,j) + ' ' + rev;
            i = j+1;
        }
        return rev;
    }
}