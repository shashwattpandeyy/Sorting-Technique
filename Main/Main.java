package Main;

import BubbleSort.Bubble;
import InsertionSort.InsertionSort;
import SelectionSort.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter the size of Array" );
        int size = scanner.nextInt ();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random () * 1000);
        }
        System.out.println ( Arrays.toString ( array ) );
        System.out.println ( "Enter 1 for Bubble Sort" );
        System.out.println ( "Enter 2 for Selection Sort" );
        System.out.println ( "Enter 3 for Insertion Sort" );
        int select = scanner.nextInt ();
        switch (select) {
            case 1: /* Bubble Sort */
                Bubble br = new Bubble ();
                br.BubbleSort ( array );
                System.out.println ( "Sorted Bubble Sort are: " );
                System.out.println ( Arrays.toString ( array ) );
                break;
            case 2: /*Selection Sort */
                SelectionSort sc = new SelectionSort ();
                sc.sort ( array );
                System.out.println ( "Sorted Selection Sort are: " );
                System.out.println ( Arrays.toString ( array ) );
                break;
            case 3: /*Insertion Sort */
                InsertionSort is = new InsertionSort ();
                is.sort ( array );
                System.out.println ( "Sorted Insertion Sort are: " );
                System.out.println ( Arrays.toString ( array ) );
        }
        scanner.close ();


    }
}

