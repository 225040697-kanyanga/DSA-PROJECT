public class MergeSort {

    
    public static int sort(int[] array) {
        return mergeSort(array, 0, array.length - 1);
    }
    
    private static int mergeSort(int[] array, int left, int right) {
        int comparisons = 0;
        if (left < right) {
            int mid = (left + right) / 2;
        
            comparisons += mergeSort(array, left, mid);
        
            comparisons += mergeSort(array, mid + 1, right);
            
            comparisons += merge(array, left, mid, right);
        }
        return comparisons;
    }
    
    private static int merge(int[] array, int left, int mid, int right) {
        int comparisons = 0;
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        
        while (i <= mid && j <= right) {
            comparisons++; 
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
        
        return comparisons;
    }
}
