import java.util.Arrays;

public class BinarySearchExample2 {
    public static void main(String[] args) {
        int array[] = new int[1000];
        int target = 150;

        // Set up the array with values same as their index
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Perform binary search for a specific value
        int index = Arrays.binarySearch(array, target);

        if (index >= 0) {
            System.out.println("Value " + target + " found at index: " + index);
        } else {
            System.out.println("Value " + target + " not found in the array.");
        }
    }
}
