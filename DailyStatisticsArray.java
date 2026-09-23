public class DailyStatisticsArray {

    public static void main(String[] args) {
    
        int[] serviceTimes = {12, 5, 8, 4, 15, 20, 3, 9, 11, 7};

        System.out.println("=== Daily Statistics: Array ===");
        System.out.print("Service times recorded today: ");
        printArray(serviceTimes);
        System.out.println();

        int totalStudents = serviceTimes.length;
        int totalTime = 0;
        int highest = serviceTimes[0];
        int lowest = serviceTimes[0];
        int longerThan10 = 0;

        for (int i = 0; i < serviceTimes.length; i++) {
            int time = serviceTimes[i];

            totalTime += time;

            if (time > highest) {
                highest = time;
            }
            if (time < lowest) {
                lowest = time;
            }
            if (time > 10) {
                longerThan10++;
            }
        }

        double average = (double) totalTime / totalStudents;

        System.out.println("Total students served : " + totalStudents);
        System.out.println("Total service time     : " + totalTime + " minutes");
        System.out.printf ("Average service time    : %.2f minutes%n", average);
        System.out.println("Highest service time    : " + highest + " minutes");
        System.out.println("Lowest service time     : " + lowest + " minutes");
        System.out.println("Services longer than 10 minutes: " + longerThan10);
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
