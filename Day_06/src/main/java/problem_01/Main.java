package problem_01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Search Performance:");
        LinearSearch.checkPerformance(1000, 999);
        LinearSearch.checkPerformance(10000, 9999);
        LinearSearch.checkPerformance(1000000, 999999);
        System.out.println();

        System.out.println("Binary Search Performance:");
        BinarySearch.checkPerformance(1000,999);
        BinarySearch.checkPerformance(10000,9999);
        BinarySearch.checkPerformance(1000000,999999);

    }
}
