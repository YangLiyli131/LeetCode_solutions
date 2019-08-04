// problem link
// https://leetcode.com/problems/keyboard-row/

/*
To test if a word contains letters only from one row on the keyboard,
the solution is to create a hash table where the keys are the letters,
and their values are the row number where they positioned on the keyboard.
Then for each input word, scan it and refer the scanned letter in the hash table.
Once a different value is found, indicating that the word contains letters from multiple rows.
*/


class Solution {
    public String[] findWords(String[] words) {
        List<String> ll = new ArrayList<>();
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] r1 = {'q','w','e','r','t','y','u','i','o','p'};
        char[] r2 = {'a','s','d','f','g','h','j','k','l'};
        char[] r3 = {'z','x','c','v','b','n','m'};
        for(int i = 0; i < r1.length; i++){
            hm.put(r1[i],1);
        }
        for(int i = 0; i < r2.length; i++){
            hm.put(r2[i],2);
        }
        for(int i = 0; i < r3.length; i++){
            hm.put(r3[i],3);
        }
        for(String w : words){
            boolean ff = true;
            String ww = w.toLowerCase();
            int flag = hm.get(ww.charAt(0));
            for(int i = 1; i < w.length(); i++){
                if(hm.get(ww.charAt(i)) != flag){
                    ff = false;
                    break;
                }
            }
            if(ff) ll.add(w);
        }
        String[] res = new String[ll.size()];
        for(int i = 0; i < ll.size(); i++){
            res[i] = ll.get(i);
        }
        return res;
    }
}
