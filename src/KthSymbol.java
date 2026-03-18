
public class KthSymbol {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example test cases
        System.out.println(sol.kthGrammar(4, 5)); // Expected output: 1
        System.out.println(sol.kthGrammar(3, 4)); // Expected output: 1
        System.out.println(sol.kthGrammar(2, 2)); // Expected output: 1
        System.out.println(sol.kthGrammar(1, 1)); // Expected output: 0
    }
}

class Solution {
    public int kthGrammar(int n, int k) {
        // Base case
        if (n == 1 && k == 1) {
            return 0;
        }

        int mid = (int) Math.pow(2, n - 2);

        if (k <= mid) {
            // First half → same
            return kthGrammar(n - 1, k);
        } else {
            // Second half → inverse
            int val = kthGrammar(n - 1, k - mid);
            return 1 - val;
        }
    }
}
