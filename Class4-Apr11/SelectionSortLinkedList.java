import java.util.LinkedList;
import java.util.List;

public class SelectionSortLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(List.of(5, 3, 6, 2, 10));
        // LinkedList<Integer> list = new LinkedList<>(List.of(5, 3, 6, 2, 10));
        System.out.println("Original: " + list);

        List<Integer> sortedList = selectionSort(list);

        System.out.println("Sorted: " + sortedList);
    }

    // Sorts the List in-place
    public static List<Integer> selectionSort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int smallestIndex = findSmallestIndex(list, i);

            // Swap the current element with the smallest element found
            int temp = list.get(i);
            list.set(i, list.get(smallestIndex));
            list.set(smallestIndex, temp);
        }
        return list;
    }

    // Finds the index of the smallest element in a List starting from a given index
    public static int findSmallestIndex(List<Integer> list, int startIndex) {
        int smallest = list.get(startIndex);
        int smallestIndex = startIndex;

        for (int i = startIndex + 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

}
