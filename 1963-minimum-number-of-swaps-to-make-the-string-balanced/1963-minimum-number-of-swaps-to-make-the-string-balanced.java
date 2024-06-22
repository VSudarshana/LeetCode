class Solution {
    public int minSwaps(String s) {
        Stack<Character> stk = new Stack<>();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
           
            if (s.charAt(i) == '[') {
                stk.push(s.charAt(i));}
            
            else{
                if(stk.isEmpty()) c++;
            

            else{
                stk.pop();
            }}
            }
    return(c+1)/2;
}}