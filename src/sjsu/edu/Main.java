package sjsu.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Bubble Sort");

        //open the file as a scanner
        Scanner scanner = new Scanner(new File("src/sjsu/edu/arr1-2.txt"));

        //Create an array to store the integers
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        //while loop to add the integers to the array
        while(scanner.hasNextInt()){
            arr1.add(scanner.nextInt());
        }

        //print the unsorted array
        System.out.println("Unsorted: " + arr1);
        //size of the array
        int size = arr1.size();

        //for loop to go through the size of the array decrement
        for (int i= size-1; i>=1; i--) {
            //for loop to go through the array
            for (int j = 1; j <= i ; j++) {
                //if the integer is bigger than the one after it then swap
                if (arr1.get(j - 1) > arr1.get(j)) {
                    //swap function
                    int temp = arr1.get(j);
                    arr1.set(j, arr1.get(j - 1));
                    arr1.set(j - 1, temp);
                }
            }
        }
        //print sorted

        System.out.println("Sorted: " + arr1);


    }
}


//output
/*
Bubble Sort
Unsorted: [76, 54, 47, 88, 64, 26, 59, 97, 71, 9, 97, 8, 79, 20, 77, 83, 65, 62, 76, 65, 92, 80, 36, 33, 59, 40, 96, 90, 94, 10, 38, 16, 52, 26, 35, 100, 53, 98, 19, 50, 62, 59, 74, 36, 10, 96, 89, 38, 76, 63]
Sorted: [8, 9, 10, 10, 16, 19, 20, 26, 26, 33, 35, 36, 36, 38, 38, 40, 47, 50, 52, 53, 54, 59, 59, 59, 62, 62, 63, 64, 65, 65, 71, 74, 76, 76, 76, 77, 79, 80, 83, 88, 89, 90, 92, 94, 96, 96, 97, 97, 98, 100]

 */