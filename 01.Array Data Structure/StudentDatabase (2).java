public class StudentDatabase {
    public static void main(String[] args) {
        // Initialize the array with student numbers
        int[] studentNumbers = {78, 89, 90, 12, 65};

        // Display the initial array
        System.out.println("Initial array: ");
        displayArray(studentNumbers);

        // Find student number 90
        int studentToFind = 90;
        boolean isStudentPresent = searchStudent(studentNumbers, studentToFind);
        System.out.println("\nIs student number " + studentToFind + " present? " + isStudentPresent);

        // Insert a new student with number 45 at position 3
        int newStudentNumber = 45;
        int insertPosition = 2; // (Arrays in Java are zero-indexed)
        insertStudent(studentNumbers, newStudentNumber, insertPosition);
        System.out.println("\nArray after inserting student number " + newStudentNumber + " at position " + (insertPosition + 1) + ": ");
        displayArray(studentNumbers);

        // Delete student number 89
        int studentToDelete = 89;
        deleteStudent(studentNumbers, studentToDelete);
        System.out.println("\nArray after deleting student number " + studentToDelete + ": ");
        displayArray(studentNumbers);
    }

    // Method to search for a student in the array
    private static boolean searchStudent(int[] array, int studentNumber) {
        for (int number : array) {
            if (number == studentNumber) {
                return true; // Student found
            }
        }
        return false; // Student not found
    }

    // Method to insert a new student at a specified position in the array
    private static void insertStudent(int[] array, int newStudentNumber, int position) {
        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = newStudentNumber;
    }

    // Method to delete a student from the array
    private static void deleteStudent(int[] array, int studentNumber) {
        int indexToDelete = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == studentNumber) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete != -1) {
            for (int i = indexToDelete; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0; // Set the last element to 0 (or some default value)
        }
    }

    // Method to display the contents of the array
    private static void displayArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
