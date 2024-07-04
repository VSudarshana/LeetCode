class Solution {
    public boolean checkIfPangram(String sentence) {
    sentence = sentence.toLowerCase();
    Set<Character> letters = new HashSet<>();
    for(char ch : sentence.toCharArray()){
        if(ch>='a'&&ch<='z'){
            letters.add(ch);
        }
    }
        return letters.size()==26;
    }
}