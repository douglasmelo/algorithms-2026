public class BinarySearch {

    public static void main(String[] args) {
        // int[] array100 = new int[100];
        // for (int i = 0; i < array100.length; i++) {
        // array100[i] = i + 1;
        // }

        int[] list = { 1, 3, 5, 7, 9 };
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 3));
        System.out.println(binarySearch(list, 9));
        System.out.println(binarySearch(list, -500));
    }

    // list [1, 3, 5, 7, 9] //values
    // list [0, 1, 2, 3, 4] //indexes

    // list [1, 3]
    // list [0, 1]

    // list [1]
    // list [0]

    // list [7, 9]
    // list [3, 4]

    // list[9]
    // list[4]
    /**
     * Binary Search Algorithm
     * 
     * @param list The sorted list to search in
     * @param item The item to search for
     * @return The index of the item if found, -1 otherwise
     */
    public static int binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
