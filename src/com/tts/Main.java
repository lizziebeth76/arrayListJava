package com.tts;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
//THIS PROJECT HAS A VERY ODD TITLE/ FILE PATH STRUCTURE
//    I DON'T KNOW WHAT HAPPENED OR HOW IT DID. PLEASE FEEL FREE TO HELP IF YOU
//    ARE READING THIS AND HAVE INSIGHTS!!!! I MIGHT HAVE STARTED THE PROJECT AND NAMED IT IN VS CODE
//    BUT SAVED IT AS UNTITLED HERE (?)

//    YOU WILL FIND WHAT HAVE BECOME SOME VERY INTENTIONALLY DRAMATIC COMMENTS.
//    I AM TRYING LIKE HECKFIRE TO MAINTAIN A SENSE A SENSE OF HUMOR ABOUT THE FACT
//    THAT THIS RAN WITHOUT ERRORS (JUST NON-WORKING MATH) A FEW LONG HOURS AGO
//    NOTE TO FUTURE SELF: WHEN YOU'RE TIRED, QUIT WHEN YOU'RE AHEAD!
//    "*PUSH* AND RETURN REFRESHED TO SOLVE AGAIN!"

    public static void main(String[] args) {

//        CREATE PROGRAM THAT FINDS THE FOLLOWING FOR SOME USER INPUT AND STORE IT IN AN ARRAY LIST:
//        sum; product; largest, smallest of the integers in the user-input array


//      CREATES A WELCOME MESSAGE WITHIN THE MAIN METHOD:
        System.out.println("Hey there, friend!");

//      BRINGS THE SCANNER INTO BEING (CALLING FROM THE IMPORT ABOVE):
        Scanner scanner = new Scanner(System.in);

//      CREATE OUR ARRAY LIST IN WHICH USER INPUT WILL BE STORED. THE DATA TYPE FOR THIS LIST IS INTEGER
//      INITIAL CAPACITY DESCRIBES THE (STILL FLEXIBLE) NUMBER OF ITEMS "ALLOWED" IN THE LIST, BUT NOT REALLY EVEN, CUZ IT'S FLEXIBLE, AND DOES NOT HAVE TO CONTAIN A VALUE AT ALL
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        System.out.println("Please enter a random number: ");

        int intOne = scanner.nextInt();
        System.out.println("Please enter another random number: ");
        int intTwo = scanner.nextInt();
        System.out.println("Please enter a third random number: ");
        int intThree = scanner.nextInt();
        System.out.println("Please enter a fourth random number: ");
        int intFour = scanner.nextInt();
        System.out.println("Please enter a fifth random number: ");
        int intFive = scanner.nextInt();

        //.add appends elements to the END of the array (an array specifically):
        randomNumbers.add(intOne);
        randomNumbers.add(intTwo);
        randomNumbers.add(intThree);
        randomNumbers.add(intFour);
        randomNumbers.add(intFive);

//        calls the function in the main method:
        getSum(randomNumbers);
        getProduct(randomNumbers);
        getMax(randomNumbers);
        getMin(randomNumbers);


    }

    public static void getSum(ArrayList<Integer> randomNumbers) {
// .size is for array lists, and .length is for array
        int sum = 0;
        System.out.println("What the heck??" + randomNumbers.toString());
        for (Integer randomNumber : randomNumbers) {
            sum += randomNumber;
        }
        System.out.println("This is the sum of the numbers you typed in: " + sum);
    }

    public static void getProduct(ArrayList<Integer> randomNumbers) {
// .size is for array lists, and .length is for array
        int product = 1;

        for (Integer randomNumber : randomNumbers) {
            product *= randomNumber;
        }
        System.out.println("This is the product of the numbers you typed in: " + product);
    }

    private static void getMax(ArrayList<Integer> randomNumbers) {
        int max = 0;

        for (Integer randomNumber : randomNumbers) {
            if (randomNumber > max) max = randomNumber;
        }
        System.out.println("This is the LARGEST of the numbers you typed in: " + max);
    }

    private static void getMin(ArrayList<Integer> randomNumbers) {
        int min = 0;

        if (!randomNumbers.isEmpty()) {
            min = randomNumbers.get(0);
        }
        for (Integer randomNumber : randomNumbers) {
            if (randomNumber < min) min = randomNumber;
        }
        System.out.println("This is the smol'est of the numbers you typed in: " + min);
    }
}

//SOME OTHER ARRAY LIST METHODS (FROM THE SLIDES):
//adds an element to a specific index
//        names.add(2, "Finn"); //adds "Finn" to index 2, moves "Joe" to index 3

//retrieves element values based on index number
//        names.get(1);  //returns "Heather"

//removes an element from an ArrayList
//        names.remove("Finn"); //takes "Finn" out of the list, moves "Joe" back to index 2
        // index 3 no longer exists




