package com.vkeonline.leetcode.year2020.july;

/**
 * @author csgear
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
