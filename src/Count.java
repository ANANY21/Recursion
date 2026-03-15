public class Count {
    static int count = 0;

    static int Zeroes(int n) {
        if (n == 0) return count;  // base case
        int rem = n % 10;
        if (rem == 0) {
            count++;
        }
        return Zeroes(n / 10);  // recursive call
    }

    public static void main(String[] args) {
        int num = 302030;
        System.out.println("Number of zeroes: " + Zeroes(num));
    }
}
