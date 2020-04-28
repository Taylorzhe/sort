import java.util.Arrays;
import java.util.Random;

/**
 * 描述：
 */
public class DataCheck {

    public static void main(String[] args) {
        check();
    }

    public static void check(){
        for (int k=0; k<100; k++) {
            Random r = new Random(10000);
            int[] arr = new int[1000];
            int[] arr1 = new int[1000];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = r.nextInt(10000);
            }
            System.arraycopy(arr, 0, arr1, 0, arr.length);

            Arrays.sort(arr);
//            SelectionSort.sort(arr1);
//            BubbleSort.sort(arr1);
//            InsertionSort.sort(arr1);
//            ShellSort.sort(arr1);
//            QuickSort.sort(arr1, 0, arr.length-1);
            MergeSort.sort(arr1, 0, arr1.length-1);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr1[i]) {
                    System.out.println("排序算法错误");
                    break;
                }
            }
        }
        System.out.println("算法完全正确");
    }
}
