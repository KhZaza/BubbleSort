package sjsu.edu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arr1[] =new int[]{ 12,54,21,84456,321,456,213,2};
        int size = arr1.length;
        System.out.println(Arrays.toString(arr1));

        for (int i= size-1; i>=1; i--) {
            for (int j = 1; j <= i ; j++) {
                if (arr1[j - 1] > arr1[j]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j - 1];
                    arr1[j - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));


    }
}
