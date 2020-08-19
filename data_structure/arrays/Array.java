package data_structure.arrays;

/*  Simple Java code to illustrate hot to create an array of ints,
and also how to assign values to that array.
*/

class Array {
    public static void main(String[] args) {

        // declare an array of ints, and allocate memory for 5 elements
        int[] intArr = new int[5];

        // initialize elements of the array
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 100;
        intArr[3] = 150;
        intArr[4] = 90;

        // print the values of the array
        for (int i = 0; i < 5; i++) {
            System.out.println("Element at " + i + " = " + intArr[i]);
        }
    }
}