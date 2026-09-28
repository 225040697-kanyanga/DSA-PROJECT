public class InsertionSort {

    
    public static int sort(int[] arr) {
        int comparisons = 0;
        int n = arr.length;
        int shifts = 0;

        System.out.println("=== Insertion Sort ===");
        System.out.println("Original array: " + arrayToString(arr));

        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    shifts++;
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;

            if (i <= 3) {
                System.out.println("After pass " + i + ": " + arrayToString(arr));
            }
        }

        System.out.println("Sorted array: " + arrayToString(arr));
        System.out.println("Total data-value comparisons: " + comparisons);
        System.out.println("Total shifts: " + shifts);
        return 0;
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
