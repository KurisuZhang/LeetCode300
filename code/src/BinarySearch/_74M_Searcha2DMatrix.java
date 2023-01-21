package BinarySearch;

public class _74M_Searcha2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {

        int columnStart = -1;
        int columnEnd = matrix.length - 1;
        int columnMid = 0;

        while (columnStart < columnEnd) {

            columnMid = columnStart + (columnEnd - columnStart+1) / 2;

            if (target == matrix[columnMid][0]) {
                return true;
            } else if (target < matrix[columnMid][0]) {
                columnEnd = columnMid - 1;
            } else {
                columnStart = columnMid;
            }
        }

        int rowStart = 0;
        int rowEnd = matrix[columnStart].length-1;

        while (rowStart<=rowEnd){

            int rowMid = rowStart + (rowEnd - rowStart) / 2;

            if (target==matrix[columnStart][rowMid]){
                return true;
            }else if (target>matrix[columnStart][rowMid]){
                rowStart = rowMid + 1;
            }else {
                rowEnd = rowMid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] aaa = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(aaa,13));
    }
}
