package scmethod1;

public class SCMethod1 {

    // Method to find the maximum element in an array
    public static int findMaxElement(int[] array) {
        // Check if the array is not empty
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        // Initialize the maxElement with the first element of the array
        int maxElement = array[0];

        // Iterate through the array to find the maximum element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        // Return the maximum element
        return maxElement;
    }

    public static void main(String[] args) {
        // Example usage
        int A[] = {3, 7, 1, 9, 5, 2};
        int maxElement = findMaxElement(A);

        System.out.println("Maximum element in the array: " + maxElement);
    }
}
