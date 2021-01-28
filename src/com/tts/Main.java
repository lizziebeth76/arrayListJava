package com.tts;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//
//
//      CREATES A WELCOME MESSAGE WITHIN THE MAIN METHOD:
        System.out.println("Hey there, friend!");

//      BRINGS THE SCANNER INTO BEING (CALLING FROM THE IMPORT ABOVE):
        Scanner scanner = new Scanner(System.in);

//      CREATE OUR ARRAY LIST IN WHICH USER INPUT WILL BE STORED. THE DATA TYPE FOR THIS LIST IS INTEGER
//      INITIAL CAPACITY DESCRIBES THE (STILL FLEXIBLE) NUMBER OF ITEMS "ALLOWED" IN THE LIST, BUT NOT REALLY EVEN, CUZ IT'S FLEXIBLE, AND DOES NOT HAVE TO CONTAIN A VALUE AT ALL
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>(5);

        System.out.println("Please enter a random number: ");
        //        Integer someNum = Integer.parseInt(scanner.nextLine()); ---from jake:  to adjust25 (right side of equation) and its pals
        Integer intOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter another random number: ");
        Integer intTwo = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter a third random number: ");
        Integer intThree = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter a fourth random number: ");
        Integer intFour = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter a fifth random number: ");
        Integer intFive = Integer.parseInt(scanner.nextLine());


//
//        ArrayList<Integer> randomNumbers = new ArrayList<Integer>(5);

        //.add appends elements to the END of the array (an array specifically):
        randomNumbers.add(intOne);
        randomNumbers.add(intTwo);
        randomNumbers.add(intThree);
        randomNumbers.add(intFour);
        randomNumbers.add(intFive);


        public static void sum () {
// .size is for array lists, and .length is for array
            int sum = 0;

            for (int i = 0; i < randomNumbers.size; i++) {
                sum += randomNumbers[i];

            }
            System.out.println(sum);
        }

//        FIND THESE:
//        sum
//        product
//        max
//        min


//SOME OTHER ARRAY LIST METHODS (FROM THE SLIDES):
//adds an element to a specifc index
//        names.add(2, "Finn"); //adds "Finn" to index 2, moves "Joe" to index 3

//retrieves element values based on index number
//        names.get(1);  //returns "Heather"

//removes an element from an ArrayList
//        names.remove("Finn"); //takes "Finn" out of the list, moves "Joe" back to index 2
        // index 3 no longer exists


    }
}

