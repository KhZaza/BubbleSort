package sjsu.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Bubble Sort");


        Scanner scanner = new Scanner(new File("src/sjsu/edu/arr1-2.txt"));
//        int [] arr1 = new int [50];
//        int x = 0;
//        while(scanner.hasNextInt()){
//            arr1[x++] = scanner.nextInt();
//        }
//        int size = arr1.length;
//
//
//        System.out.println(Arrays.toString(arr1));
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        while(scanner.hasNextInt()){
            arr1.add(scanner.nextInt());
        }


        System.out.println(arr1);
        int size = arr1.size();

        for (int i= size-1; i>=1; i--) {
            for (int j = 1; j <= i ; j++) {
                if (arr1.get(j - 1) > arr1.get(j)) {
                    int temp = arr1.get(j);
                    arr1.set(j, arr1.get(j - 1));
                    arr1.set(j - 1, temp);
                }
            }
        }

        System.out.println(arr1);


    }
}
