package com.personal.searching;

public class RecursiveStringPatternSearch {

    public static void main(String[] args) {
        char[] text = "THIS".toCharArray();
        char[] pattern = "THIS".toCharArray();
        System.out.println(matches(text, pattern, 0, 0));
    }

    static boolean matches(char[] text, char[] pattern, int textIndex, int patternIndex) {
        if (patternIndex > pattern.length) {
            return true;
        }
        boolean result = false;
        while(textIndex<text.length) {
            if (text[textIndex] == pattern[patternIndex]) {
                result = matches(text, pattern, textIndex + 1, patternIndex + 1);
                return result;
            }else {
                result = matches(text, pattern, textIndex + 1, 0);
                return result;
            }
        }
        return result;
    }

}
