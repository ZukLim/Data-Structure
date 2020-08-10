
public class PascalTriangle {

    /**
     * Computes a binomial coefficient indexed by given n and k.
     *
     * @param n The row index of the binomial coefficient
     * @param k The column index of the binomial coefficient
     * @return The binomial coefficient indexed by given n and k
     */
    public static int computeBinomialCoef(int n, int k) {
        if (n < 0 || k < 0)
            throw new AssertionError("Invalid input!");

        if (n == k || k == 0) return 1;
        else {
            return computeBinomialCoef(n - 1, k - 1) + computeBinomialCoef(n - 1, k);
        }
    }

    /**
     * Prints a Pascal's triangle with n + 1 rows.
     *
     * @param n A number of rows in the triangle
     */
    public static void drawPascalTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(computeBinomialCoef(i, j) + " ");
            }
            System.out.println();
        }
    }
}