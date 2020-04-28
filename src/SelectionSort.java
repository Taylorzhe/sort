/**
 * 描述：
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int mark = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[mark]) {
                    mark = j;
                }
            }
            swap(arr, i, mark);
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
