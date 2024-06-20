class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < items.size(); j++) {
                if (items.get(i) == ruleKey && items.get(j) == ruleValue) {
                    count++;
                }
            }
        }
        rrturn count =0;
    }
}