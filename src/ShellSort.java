/**
 * 描述：希尔排序
 */
public class ShellSort {

    public static void sort(int[] arr){
        int h=1;
        while (h <= arr.length/3){
            h = h * 3 + 1;
        }
        for (int gap=h; gap>0; gap = (gap-1)/3) {
            for (int i=gap; i<arr.length; i++){
                for (int j=i; j>gap-1; j -= gap){
                    if (arr[j] < arr[j-gap]){
                        swap(arr, j, j-gap);
                    }
                }
            }
        }
    }

    private static void print(int[] arr) {
        for (int a :
                arr) {
            System.out.print(a + ",");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
