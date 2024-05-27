class Solution {
    public boolean isFascinating(int n) {
        int num1 = 2 * n;
        int num2 = 3 * n;
        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        String n1 = String.valueOf(n);
        String res = n1 + s1 + s2;
        String compare="123456789";
        char tempArray[] = res.toCharArray();
        Arrays.sort(tempArray);
        String new1 = new String(tempArray);
        if(new1.equals(compare)){
            return true;
        }
        return false;
    }
}