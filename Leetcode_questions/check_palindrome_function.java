package Leetcode_questions;

import java.util.Scanner;

public class check_palindrome_function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(isPalindrome(n));
    }
    static boolean isPalindrome(int n) {
            if (n < 0) {
                return false; // Negative numbers are not palindromes
            }

            int org = n;
            int ans = 0;

            while (n > 0) {
                int rem = n % 10;
                ans = ans * 10 + rem;
                n = n / 10;
            }

            return ans == org;
        }
    }


