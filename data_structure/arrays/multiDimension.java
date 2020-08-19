package data_structure.arrays;

/*
    Simple code to create mutli-dimensional array, 
    initialize and print the elements
*/

public class multiDimension {
    public static void main(String args[]) {

        // decler and intialize a 2D array
        int[][] arr2d = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        // print the 2d array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr2d[i][j] + " ");
            }

            // move to anew line
            System.out.println();
        }
    }
}
