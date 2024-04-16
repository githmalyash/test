public class ArrayRemoveExample {
    public static void main(String[] args) {
        // Create an array with values 10, 30, 50, 70, 90
        int[] myArray = {10, 30, 50, 70, 90};

        // Remove element 50 at index 2
        removeElementAtIndex(myArray, 2);

        // Display the array elements
        displayArrayElements(myArray);
    }

    // Method to remove an element at a specific index in an array
    private static void removeElementAtIndex(int[] array, int index) {
        // Check if the index is valid
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
            return;
        }

        // Create a new array with reduced size
        int[] newArray = new int[array.length - 1];

        // Copy elements before the index from the original array to the new array
        System.arraycopy(array, 0, newArray, 0, index);

        // Copy elements after the index from the original array to the new array
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);

        // Update the original array reference to the new array
        System.arraycopy(newArray, 0, array, 0, newArray.length);
    }

    // Method to display array elements
    private static void displayArrayElements(int[] array) {
        System.out.print("Array elements: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
