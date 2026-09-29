public class QuickSort {

    
    public static int sort(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    
    private static int quickSort(int[] arr, int low, int high) {
        int comparisons = 0;
        if (low < high) {
            
            int[] partitionResult = partition(arr, low, high);
            int pivotIndex = partitionResult[0];
            comparisons += partitionResult[1]; 

            
            comparisons += quickSort(arr, low, pivotIndex - 1);
        
            comparisons += quickSort(arr, pivotIndex + 1, high);
        }
        return comparisons;
    }


    private static int[] partition(int[] arr, int low, int high) {
        int pivot = arr[high]; 
        int i = (low - 1);
        int comparisons = 0;

        for (int j = low; j < high; j++) {
            comparisons++;  
                if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        
        return new int[]{i + 1, comparisons};
    }
}
