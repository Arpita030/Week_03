package problem_06;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array Searching Performance :");
        DemoArray.checkPerformance(1000);
        DemoArray.checkPerformance(100000);
        DemoArray.checkPerformance(1000000);
        System.out.println();

        System.out.println("Hashset Searching Performance :");
        DemoHashSet.checkPerformance(1000);
        DemoHashSet.checkPerformance(100000);
        DemoHashSet.checkPerformance(1000000);
        System.out.println();

        System.out.println("TreeSet Searching Performance :");
        DemoTreeSet.checkPerformance(1000);
        DemoTreeSet.checkPerformance(100000);
        DemoTreeSet.checkPerformance(1000000);
    }
}
