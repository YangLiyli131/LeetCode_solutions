// problem link
// https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("IV",4);
        hm1.put("IX",9);
        hm1.put("XL",40);
        hm1.put("XC",90);
        hm1.put("CD",400);
        hm1.put("CM",900);
        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("I",1);
        hm2.put("X",10);
        hm2.put("V",5);
        hm2.put("L",50);
        hm2.put("C",100);
        hm2.put("D",500);
        hm2.put("M",1000);
        
        for(int i = 0; i < s.length(); ){
            if((i + 1) < s.length() && hm1.containsKey(s.substring(i,i+2))){
                res += hm1.get(s.substring(i,i+2));
                i += 2;
            }else{
                res += hm2.get(s.substring(i,i+1));
                i++;
            }
        }
        return res;
    }
}