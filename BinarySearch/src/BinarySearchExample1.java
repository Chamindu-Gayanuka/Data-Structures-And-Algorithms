public class BinarySearchExample1 {
    public static void main(String[] args) {
        int array[] = new int[1000];
        int target = 150;

        // Set up the array with values same as their index
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Perform binary search for a specific value
        int index = binarySearch(array, target);

        if (index >= 0) {
            System.out.println("Value " + target + " found at index: " + index);
        } else {
            System.out.println("Value " + target + " not found in the array.");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int min = 0;
        int max = array.length - 1;
        while (min <= max) {
            int middle = (min + max) / 2;
            int value = array[middle];
            System.out.println("min: " + min + ", max: " + max + ", middle: " + middle + ", value: " + value);
            if (value < target) min = middle + 1;
            else if (value > target) max = middle - 1;
            else return middle; // Found the target
        }
        return -1;
    }
}
