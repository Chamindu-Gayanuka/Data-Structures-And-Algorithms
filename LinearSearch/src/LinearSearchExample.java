public class LinearSearchExample {
    /*
     * Execution time is high if the data set is large.
     * Linear search checks each element one by one until it finds the target value or reaches the end of the list.
     * Good for small dataset
     */
    public static void main(String[] args) {
        int[] array = {23, 56, 78, 34, 23, 77, 55, 11, 34, 78, 32, 66, 99};

        int index = linearSearch(array, 34);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i; // Return the index of the found element
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
