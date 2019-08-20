// problem link
// https://leetcode.com/problems/complex-number-multiplication/

class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] aa = a.split("\\+");
        String[] bb = b.split("\\+");
        int a1 = Integer.parseInt(aa[0]);
        int b1 = Integer.parseInt(bb[0]);
        
        String a2 = aa[1];
        String b2 = bb[1];
        
        String xa = a2.substring(0, a2.length() - 1);
        String xb = b2.substring(0, b2.length() - 1);
        int aaa = Integer.parseInt(xa);
        int bbb = Integer.parseInt(xb);
        int real = a1 * b1 - aaa * bbb;
        int img = a1 * bbb + b1 * aaa;
        
        return Integer.toString(real) + "+" + Integer.toString(img) + "i";
    }
}