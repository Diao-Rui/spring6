package org.leetcode;

import java.util.Arrays;

/**
 * @Author: Diao Rui
 * @className: Simple506
 * @Description: 506. 相对名次
 * @DateTime: 2023/8/2 17:43
 * @version: 1.0
 **/
public class Simple506 {
    public static void main(String[] args) {

    }

    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] desc = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        //对score数组进行索引排序
        int[][] arr = new int[score.length][2];
        for (int i = 0; i < score.length; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        //将分数从大到小排序
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        String[] ans = new String[n];
        for (int i = 0; i < n; ++i) {
            if (i >= 3) {
                ans[arr[i][1]] = Integer.toString(i + 1);
            } else {
                ans[arr[i][1]] = desc[i];
            }
        }
        return ans;
    }
}