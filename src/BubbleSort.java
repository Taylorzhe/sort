/**
 * 描述：冒泡排序
 */
public class BubbleSort {

    public static void sort(int[] arr){
        for (int i=0; i<arr.length; i++){
            boolean flag = true;
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1])
                    swap(arr, j, j+1);
                flag = false;
            }
            if (flag) break;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
