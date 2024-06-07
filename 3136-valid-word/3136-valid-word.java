class Solution {
    public boolean isValid(String word) {
        if (word.length()>=3 
            && word.matches("[a-zA-Z0-9]+") 
            && word.matches(".*[aeiou].*")
            && word.matches(".*[AEIOU].*")) {
            return true;
        }
        return false;
    }
}
