//import required header files

import java.util.ArrayList;

import java.util.Scanner;

//class is created

public class arrayList {

    //declaration of main

    public static void main(String[] args) {

       

        //get the input from user

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter 5 numbers: ");

        //ArrayList() method is called

        ArrayList<Integer> list = new ArrayList<>();

        //loop which executes until 5

        for (int a = 0; a < 5; a++) list.add(inp.nextInt());

        //sorts the list

        sort(list);

        //print statement

        System.out.println("Sorting numbers in Ascending order");

        System.out.println(list);

    }

   

    // method called ArrayList is created

    public static void sort(ArrayList<Integer> list) {

        // loop executes until the list size

        for (int a = 0; a < list.size() - 1; a++) {

            //get the values in the list

            int minimum = list.get(a);

            //declaration of integer variable in integer data type

            int ind = a;

            //loop executes until the list size

            for (int b = a + 1; b < list.size(); b++) {

                //checks if the minimum is greater than list

                if (minimum > list.get(b)) {

                    //minimum is equal to list.get

                    minimum = list.get(b);

                    //assign b to index

                    ind = b;

                }

            }

            //checks if index is not equal to a

            if (ind != a) {

             

                list.set(ind, list.get(a));

                list.set(a, minimum);

            }

        }

    }

}