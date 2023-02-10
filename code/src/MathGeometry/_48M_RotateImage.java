package MathGeometry;

public class _48M_RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix[0].length;
        int keepAdd = 0;

        int bound;
        int one;
        int tem1;
        int two;
        int tem2;
        int three;
        int tem3;



        for (int i = n-1; i > 0 ; i = i-2) {

            bound = i + keepAdd;

            for (int j = keepAdd; j < bound; j++) {

                one = j;
                tem1 = matrix[one][bound];
                matrix[one][bound] = matrix[keepAdd][j];

                two = bound - one + keepAdd;
                tem2 = matrix[bound][two];
                matrix[bound][two] = tem1;

                three = two;
                tem3 = matrix[three][keepAdd];
                matrix[three][keepAdd] = tem2;

                matrix[keepAdd][j] = tem3;

            }

            keepAdd++;
        }

    }

    public static void main(String[] args) {

        int[][] a = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(a);
    }
}
