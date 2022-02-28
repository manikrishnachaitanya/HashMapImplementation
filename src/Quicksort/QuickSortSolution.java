package Quicksort;

import java.util.Random;

public class QuickSortSolution {

    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i=0; i< numbers.length; i++)
        {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before sorting");
        print(numbers);

        quicksort(numbers, 0, numbers.length-1);

        System.out.println("\nAfter sorting");
        print(numbers);
    }

    private static void quicksort(int[] numbers, int lowIndex, int highIndex)
    {
        if(lowIndex>= highIndex)
            return;
        int pivot = numbers[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while(leftPointer < rightPointer)
        {
            while(numbers[leftPointer] <= pivot && leftPointer < rightPointer)
            {
                leftPointer++;
            }
            while(numbers[rightPointer] >= pivot && leftPointer < rightPointer)
            {
                rightPointer--;
            }
            swap(numbers, leftPointer, rightPointer);
        }
        swap(numbers, leftPointer, highIndex);
        System.out.println("");
        System.out.println("pivot == "+ pivot);
        print(numbers);
        quicksort(numbers, lowIndex, leftPointer-1);
        quicksort(numbers, leftPointer+1, highIndex);
    }

    private static void swap(int[] numbers, int index1, int index2)
    {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    private static void print(int[] numbers)
    {
        for (int i=0; i< numbers.length; i++)
        {
            System.out.print(numbers[i] + "\t");
        }
    }
}
