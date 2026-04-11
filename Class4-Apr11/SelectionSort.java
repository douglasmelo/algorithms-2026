import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] sortedArr = selectionSort(new int[] { 5, 3, 6, 2, 10 }); // [5, 3, 6, 2, 10]
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        int smallestIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int[] selectionSort(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            int smallest = findSmallest(arr);
            newArr[i] = arr[smallest];
            arr = removeElement(arr, smallest);
        }
        return newArr;
    }

    public static int[] removeElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i > index) {
                newArr[i - 1] = arr[i];
            }
        }
        return newArr;
    }

}