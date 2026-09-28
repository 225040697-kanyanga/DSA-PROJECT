import java.util.Random;
import java.util.Arrays;

public class SortingExperiment {
    public static void runExpreriment() {
        int[] sizes = {20, 50, 100, 500};
        Random rand = new Random();

        System.out.println("==================================================================");
        System.out.println("                     ALGORITHM EXPERIMENT TEST                    ");
        System.out.println("==================================================================");

        for (int size : sizes) {
            // Generate the random base array
            int[] original = new int[size];
            for (int i = 0; i < size; i++) {
                original[i] = rand.nextInt(10000); // Random numbers up to 10,000
            }

            System.out.println("\n--- Testing Array Size: " + size + " ---");
            runAllAlgorithms(original);
        }

        // --- Run the "Almost-Sorted" Special Test ---
        System.out.println("\n==================================================================");
        System.out.println("               SPECIAL TEST: ALMOST-SORTED ARRAY (SIZE 100)       ");
        System.out.println("==================================================================");
        
        int[] almostSorted = new int[100];
        for (int i = 0; i < 100; i++) {
            almostSorted[i] = i; // Create a perfectly sorted array [0, 1, 2... 99]
        }
        
        // Manually swap exactly 5 pairs of neighboring elements to make it "almost-sorted"
        int[][] pairsToSwap = {{12, 13}, {34, 35}, {56, 57}, {78, 79}, {90, 91}};
        for (int[] pair : pairsToSwap) {
            int temp = almostSorted[pair[0]];
            almostSorted[pair[0]] = almostSorted[pair[1]];
            almostSorted[pair[1]] = temp;
        }

        runAllAlgorithms(almostSorted);
    }

    private static void runAllAlgorithms(int[] baseArray) {
        // Clone original arrays so each algorithm receives identical unsorted data
        int[] selectionData = baseArray.clone();
        int[] insertionData = baseArray.clone();
        int[] mergeData = baseArray.clone();
        int[] quickData = baseArray.clone();

        // 1. Selection Sort Benchmark
        long start = System.nanoTime();
        int compSelection = SelectionSort.sort(selectionData);
        long timeSelection = System.nanoTime() - start;
        System.out.printf("%-15s | Comparisons: %-6d | Time: %-8d ns\n", "Selection Sort", compSelection, timeSelection);

        // 2. Insertion Sort Benchmark
        start = System.nanoTime();
        int compInsertion = InsertionSort.sort(insertionData);
        long timeInsertion = System.nanoTime() - start;
        System.out.printf("%-15s | Comparisons: %-6d | Time: %-8d ns\n", "Insertion Sort", compInsertion, timeInsertion);

        // 3. Merge Sort Benchmark
        start = System.nanoTime();
        int compMerge = MergeSort.sort(mergeData);
        long timeMerge = System.nanoTime() - start;
        System.out.printf("%-15s | Comparisons: %-6d | Time: %-8d ns\n", "Merge Sort", compMerge, timeMerge);

        // 4. Quick Sort Benchmark
        start = System.nanoTime();
        int compQuick = QuickSort.sort(quickData);
        long timeQuick = System.nanoTime() - start;
        System.out.printf("%-15s | Comparisons: %-6d | Time: %-8d ns\n", "Quick Sort", compQuick, timeQuick);
    }
}
