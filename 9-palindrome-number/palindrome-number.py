class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if(x<0):
            return False
        rev=0
        ori=x
        while ori>0:
            digit = ori % 10
            rev = rev * 10 + digit
            ori = ori // 10
        if(x==rev):
            return True
        else:
            return False
