class Solution {
    public boolean isPalindrome(int x) {
        int digit,rev=0;
        int ori;
        ori=x;
        if(x<0){
            return false;
        }
        while(ori>0){
            digit = ori % 10;
            rev = rev * 10 + digit;
            ori = ori/10;
        }
        if(x == rev)
            return true;
        else
            return false;
    }
}