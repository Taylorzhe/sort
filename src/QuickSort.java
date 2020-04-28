/**
 * 描述：快速排序
 */
public class QuickSort {

    public static void sort(int[] arr, int left, int right){
        if (left >= right) return;
        int dp = partition(arr, left, right);
        sort(arr, left, dp-1);
        sort(arr, dp+1, right);
    }

    public static int partition(int[] arr, int leftBound, int rightBound){
        int pivot = arr[rightBound];
        int left = leftBound ;
        int right = rightBound - 1;

        while (left <= right){
            while (left <= right && arr[left] <= pivot)
                left++;
            while (left <= right && arr[right] > pivot)
                right--;

            if (left < right)
                swap(arr, left, right);
        }
        swap(arr, left, rightBound);
        return left;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
