public class ArrayExample {
    public static void main(String[] args) {
        
        int[] myArray = {10, 25, 5, 85, 60};
        
        insertValueAtIndex(myArray, 2, 67);

        displayArrayElements(myArray);
    }

    
    private static void insertValueAtIndex(int[] array, int index, int value) {
        
        if (index < 0 || index > array.length) {
            System.out.println("Invalid index");
            return;
        }

        
        int[] newArray = new int[array.length + 1];

        
        System.arraycopy(array, 0, newArray, 0, index);

      
        newArray[index] = value;

        
        System.arraycopy(array, index, newArray, index + 1, array.length - index);

       
        System.arraycopy(newArray, 0, array, 0, newArray.length);
    }

    private static void displayArrayElements(int[] array) {
        System.out.print("Array elements: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
