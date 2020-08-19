package data_structure.arrays;

/* 
    Simple code to find the sum of array elements.
*/

class ArrSum {
    public static void main(String args[]) {
        double arrSum = 0;
        int[] intArr = { 4, 5, 6, 7, 8, 9, 10 }; // sum=49

        for (int e : intArr)
            arrSum += e;

        System.out.println("Sum of array elemnts is: " + arrSum);
    }
}