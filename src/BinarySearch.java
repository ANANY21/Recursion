public class BinarySearch{
    public static void main(String[] args) {
        int[] a = {4, 6, 7, 8, 9, 10, 12};
        int target = 9;
        System.out.println(BS(a, target, 0, a.length - 1));
    }

    static int BS(int[] arr, int target, int s, int e) {
        if (s > e) return -1;
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) return mid;

        if (arr[mid] < target) {
            return BS(arr, target, mid + 1, e);
        } else {
            return BS(arr, target, s, mid - 1);
        }
    }
}
