class Solution {
    public int longestContinuousSubstring(String s) {
        int val1=0,val2=0;
        if(s.length()==0 || s.length()==1) return s.length();
        int st=0,max=Integer.MIN_VALUE;
        for(int i=1;i<s.length();i++) 
        {
            val1 = s.charAt(i) - 'a';
            val2 = s.charAt(i-1) - 'a';
            if(val1-val2 == 1) 
            {
                max=Math.max(max,i-st+1);
            }
            else
            {
                st=i;
            }
        }
        return max==Integer.MIN_VALUE?1:max;
        
    }
}
