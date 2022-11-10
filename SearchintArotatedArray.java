public class SearchintArotatedArray {
    public static int Search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        // case Found
        if (arr[mid] == tar) {
            return mid;
        }
        // mid L1
        if (arr[si] < arr[mid]) {
            // case a
            if (arr[si] <= tar && tar <= arr[mid]) {
                return Search(arr, tar, si, mid - 1);
            }
            // case b
            else {
                return Search(arr, tar, mid + 1, ei);
            }
        }
        // mid L2
        else {
            // case c
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return Search(arr, tar, mid + 1, ei);
            }
            // case d
            else {
                return Search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int idx = Search(arr, target, 0, arr.length - 1);
        System.out.print(idx);

    }

}
