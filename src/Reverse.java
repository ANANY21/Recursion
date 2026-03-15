public class Reverse {
    static int rev1(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        return sum;
    }

    static boolean palindrome(int n) {
        return n == rev1(n);
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println("Reverse: " + rev1(num));       // Output: 12321
        System.out.println("Palindrome? " + palindrome(num)); // Output: true
    }
}
