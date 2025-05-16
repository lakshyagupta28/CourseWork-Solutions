class Solution {
    public int numDecodings(String s) {
        if(s.length()>0 && s.charAt(0)=='0')
                return 0;
        if(s.length()<=1)
            return 1;
        else
        {
            int twoDigit=Integer.parseInt(s.substring(0,2));
            int output=numDecodings(s.substring(1));
            if(twoDigit>=10 && twoDigit<=26)
            {
                output+=numDecodings(s.substring(2));
            }
            return output;
        }
        
    }
}
