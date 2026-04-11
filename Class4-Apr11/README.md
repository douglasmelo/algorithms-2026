# Class 4 - Algorithms

## Selection Sort

Selection Sort is a simple sorting algorithm that builds a final sorted array one element at a time. It works by repeatedly finding the minimum element from the unsorted part of the array and putting it at the end of the sorted portion.

### How it Works
1. Scan the array to find the smallest element.
2. Remove it from its current position and append it to the new sorted array (or swap it into its correct ordered place).
3. Repeat steps 1 and 2 until the unsorted portion of the array is empty.

### Complexity
- **Time Complexity**: `O(N^2)` — Finding the smallest element requires checking `N` items. Since we have to do this `N` times to sort a list of `N` items, the operations total roughly $O(N \times N) = O(N^2)$.
- **Space Complexity**: The implementation we studied uses `O(N)` auxillary memory because we allocate a `newArr` to hold our results and smaller arrays during the process. By contrast, a more optimized, in-place version can achieve `O(1)` space complexity.

### Java Implementation Note
The classic implementation shown in the course materials removes an element continuously, adding it to a newly sized array:

```java
public static int[] selectionSort(int[] arr) {
    // Array to store our sorted elements
    int[] newArr = new int[arr.length];
    
    // Using newArr.length guarantees we loop exactly N times
    for (int i = 0; i < newArr.length; i++) {
        int smallest = findSmallest(arr);
        newArr[i] = arr[smallest];
        
        // Remove the element from the original array
        arr = removeElement(arr, smallest);
    }
    return newArr;
}
```

### LinkedList Implementation
Using a dynamic data structure like `java.util.LinkedList` makes Selection Sort more elegant because elements can be popped directly from the list without manually instantiating new shorter arrays.

**Complexity**
- **Time Complexity**: `O(N^2)`. Finding the smallest element still requires iterating through the unsorted items, which must happen `N` times. (*Note: Using `list.get(i)` in a true `LinkedList` can degrade performance to `O(N^3)` if not using an `Iterator`, but the base algorithm is `O(N^2)`.*)
- **Space Complexity**: `O(N)` because we create a new `List` to hold the final sorted elements.

```java
public static List<Integer> selectionSort(List<Integer> list) {
    List<Integer> newList = new LinkedList<>();
    
    // As long as there are elements left in the original list...
    while (!list.isEmpty()) {
        int smallestIndex = findSmallestIndex(list);
        // Remove the smallest element from the original list and append to the new list
        newList.add(list.remove(smallestIndex));
    }
    return newList;
}
```

> [!TIP]
> **Java Best Practice: Programming to an Interface**
> Notice that the method signature uses the `List<Integer>` interface rather than the concrete class `LinkedList<Integer>`. By programming to an interface, your code becomes far more flexible. The `selectionSort` method can now accept any `List` implementation (such as an `ArrayList` or `Vector`) without requiring any code changes to the sorting logic.
