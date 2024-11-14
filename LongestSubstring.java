import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int l= 0;
        int length = 0;
        for(int r=0; r<s.length(); r++){
            Character curr = s.charAt(r);
            Integer pos = seen.get(curr);
            if (pos!=null && pos >=l){
                l= pos + 1;
            }else{
                length = Math.max(length, (r-l+1));
            }
            seen.put(curr,r);
        }
        return length;
    }
}
