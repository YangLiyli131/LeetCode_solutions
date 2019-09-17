// problem link
// https://leetcode.com/problems/maximum-number-of-balloons/

class Solution {
    public int maxNumberOfBalloons(String text) {
        char[] ch = text.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('a',0);
        hm.put('b',0);
        hm.put('l',0);
        hm.put('o',0);
        hm.put('n',0);
        for(char c : ch){
            if(c == 'a' || c == 'b' || c == 'l' || c == 'o' || c == 'n'){
                hm.put(c, hm.get(c)+1);
            }
        }
        for(int i : hm.values()){
            if(i == 0) return 0;
        }
        int a = hm.get('a');
        int b = hm.get('b');
        int o = hm.get('o');
        int l = hm.get('l');
        int n = hm.get('n');
        int t = o < l? o : l;
        int tt = Math.min(Math.min(a,b),n);
        return tt < t/2? tt : t/2;
    }
}