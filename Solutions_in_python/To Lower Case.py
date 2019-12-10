# problem link
# https://leetcode.com/problems/to-lower-case/

class Solution(object):
    def toLowerCase(self, str):
        """
        :type str: str
        :rtype: str
        """
        #return str.lower()
        l = []
        for c in str:
            if 'A' <= c <= 'Z':
                l.append(chr(ord(c) + 32))
            else:
                l.append(c)
        return "".join(l)