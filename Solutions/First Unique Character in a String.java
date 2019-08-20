// problem link
// https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }else{
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
        }
        int res = Integer.MAX_VALUE;
        // if flag = 1, means such unique character exists
        int flag = 0;
        for(int j = 0; j < s.length(); j++){
            char x = s.charAt(j);
            int tt = hm.get(x);
            if(tt == 1){
                flag = 1;
                res = res < j? res : j;
            }
        }
        return flag == 0? -1 : res;    
    }
}