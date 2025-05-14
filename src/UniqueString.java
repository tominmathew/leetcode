import java.util.HashSet;
import java.util.Set;

public class UniqueString {

    public static void main(String[] args){
        String s = "abcabcbb";
        UniqueString uniqueString = new UniqueString();
        int result = uniqueString.lengthOfLongestSubstring2(s);
        System.out.println(result);
    }
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, set.size());
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

    public int lengthOfLongestSubstring2(String s) {

        int  n = s.length();

        int[] charIndex = new int[128];
        int maxLength = 0;
        int left = 0;

        for ( int right = 0; right < n; right++ ) {
            char character = s.charAt(right);
            left = Math.max(left,charIndex[character]);
            maxLength = Math.max(maxLength, right-left+1);
            charIndex[character] = right + 1;
        }
        return maxLength;
    }
}