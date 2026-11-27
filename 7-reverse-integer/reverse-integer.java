class Solution {
    public int reverse(int x) {
        int temp,digit;
        int rev=0;
        temp=x;
        
        while(temp!=0){
            digit=temp%10;
            temp=temp/10;
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            rev = rev*10+digit;
        }
        
        return (int)rev;
    }
}