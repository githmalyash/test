import java.util.Arrays;

public class StudentDatabase {
    public static void main(String[] args) {
        // Assuming that the students are given a unique number on their admission
        int[] studentNumbers = {78, 89, 90, 12, 65};

        // ii. Find student number 90
        int searchNumber = 90;
        boolean isStudentPresent = searchStudent(studentNumbers, searchNumber);

        if (isStudentPresent) {
            System.out.println("Student number " + searchNumber + " is present.");
        } else {
            System.out.println("Student number " + searchNumber + " is not present.");
        }

        // iii. Insert a new student with student number 45 at position 3 of the array
        int newStudentNumber = 45;
        insertStudent(studentNumbers, newStudentNumber, 3);

        // iv. Delete student number 89
        int studentToDelete = 89;
        deleteStudent(studentNumbers, studentToDelete);

        // v. Display the current items available in the array
        displayStudentNumbers(studentNumbers);
    }

    // Method to search for a student in the array
    private static boolean searchStudent(int[] studentNumbers, int searchNumber) {
        for (int number : studentNumbers) {
            if (number == searchNumber) {
                return true; // Student found
            }
        }
        return false; // Student not found
    }

    // Method to insert a new student at a specific position in the array
    private static void insertStudent(int[] studentNumbers, int newStudentNumber, int position) {
        // Check if the position is valid
        if (position < 0 || position > studentNumbers.length) {
            System.out.println("Invalid position for insertion.");
            return;
        }

        // Create a new array with increased size
        int[] newArray = new int[studentNumbers.length + 1];

        // Copy elements before the position from the original array to the new array
        System.arraycopy(studentNumbers, 0, newArray, 0, position);

        // Insert the new student number at the specified position
        newArray[position] = newStudentNumber;

        // Copy elements after the position from the original array to the new array
        System.arraycopy(studentNumbers, position, newArray, position + 1, studentNumbers.length - position);

        // Update the original array reference to the new array
        System.arraycopy(newArray, 0, studentNumbers, 0, newArray.length);

        System.out.println("Student number " + newStudentNumber + " inserted at position " + position);
    }

    // Method to delete a student from the array
    private static void deleteStudent(int[] studentNumbers, int studentToDelete) {
        int indexToDelete = -1;

        // Find the index of the student number to delete
        for (int i = 0; i < studentNumbers.length; i++) {
            if (studentNumbers[i] == studentToDelete) {
                indexToDelete = i;
                break;
            }
        }

        // If the student number is found, delete it
        if (indexToDelete != -1) {
            // Create a new array with reduced size
            int[] newArray = new int[studentNumbers.length - 1];

            // Copy elements before the index to delete from the original array to the new array
            System.arraycopy(studentNumbers, 0, newArray, 0, indexToDelete);

            // Copy elements after the index to delete from the original array to the new array
            System.arraycopy(studentNumbers, indexToDelete + 1, newArray, indexToDelete, studentNumbers.length - indexToDelete - 1);

            // Update the original array reference to the new array
            System.arraycopy(newArray, 0, studentNumbers, 0, newArray.length);

            System.out.println("Student number " + studentToDelete + " deleted.");
        } else {
            System.out.println("Student number " + studentToDelete + " not found in the array.");
        }
    }

    // Method to display student numbers in the array
    private static void displayStudentNumbers(int[] studentNumbers) {
        System.out.print("Current student numbers: ");
        for (int number : studentNumbers) {
            System.out.print(number + " ");
        }
    }
}
