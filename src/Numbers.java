public class Numbers {
    public static void main(String[] args){
        int ans = num(1234);
        System.out.println(ans);
    }

    static int num(int n) {
        if (n == 0) return 0;


        return (n % 10) + num(n / 10);
    }
}
