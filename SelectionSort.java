public class SelectionSort {

    // This method is now ready to be used by the experiment script!
    public static void sort(int[] arr) {
        int comparisons = 0;
        int n = arr.length;
        int n swap = 0;

        System.out.println("=== Selection Sort ===");
        System.out.println("Original array: " + arrayToString(arr));

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

                swaps++;
            }

            if (i < 3) {
                System.out.println("After pass " + (i + 1) + ": "
                        + arrayToString(arr));
            }
        }

        System.out.println("Sorted array: " + arrayToString(arr));
        System.out.println("Total data-value comparisons: " + comparisons);
        System.out.println("Total swaps: " + swaps);
    }

    private static String arrayToString(int[] arr) {

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < arr.length; i++) {

            sb.append(arr[i]);

            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();

       }
}
