package Leetcode_questions;

public class Reverse_Words {
    public static void main(String[] args) {
        String s = " the sky is blue";
        System.out.println(reverseWords(s));


    }
    static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversedWords = new StringBuilder();

        for (int i = words.length - 1; i > 0; i--) {
            reversedWords.append(words[i]).append(" ");
        }

        if (words.length > 0) {
            reversedWords.append(words[0]);
        }

        return reversedWords.toString();
    }
}
