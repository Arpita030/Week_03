package problem_04;

public class Main {
    public static void main(String[] args) {
        System.out.println("FileReader Performance :");
        DemoFileReader.checkPerformance("src/main/resources/sample1mb.txt");
        DemoFileReader.checkPerformance("src/main/resources/sample100mb.txt");
        DemoFileReader.checkPerformance("src/main/resources/sample500mb.txt");
        System.out.println();

        System.out.println("InputStreamReader Performance :");
        DemoInputStreamReader.checkPerformance("src/main/resources/sample1mb.txt");
        DemoInputStreamReader.checkPerformance("src/main/resources/sample100mb.txt");
        DemoInputStreamReader.checkPerformance("src/main/resources/sample500mb.txt");

    }
}
