
public class Operations {
    public static int getIth(int n, int ith) {
        int bitMask = 1 << ith;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int n, int ith) {
        int bitMask = 1 << ith;
        return n | bitMask;
    }

    public static void main(String[] args) {
        // int res = getIth(10, 2);
        int res = setBit(10, 2);
        System.out.println(res);
    }
}
