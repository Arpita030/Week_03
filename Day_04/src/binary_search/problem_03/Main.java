package binary_search.problem_03;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target1 = 3;
        int target2 = 13;

        System.out.println("Searching for " + target1 + ": " + MatrixBinarySearch.searchMatrix(matrix, target1));
        System.out.println("Searching for " + target2 + ": " + MatrixBinarySearch.searchMatrix(matrix, target2));
    }
}
