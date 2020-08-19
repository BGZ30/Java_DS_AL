package data_structure.arrayLists;

import java.util.ArrayList;

/*
    Simple code to create an Arraylist of stringspackage data_structure.arrayLists;
*/

public class names {

    public static void main(String[] args) {

        // declare a new arraylist
        ArrayList<String> namesList = new ArrayList<String>();

        // add values
        namesList.add("Lucy");
        namesList.add("Jack");
        namesList.add("Sarah");
        namesList.add("John");
        namesList.add("Anna");

        // print the values in the arraylist
        for (int i = 0; i < namesList.size(); i++)
            System.out.println(namesList.get(i));

    }
}