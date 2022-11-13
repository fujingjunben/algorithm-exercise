package com.bigdeal.offer.s29;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        helper(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1, Direction.RIGHT, result);
        return result;
    }

    private void helper(int[][] matrix, int topRow, int bottomRow, int leftCol, int rightCol, Direction direction, List<Integer> result) {
        if (topRow == bottomRow && leftCol == rightCol){
            result.add(matrix[topRow][leftCol]);
            return;
        }
        switch (direction) {
            case RIGHT -> {
                int j = leftCol;
                while (j <= rightCol) {
                    result.add(matrix[topRow][j++]);
                }
                helper(matrix, topRow + 1, bottomRow, leftCol, rightCol, Direction.DOWN, result);
            }
            case DOWN -> {
                int i = topRow;
                while (i <= bottomRow) {
                    result.add(matrix[i++][rightCol]);
                }
                helper(matrix, topRow, bottomRow, leftCol, rightCol - 1, Direction.DOWN, result);
            }
            case LEFT -> {
                int j = rightCol;
                while (j >= leftCol) {
                    result.add(matrix[bottomRow][j++]);
                }
                helper(matrix, topRow, bottomRow - 1, leftCol, rightCol, Direction.DOWN, result);
            }
            case UP -> {
                int i = bottomRow;
                while (i >= topRow) {
                    result.add(matrix[i++][leftCol]);
                }
                helper(matrix, topRow, bottomRow, leftCol + 1, rightCol, Direction.DOWN, result);
            }
        }

    }

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
