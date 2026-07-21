
public class Bitwise {
    /*
     * public static void main(String[] args) {
     * // System.out.println((4 & 5));
     * // System.out.println((5 | 6));
     * // System.out.println((5 ^ 6));
     * // System.out.println((~5));
     * // System.out.println((5 << 2));
     * System.out.println((6 >> 1));
     * }
     */
    // check the given number is even or odd
    public static void oddEven(int n) {
        if ((n & 1) == 0) {
            System.out.println("The given number is Even");
        } else {
            System.out.println("The given number is Odd");
        }
    }

    public static void main(String[] args) {
        oddEven(4);
    }
}
