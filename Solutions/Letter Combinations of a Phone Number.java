// problem link
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0) return res;
        
        String[] d = new String[]{" ", 
                                "", 
                                "abc", 
                                "def",
                                "ghi",
                                "jkl",
                                "mno",
                                "pqrs",
                                "tuv",
                                "wxyz"}; 
        res.add("");
        for(char c : digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            for(String ss : res){
                String sss = d[c - '0'];
                for(int i = 0; i < sss.length(); i++){
                    temp.add(ss + sss.charAt(i));
                }
            }
            res = temp;           
        }
        return res;
    }
}