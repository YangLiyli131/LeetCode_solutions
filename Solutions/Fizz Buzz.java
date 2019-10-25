// problem link
// https://leetcode.com/problems/fizz-buzz/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int t = i+1;
            if(t % 3 == 0 && t % 5 == 0) res.add("FizzBuzz");
            else if(t % 3 == 0) res.add("Fizz");
            else if(t % 5 == 0) res.add("Buzz");
            else res.add(String.valueOf(t));
        }
        return res;
    }
}