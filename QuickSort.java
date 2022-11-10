public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {// base case
            return;
        }
        // we have to find piviot
        // last element taken as pivot
        int pidx = partition(arr, si, ei);// magic karega
        quickSort(arr, si, pidx - 1);// left
        quickSort(arr, pidx + 1, ei);// right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;// to make place for element smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // pivot ko sahi jagah prr laane k liye
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];// don't pivot =arr[i]
        arr[i] = temp;
        return i;// pivot ka sahi space
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8, 2, 5, -5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
