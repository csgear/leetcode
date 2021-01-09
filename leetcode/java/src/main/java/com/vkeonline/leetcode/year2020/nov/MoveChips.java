package com.vkeonline.leetcode.year2020.nov;

/**
 * @author csgear
 */
public class MoveChips {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                ++even;
            }
            else {
                ++odd;
            }
        }

        return Math.min (even, odd);
    }
}
