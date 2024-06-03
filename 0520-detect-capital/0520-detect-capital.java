class Solution {
    public boolean detectCapitalUse(String word) {
        String str1 = word.toUpperCase();
        String str2 = word.toLowerCase();
        String str3 = word.substring(1).toLowerCase();
        ;
        if (str1.equals(word))
            return true;

        if (str2.equals(word))
            return true;

        if (Character.isUpperCase(word.charAt(0)) && str3.equals(word.substring(1)))
            return true;

        return false;
    }
}