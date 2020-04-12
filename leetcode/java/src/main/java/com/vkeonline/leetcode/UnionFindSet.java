package com.vkeonline.leetcode;

import java.util.*;

public class UnionFindSet {
    private int[] parents;
    private int[] ranks;

    UnionFindSet(int n) {
        parents = new int[n];
        ranks = new int[n];
        for (int i = 0; i < n; i++)
            parents[i] = i;
        Arrays.fill(ranks, 0);
    }

    /*
    @return true: if merged, false if already in one set
     */
    boolean union(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);
        if (rootU == rootV) return false;
        if (ranks[rootU] > ranks[rootV]) {
            parents[rootV] = rootU;
        } else if (ranks[rootU] < ranks[rootV]) {
            parents[rootU] = rootV;
        } else {
            parents[rootV] = rootU;
            ranks[rootV] += 1;
        }
        return true;
    }

    int find(int u) {
        if (u != parents[u])
            parents[u] = find(parents[u]);
        return parents[u];
    }
}