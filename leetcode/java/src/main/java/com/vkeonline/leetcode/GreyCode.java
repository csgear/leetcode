package com.vkeonline.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csgear
 */
public class GreyCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);

        int k = 1;
        for (int i = 0; i < n; i++) {
            int m = result.size();
            for (int j = m - 1; j >= 0; j--) {
                result.add(k + result.get(j));
            }
            k = k * 2;
        }

        return result;
    }

}
