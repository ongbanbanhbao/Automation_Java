package lesson2;

import java.util.Arrays;

public class Exercise03 {
    public static void main(String[] args) {
        int[] myArr = {9, 3, 6, 4, 1, 9, 8, 2, 3};
        System.out.printf("----NOT SORTED YET----\n");
        for (int valueNotSorted : myArr) {
            System.out.print(valueNotSorted + " ");
        }

        Arrays.sort(myArr);
        System.out.println("\n---------SORTED--------");
        for (int valueSorted : myArr) {
            System.out.print(valueSorted + " ");
        }
    }
}
