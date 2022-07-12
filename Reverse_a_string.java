// Time complexity o(n)
//space complexity o(1)
class Solution {
    public void reverseString(char[] s) {
         int l=0;
        
        int r=s.length-1;
        while(l<r){
           char t=s[l];
            s[l]=s[r];
            s[r]=t;
            l++;
            r--;
        }
    
