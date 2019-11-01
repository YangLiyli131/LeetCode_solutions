// problem link
// https://leetcode.com/problems/occurrences-after-bigram/

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> ls = new ArrayList<>();
        for(int i = 2; i < words.length; i++){
            if(first.equals(words[i-2]) && second.equals(words[i-1])){
                ls.add(words[i]);
            }
        }
        return ls.toArray(new String[0]);
    }
}