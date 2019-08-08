package POO;

import java.util.Arrays;

/**
 * Array is a collection of data of the same type with fixed-size
 */
/*Sintaxis:

    dataType[] variable;  This is the best way to do it.
    dataType variable []; //also works
 */
public class Array {
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static double[] reverseWithReturn(double[] list) {
        double[] result = new double[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public static void main(String args[]) {
        double[] myList2 = {1.1, 2.4, 3.5, 4.6, 5.5, 6.4, 7.2, 8.4, 9.6};
        double[] myList = {1.1, 2.4, 3.5, 4.6, 5.5, 6.4, 7.2, 8.4, 9.6};

        //print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }

        //Summing all the elements into array.
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("\nTotal is " + total);

        //Finding the largest element into the array
        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.print("Max is : " + max + "\n\n");


        //You can implement for each loops

        //print all the array elements
        for (double element : myList) {
            System.out.print(element + "\n");
        }
        //you can implement a method too
        printArray(myList);
        System.out.print("\n");
        reverseWithReturn(myList);
        System.out.print("\n");
        printArray(new double[]{1, 2, 3, 4});
        System.out.print("\n");
        //Sorts the specified array of objects into an ascending order, according to the natural ordering of its elements.
        Arrays.sort(myList);
        System.out.print("\n");
        //Assigns the specified int value to each element of the specified array of ints
        Arrays.fill(myList, 13);
        System.out.print("\n");
        //Searches the specified array of Object ( Byte, Int , double, etc.) for the specified value using the binary search algorithm. The array must be sorted prior to making this call. This returns index of the search key, if it is contained in the list; otherwise, it returns ( – (insertion point + 1)).
        Arrays.binarySearch(myList, 30);
        System.out.print("\n");
        //Returns true if the two specified arrays of longs are equal to one another. Two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs of elements in the two arrays are equal
        Arrays.equals(myList, myList2);

    }
}
