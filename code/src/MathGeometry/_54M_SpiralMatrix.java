package MathGeometry;

import java.util.*;

public class _54M_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int topBound = 0;
        int bottomBound = matrix.length-1;
        int leftBound = 0;
        int rightBound = matrix[0].length-1;


        while (leftBound <= rightBound && topBound <= bottomBound) {

            for (int i = leftBound; i <= rightBound; i++) {
                list.add(matrix[topBound][i]);
            }
            topBound++;

            for (int i = topBound; i <= bottomBound; i++) {
                list.add(matrix[i][rightBound]);
            }
            rightBound--;

            if (leftBound <= rightBound && topBound <= bottomBound){
                for (int i = rightBound; i >= leftBound; i--) {
                    list.add(matrix[bottomBound][i]);
                }

            }
            bottomBound--;

            if (leftBound <= rightBound && topBound <= bottomBound){
                for (int i = bottomBound; i >= topBound; i--) {
                    list.add(matrix[i][leftBound]);
                }

            }
            leftBound++;


        }

        return list;
    }
}
