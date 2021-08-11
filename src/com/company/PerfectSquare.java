package com.company;
import java.util.Arrays;

public class PerfectSquare {

    public static String squarePatch(int n) {
        int[][] solution = new int[n][n];
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                solution[i][j] = n;
            }
        }
        return Arrays.deepToString(solution);
    }
}
