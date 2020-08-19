package data_structure.arrays;

/* 
    Simple code to remove duplicate elements from a sorted array,
    and return the size of the new array.

    passing array to function is passing by reference.
*/

class noDuplicates {
    public static void main(String args[]) {

        // declare and initialize a sorted array
        int[] arr = { 2, 3, 3, 4, 4, 4, 5, 6, 7, 7, 7, 8 };

        // number of elements
        int n = arr.length;

        int un = removeDup(arr, n);

        // print the unique-elements array
        for (int i = 0; i < un; i++)
            System.out.print(arr[i] + " ");
    }

    private static int removeDup(int[] arr, int n) {

        // if the size of the array is <=1, then no duplicates
        if (n == 0 || n == 1)
            return n;

        // else check for duplicates
        int u = 0; // the index of next unique element

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[u] = arr[i];
                u++;
            }
        }

        // add the last element
        arr[u] = arr[n - 1];

        return u + 1;
    }
}