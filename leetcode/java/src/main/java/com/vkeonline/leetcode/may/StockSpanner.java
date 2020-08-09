package com.vkeonline.leetcode.may;

import java.util.Stack;

public class StockSpanner {
    Stack<int[] > spans ;

    public StockSpanner() {
        spans = new Stack<>();
    }

    public int next(int price) {
        int span = 1 ;
        while(! spans.isEmpty() && price >= spans.peek()[0]) {
            span += spans.peek()[1] ;
            spans.pop() ;
        }
        spans.push(new int[] {price, span}) ;

        return span ;
    }
}
