package day4_Array;

import java.util.Arrays;

public class Test01_binary {
    public static void main(String[] args) {

        int [] arr={1551,1223,1443,1267,1789,1023,2020};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,2020)); // 6.inci index



    }
}
