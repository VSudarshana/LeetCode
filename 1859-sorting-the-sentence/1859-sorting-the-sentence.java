class Solution {
    public String sortSentence(String s) {
        HashMap<Integer, String> map = new HashMap<>();
        for (String word : s.split(" ")) {
            int n = word.length() - 1;
            int index = word.charAt(n) - '0';
            String originalWord = word.substring(0, n);
            map.put(index, originalWord);
        }
       StringBuilder str = new StringBuilder();
       for(Map.Entry m : map.entrySet()){
        str.append(m.getValue());
        str.append(" ");
       }
       return str.toString().trim();
    }
}