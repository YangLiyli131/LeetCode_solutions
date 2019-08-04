// problem link
// https://leetcode.com/problems/find-and-replace-pattern/

/*
create a helper function to hash the strings
compare the hashings of the input strings and the pattern string
*/

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        String a = hashing(pattern);
        for(String s : words){
            String st = hashing(s);
            if(st.equals(a)) res.add(s);
        }
        return res;
    }
    public String hashing(String s){
        String rr = "";
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        int id = 1;
        for(char c : ch){
            if(!hm.containsKey(c)){
                hm.put(c,id);
                id++;
                rr += Integer.toString(id-1);
            }
            else{
                int temp = hm.get(c);
                rr += Integer.toString(temp);
            }
        }
        return rr;
    }
}
