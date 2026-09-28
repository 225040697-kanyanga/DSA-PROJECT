public class QuickSort {

    // Main entry point that the experiment script will call
    public static int sort(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    // Helper recursive method to track comparison counts
    private static int quickSort(int[] arr, int low, int high) {
        int comparisons = 0;
        if (low < high) {
            // Create an array to catch the comparison count from partition
            int[] partitionResult = partition(arr, low, high);
            int pivotIndex = partitionResult[0];
            comparisons += partitionResult[1]; // Add comparisons from this step

            // Sort left partition and add comparisons
            comparisons += quickSort(arr, low, pivotIndex - 1);
            // Sort right partition and add comparisons
            comparisons += quickSort(arr, pivotIndex + 1, high);
        }
        return comparisons;
    }

    // Partitions the array and returns both the pivot index and comparison count
    private static int[] partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // using the last element as pivot
        int i = (low - 1);
        int comparisons = 0;

        for (int j = low; j < high; j++) {
            comparisons++; // Track every data value comparison
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element to its correct place
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return [pivotIndex, comparisonCount]
        return new int[]{i + 1, comparisons};
    }
}
