package problem_03;

public class Main {
    public static void main(String[] args) {
        System.out.println("String performance :");
       DemoString.checkPerformance(1000);
       DemoString.checkPerformance(10000);
       DemoString.checkPerformance(1000000);
        System.out.println();

        System.out.println("StringBuffer performance :");
       DemoStringBuffer.checkPerformance(1000);
       DemoStringBuffer.checkPerformance(10000);
       DemoStringBuffer.checkPerformance(1000000);
        System.out.println();

        System.out.println("StringBuilder performance");
        DemoStringBuilder.checkPerformance(1000);
        DemoStringBuilder.checkPerformance(10000);
        DemoStringBuilder.checkPerformance(1000000);
    }
}
