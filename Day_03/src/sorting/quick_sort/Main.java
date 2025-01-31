package sorting.quick_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] productPrices = {1200, 500, 1500, 700, 300, 900};

        System.out.println("Original product prices: " + Arrays.toString(productPrices));

        QuickSortProduct.quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted product prices: " + Arrays.toString(productPrices));
    }
}
