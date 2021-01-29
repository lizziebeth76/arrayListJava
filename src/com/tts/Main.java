package com.tts;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
//THIS PROJECT HAS A VERY ODD TITLE/ FILE PATH STRUCTURE
//    I DON'T KNOW WHAT HAPPENED OR HOW IT DID. PLEASE FEEL FREE TO HELP IF YOU
//    ARE READING THIS AND HAVE INSIGHTS!!!!

//    YOU WILL FIND WHAT HAVE BECOME SOME VERY INTENTIONALLY DRAMATIC COMMENTS.
//    I AM TRYING LIKE HECKFIRE TO MAINTAIN A SENSE A SENSE OF HUMOR ABOUT THE FACT
//    THAT THIS RAN WITHOUT ERRORS (JUST NON-WORKING MATH) A FEW LONG HOURS AGO
//    NOTE TO FUTURE SELF: WHEN YOU'RE TIRED, QUIT WHEN YOU'RE AHEAD!
//    "*PUSH* AND RETURN REFRESHED TO SOLVE AGAIN!"

    public static void main(String[] args) {

//        CREATE PROGRAM THAT FINDS THE FOLLOWING FOR SOME USER INPUT AND STORE IT IN AN ARRAY LIST:
//        int sum = 0;
//        int max = 0;
//        int min = 0;
//        int product = 1;
////        int num = 0;
//        Above is the way jake did it, however, i'm just going to declare each one within its own function

//
//
//      CREATES A WELCOME MESSAGE WITHIN THE MAIN METHOD:
        System.out.println("Hey there, friend!");

//      BRINGS THE SCANNER INTO BEING (CALLING FROM THE IMPORT ABOVE):
        Scanner scanner = new Scanner(System.in);

//      CREATE OUR ARRAY LIST IN WHICH USER INPUT WILL BE STORED. THE DATA TYPE FOR THIS LIST IS INTEGER
//      INITIAL CAPACITY DESCRIBES THE (STILL FLEXIBLE) NUMBER OF ITEMS "ALLOWED" IN THE LIST, BUT NOT REALLY EVEN, CUZ IT'S FLEXIBLE, AND DOES NOT HAVE TO CONTAIN A VALUE AT ALL
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        System.out.println("Please enter a random number: ");
        //        Integer someNum = Integer.parseInt(scanner.nextLine()); ---from jake:  to adjust25 (right side of equation) and its pals
//
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
//        calls the function in the main method
        getSum(randomNumbers);
        getProduct(randomNumbers);
        getMax(randomNumbers);
        getMin(randomNumbers);

//        I BELIEVE THAT WHEN I INPUT THE CALLS BELOW, IT WAS A DUPLICATE EFFORT/ ATTEMPT TO CALL THE FUNCTIONS FROM THE MAIN METHOD
//        I'M PRETTY SURE (IT WOULD APPEAR!) THAT I DON'T ENTIRELY UNDERSTAND WHAT I MEAN WHEN I SAY "CALL THE FUNCTION FROM THE MAIN METHOD
//        EVEN THO I THINK IT OUGHT TO BE A LOT LIKE IT SOUNDS -- HAALLLLPPPPPP MEEEE, GOOGLE HAS FAILED ME AND I AM TIRED - do NOT DO THIS:

//        randomNumbers.stream().mapToDouble(intOne);
//        randomNumbers.stream().mapToDouble(intOne);
//        randomNumbers.stream().mapToDouble(intOne);
//        randomNumbers.stream().mapToDouble(intOne);
//        randomNumbers.stream().mapToDouble(intOne);
//
//        randomNumbers.product(intOne);
//        randomNumbers.product(intTwo);
//        randomNumbers.product(intThree);
//        randomNumbers.product(intFour);
//        randomNumbers.product(intFive);
//
////        randomNumbers.max(intOne);
////        randomNumbers.max(intTwo);
////        randomNumbers.max(intThree);
////        randomNumbers.max(intFour);
////        randomNumbers.max(intFive);
//
//        randomNumbers.stream().max(intOne);
//        randomNumbers.stream().max(intTwo);
//        randomNumbers.stream().max(intThree);
//        randomNumbers.stream().max(intFour);
//        randomNumbers.stream().max(intFive);
//
//        randomNumbers.stream().min(intOne);
//        randomNumbers.stream().min(intTwo);
//        randomNumbers.stream().min(intThree);
//        randomNumbers.stream().min(intFour);
//        randomNumbers.stream().min(intFive);
    }

    //    NO ERRORS BELOW (at one point that was true, now that is not), BUT NONE OF THE MATH CURRENTLY WORKS - ONLY THE DEFAULT VALUES DISPLAY

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


//BELOW YOU WILL SEE A SPOT WHERE THE PROGRAM IS VERY UPSET WITH ME.
//WE HAVE BEEN DISCUSSING POSSIBLE OPTIONS FOR A SOLUTION THAT MEETS BOTH
//OF OUR NEEDS, AND WE JUST CANNOT SEEM TO COME TO ANY AGREEMENT.
//CLEARLY I PLAY A ROLE IN THIS, BUT I REALLY FEEL THE PROGRAM IS BEING LESS THAN
//FLEXIBLE AND IS NOT WILLING TO MEET ME EVEN HALFWAY. LIKE SERIOUSLY, PROGRAM,
//I SPENT TWO HOURS ON JUST THIS ONE ISSUE, AND YOU WERE NOT WILLING TO
//ENTERTAIN EVEN ONE OF THE POTENTIAL SOLUTIONS I OFFERED. RUDE. THIS IS NOT
//HOW COMPROMISE WORKS IN A RELATIONSHIP, AND I JUST MIGHT HAVE TO OFFICIALLY PUT THE D-WORD
//ON THE TABLE AT THIS POINT. I HAVE TOO MUCH RESPECT FOR YOU, AND ALSO FOR MYSELF
//TO CONTINUE BATTLING YOU THIS WAY. FOR NOW, LET JUST TAKE A BREAK, THOUGH...

    //    public static void getLargest(ArrayList<Integer> randomNumbers) { <--THIS WAS WRONG. INTELLIJ BUILT ME THIS:

    private static void getMax(ArrayList<Integer> randomNumbers) {
        int max = 0;
        for (Integer randomNumber : randomNumbers) {
//            .randomNumber() = max; --jake had me comment this out
            if (randomNumber > max) max = randomNumber;
        }
        System.out.println("This is the LARGEST of the numbers you typed in: " + max);
    }
    private static void getMin(ArrayList<Integer> randomNumbers) {
        int min = 0;
        if(!randomNumbers.isEmpty()) {
            min = randomNumbers.get(0);
        }
        for (Integer randomNumber : randomNumbers) {
//            .randomNumber() = min; -- jake had me comment this out
            if (randomNumber < min) min = randomNumber;
        }
        System.out.println("This is the smol'est of the numbers you typed in: " + min);
    }
//    private static void getMin(ArrayList<Integer> randomNumbers) {
//
//        int min = 0;
//
//        for (Integer randomNumber : randomNumbers) {
//            min < randomNumber;
//
//        }
//        System.out.println("This is the smol'est of the numbers you typed in: " + min);
}


//SOME OTHER ARRAY LIST METHODS (FROM THE SLIDES):
//adds an element to a specific index
//        names.add(2, "Finn"); //adds "Finn" to index 2, moves "Joe" to index 3

//retrieves element values based on index number
//        names.get(1);  //returns "Heather"

//removes an element from an ArrayList
//        names.remove("Finn"); //takes "Finn" out of the list, moves "Joe" back to index 2
        // index 3 no longer exists




