// problem link
// https://leetcode.com/problems/day-of-the-year/

class Solution {
    public int dayOfYear(String date) {
        String year = date.substring(0,4);
        String month = date.substring(5,7);
        String day = date.substring(8,10);    
        int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeap(Integer.parseInt(year))) days[1] = days[1] + 1;
        int res = Integer.parseInt(day);
        int mon = Integer.parseInt(month);
        for(int i = 0; i < mon-1; i++) res += days[i];
        return res;
    }
    private boolean isLeap(int y){
        if(y % 400 == 0) return true;
        else if(y % 100 == 0) return false;
        else if(y % 4 == 0) return true;
        else return false;
    }
}