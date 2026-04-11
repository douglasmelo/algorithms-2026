import java.util.LinkedList;
import java.util.List;

public class SelectionSortLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(List.of(5, 3, 6, 2, 10));
        System.out.println("Original: " + list);
        
        List<Integer> sortedList = selectionSort(list);
        
        System.out.println("Sorted: " + sortedList);
    }

    // Finds the index of the smallest element in a List
    public static int findSmallestIndex(List<Integer> list) {
        int smallest = list.get(0);
        int smallestIndex = 0;
        
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    // Sorts the List by continuously popping the smallest element
    public static List<Integer> selectionSort(List<Integer> list) {
        List<Integer> newList = new LinkedList<>();
        
        // As long as there are elements left in the original list...
        while (!list.isEmpty()) {
            int smallestIndex = findSmallestIndex(list);
            // .remove(index) takes it out of the original list and returns it,
            // which we immediately add to our new sorted list.
            newList.add(list.remove(smallestIndex));
        }
        return newList;
    }
}
