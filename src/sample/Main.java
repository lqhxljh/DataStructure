package sample;


import com.ljh.data.sort.SortUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        int[] arr = {9, 8, 7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(arr));
        int[] temp = SortUtils.mergeSort(arr);
        System.out.println(Arrays.toString(temp));
    }
}
