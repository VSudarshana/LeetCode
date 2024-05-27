class Solution {
    public boolean isAcronym(List<String> words, String s) {
if(words.size()!=s.length())
return false;

        int flag = 0;
        for (int i = 0; i < words.size(); i++) {
            String str = words.get(i);
            if (str.charAt(0) != s.charAt(i)) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            return false;
        }

        return true;

    }
}