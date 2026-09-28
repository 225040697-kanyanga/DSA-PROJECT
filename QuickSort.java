public class QuickSort {

    public static int[] quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int pivot = arr[0];

        // Count elements for left and right partitions
        int leftCount = 0;
        int rightCount = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= pivot) {
                leftCount++;
            } else {
                rightCount++;
            }
        }

        int[] left = new int[leftCount];
        int[] right = new int[rightCount];

        int l = 0;
        int r = 0;

        // Create the partitions
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= pivot) {
                left[l++] = arr[i];
            } else {
                right[r++] = arr[i];
            }
        }

        // Recursively sort both partitions
        left = quickSort(left);
        right = quickSort(right);

        // Combine left + pivot + right
        int[] result = new int[arr.length];
        int index = 0;

        for (int value : left) {
            result[index++] = value;
        }

        result[index++] = pivot;

        for (int value : right) {
            result[index++] = value;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] services = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};

        int[] sorted = quickSort(services);

        System.out.print("Sorted array: ");

        for (int value : sorted) {
            System.out.print(value + " ");
        }
    }
}
