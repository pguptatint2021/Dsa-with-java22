public class solution {//solution of question 1.
    public static String[] mergeSort(String[] arr, int lo, int hi) {//function 1
    if (lo == hi) {
    String[] A = { arr[lo] };
    return A;
    }
    int mid = lo + (hi - lo) / 2;
    String[] arr1 = mergeSort(arr, lo, mid);
    String[] arr2 = mergeSort(arr, mid + 1, hi);
    String[] arr3 = merge(arr1, arr2);
    return arr3;
    }
    static String[] merge(String[] arr1, String[] arr2) {//function 2
    int m = arr1.length;
    int n = arr2.length;
    String[] arr3 = new String[m + n];
    int idx = 0;
    int i = 0;
    int j = 0;
    while (i < m && j < n) {
    if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
    arr3[idx] = arr1[i];
    i++;
    idx++;
    }
    else {
    arr3[idx] = arr2[j];
    j++;
    idx++;
    }
    }
    while (i < m) {
    arr3[idx] = arr1[i];
    i++;
    idx++;
    }
    while (j < n) {
    arr3[idx] = arr2[j];
    j++;
    idx++;
    }
    return arr3;
    }
    static boolean isAlphabeticallySmaller(String str1, String str2) {//check
    if (str1.compareTo(str2) < 0) {
    return true;
    }
    return false;
    }
    public static void main(String[] args) {//main
    String[] arr = { "jp","sb","jg","pg" };
    String[] a = mergeSort(arr, 0, arr.length - 1);
    for (int i = 0; i < a.length; i++) {
    System.out.println(a[i]);
    }
    }
    }
    
    

