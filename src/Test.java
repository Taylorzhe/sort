/**
 * 描述：
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,4,7,5,6,2,3,9,8};
        print(arr);
        System.out.println();
        QuickSort.sort(arr, 0, arr.length-1);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int a :
                arr) {
            System.out.print(a + ",");
        }
    }
}
