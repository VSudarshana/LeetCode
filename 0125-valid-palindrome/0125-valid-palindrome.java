class Solution {
    public boolean isPalindrome(String s) {
        // String str = s.replace(" ", "").replace(".", "").replace(":",
        // "").replace(",", "").toLowerCase();
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (str.equals("")) {
            return true;
        }
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            return true;
        }
        return false;
    }
}