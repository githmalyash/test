public class ArraySearchExample {
    public static void main(String[] args) {
        // Create an array with values 19, 10, 8, 17
        int[] myArray = {19, 10, 8, 17};

        // Search for the element 8
        int searchElement = 8;
        int index = searchElementIndex(myArray, searchElement);

        // Display the index where the element is found
        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array");
        }
    }

    // Method to search for an element in an array and return its index
    private static int searchElementIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found in the array
    }
}