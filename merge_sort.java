public class MergeSort {
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
    
    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        
        while (i <= mid) temp[k++] = array[i++];
        while (j <= right) temp[k++] = array[j++];
        
        for (i = 0; i < temp.length; i++) {
            array[left + i] = temp[i];
        }
    }
    
    public static void main(String[] args) {
        int[] array = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};
        System.out.println("Original: " + java.util.Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted:   " + java.util.Arrays.toString(array));
    }
}
