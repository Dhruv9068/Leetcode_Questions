package first_ideaprogram.src.Leetcode_questions;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
          String s= "aaabababaababcdef";
          int L=lengthOfLongestSubstring(s);
          System.out.println(L);

    }
    static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
