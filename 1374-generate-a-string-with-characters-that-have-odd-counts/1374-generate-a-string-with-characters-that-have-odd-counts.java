class Solution {
    public String generateTheString(int n) {
        String str="";
        if(n%2==1){
            for(int i=1; i<=n; i++){
                str+="a";
            }
        }
        else{
            for(int i=1; i<n; i++){
                str+="a";
            }
            str+="b";
        }
        return str;
    }
}