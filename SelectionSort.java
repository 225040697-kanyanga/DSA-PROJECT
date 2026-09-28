public class SelectionSort {

    // This method is now ready to be used by the experiment script!
    public static int sort(int[] arr) {
        int comparisons = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return comparisons; // Returns the total number of comparisons
    }
}
