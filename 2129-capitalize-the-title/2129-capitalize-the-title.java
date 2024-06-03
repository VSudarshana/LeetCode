class Solution {
    public String capitalizeTitle(String title) {
        String[] str = title.split(" ");
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            if (s.length() <= 2) {
                str[i] = s.toLowerCase();
            } else {
                str[i] = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            }
        }
        return String.join(" ", str);
    }
}