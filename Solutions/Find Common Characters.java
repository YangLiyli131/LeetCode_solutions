// problem link
// https://leetcode.com/problems/find-common-characters/

class Solution {
    public List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<>();
        HashMap<Character,Integer> hm = new HashMap<>();
        String s1 = A[0];
        for(char c : s1.toCharArray()){
            if(!hm.containsKey(c)) hm.put(c,1);
            else hm.put(c, hm.get(c)+1);
        }
        for(int i = 1; i < A.length; i++){
            String s = A[i];
            for(char c : hm.keySet()){
                int n = num_of(s,c);
                if(n < hm.get(c)) hm.put(c, n);
            }
        }
        for(char c : hm.keySet()){
            int t = hm.get(c);
            while(t != 0){
                res.add(Character.toString(c));
                t--;
            }
        }
        return res;
    }
    public int num_of(String s, char c){
        char[] ch = s.toCharArray();
        int k = 0;
        for(char x : ch){
            if(x == c) k++;
        }
        return k;
    }
}