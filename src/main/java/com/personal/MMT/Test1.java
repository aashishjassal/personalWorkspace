package com.personal.MMT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {

        String[] token = new String[] {"Hi", "I", "am", "Aashish"};
        int count = 1;
        Set<List<String>> fin = new HashSet<>();
        while (count <= token.length) {
            for (int i = 0; i < token.length; i++) {
                if (i + count <= token.length) {
                    List<String> temp = new ArrayList<>();
                    populateRemTokens(temp, token, 0, i);
                    temp.add(getConcatenatedStr(token, i, i + count));
                    populateRemTokens(temp, token, i + count, token.length);
                    fin.add(temp);
                }
            }
            count++;
        }
        System.out.println(fin);

    }

    private static String getConcatenatedStr(String[] tokens, int startIndex, int endIndex) {
        String s = "";
        for (int i = startIndex; i < endIndex; i++) {
            s += tokens[i];
        }
        return s;
    }

    private static void populateRemTokens(List<String> temp, String[] tokens, int startIndex, int endIndex) {

        for (int i = startIndex; i < endIndex; i++) {
            temp.add(tokens[i]);
        }

    }

}
