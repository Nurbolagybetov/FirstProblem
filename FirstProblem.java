package assignment1;

import java.util.Scanner;

public class FirstProblem {
    /*
    *This method returns the smallest number from an array.
    *Time complexity: 0(n), where n is length of input array.
    *Complexity class: linear
    *@param arr The array of integers where we need to find smallest.
    *@return minVal The smallest integer from the array
     */
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert nanoseconds to  milliseconds
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = findMin(arr);
        System.out.println("Time taken " + duration + " milliseconds");
        System.out.println("Minimum number is " + min);
    }
    public static int findMin(int[] arr){
        if(arr.length == 0){
            System.out.println("Array is empty");
            return 0;
        }
        int minVal = arr[0];
        for(int i = 0;i < arr.length; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }
}