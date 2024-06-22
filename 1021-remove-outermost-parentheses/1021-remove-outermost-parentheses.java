class Solution {
    public String removeOuterParentheses(String s) {
        String s1="";
        int c = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
                if(c>1)
                 s1+=s.charAt(i);
            }
            else {
                c--;
                if(c>0)
                 s1+=s.charAt(i);
            }}
            return s1;
    }
}