
public class Solution {
	public int lengthOfLongestSubstring(String s) {
        int ret = 0;
        String word = "";
        for(int i = 0; i < s.length(); i++){
            if(word.contains(""+s.charAt(i))){
                word = word.substring(word.indexOf(s.charAt(i))+1);
            }
            word += s.charAt(i);
            ret = Math.max(word.length(),ret);
            
        }
        return ret;
    }
}
