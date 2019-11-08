// problem link
// https://leetcode.com/problems/first-bad-version/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    // 0 0 1 1 1
    // n = 5
    public int firstBadVersion(int n) {
        int m = 0;
        int i = 1, j = n;
        while(i < j){
            m = i + (j-i)/2;
            if(isBadVersion(m)) j = m;
            else i = m+1;
        }
        return i;
    }
}