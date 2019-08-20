// problem link
// https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
        String ss = s.trim();
        String[] str = ss.split("\\s+");
        List<String> myList = new ArrayList<>();
        for(String si : str){
            myList.add(0,si);
        }
        String listString = "";
        for (String sy : myList)
        {
            listString += sy + " ";
        }
        return listString.trim();
    }
}