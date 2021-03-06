package com.vkeonline.leetcode.year2020.sept;

/**
 * @author csgear
 */
public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        final char SPACE = ' ';
        int i = s.length() - 1;
        int result = 0;
        while (i >= 0 && s.charAt(i) == SPACE) {
            i--;
        }

        while (i >= 0 && s.charAt(i) != SPACE) {
            result++;
            i--;
        }

        return result;
    }
}
