package linear_search.problem_01;
public class FirstNegativeNumber {

    public static int negativenumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}
