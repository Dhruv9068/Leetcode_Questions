package Leetcode_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
        String s = "abcbcdefgcab";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int sLen = s.length();
        int pLen = p.length();

        if (pLen > sLen) {
            return Collections.emptyList();
        }

        int[] Pcount = new int[26];
        int[] Scount = new int[26];

        // Initialize counts for the first window
        for (int i = 0; i < pLen; i++) {
            Pcount[p.charAt(i) - 'a']++;
            Scount[s.charAt(i) - 'a']++;
        }

        if (matches(Pcount, Scount)) {
            res.add(0);
        }

        for (int r = pLen; r < sLen; r++) {
            Scount[s.charAt(r) - 'a']++;
            Scount[s.charAt(r - pLen) - 'a']--;

            if (matches(Pcount, Scount)) {
                res.add(r - pLen + 1);
            }
        }

        return res;
    }

    static boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
