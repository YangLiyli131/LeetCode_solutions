// problem link
// https://leetcode.com/problems/group-anagrams/

// 9ms
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>(); 
        for(String s : strs){
            if(!hm.containsKey(helper(s))){
                List<String> temp = new ArrayList<>();
                temp.add(s);
                hm.put(helper(s), temp);
            }else{
                List<String> temp2 = hm.get(helper(s));
                temp2.add(s);
                hm.put(helper(s), temp2);
            }
        }
        for(List<String> li : hm.values()){
            res.add(li);
        }
        return res;
    }
    private String helper(String s){
        char[] cha = s.toCharArray();
        Arrays.sort(cha);
        return new String(cha);
    }
}

// 170ms
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,Integer> hm = new HashMap<>(); // match each unique sorted string with a brand new label
        int[] idx = new int[strs.length]; // store the label of each string
        int id = 1;
        for(int i = 0; i < strs.length; i++){
            String s = helper(strs[i]);
            if(!hm.containsKey(s)){
                hm.put(s,id);
                idx[i] = id;
                id++;
            }else{
                idx[i] = hm.get(s);
            }            
        }
        int maxid = 0;
        for(int i : idx){
            if(i > maxid) maxid = i;
        }
        
        for(int i = 1; i <= maxid; i++){
            List<String> temp = new ArrayList<>();
            for(int j = 0; j < idx.length; j++){
                if(idx[j] == i){
                    temp.add(strs[j]);
                }
            }
            res.add(temp);
        }
        return res;
    }
    private String helper(String s){
        char[] cha = s.toCharArray();
        Arrays.sort(cha);
        return new String(cha);
    }
}