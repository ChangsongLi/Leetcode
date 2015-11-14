public class Solution {
    public int reverse(int x) {
        boolean neg = false;
        long number = x;
        long ret = 0;
        long pos = 1;
        if(x < 0){
            neg = true;
            number = number * -1;
        }
        String num = "" + number;
        for(int i = 0; i < num.length(); i++){
            ret = ret+ Integer.parseInt(""+num.charAt(i)) * pos;
        
            pos *= 10;
        }
        if(neg)
            ret = -ret;
        if(ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE){
            return 0;
        }
        
        return (int)ret;
    }
}