package org.example;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] s) {
        Arrays.sort(s);
        int index = 0;
        int first = s[0].length();
        int last = s[s.length - 1].length();
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        while(index < first && index < last && flag) {
            if (s[0].charAt(index) == s[s.length -1].charAt(index)) {
                sb.append(s[0].charAt(index));
                index++;
            } else {
                flag = false;
            }
        }
        return sb.toString();
    }
}
