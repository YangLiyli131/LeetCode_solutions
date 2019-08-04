// problem link
// https://leetcode.com/problems/unique-morse-code-words/

/*
create a hash table where keys are the letters and values are the Morse codes
*/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs = new HashSet<>();
        for(String s : words){
            StringBuilder sb = new StringBuilder();
            char[] ch = s.toCharArray();
            for(char c : ch){
                sb.append(table[c-'a']);
            }
            hs.add(sb.toString());
        }
        return hs.size();
    }
}