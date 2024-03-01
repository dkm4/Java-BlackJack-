/***************************************************************************************************************************************
 * @file    MultiplicationQuiz.java
 * @brief   This program implements a program that makes number of multiplication questions for the user based on user's desire to solve
 * @author  Kyung mo Doh
 * @data    September 26, 2023
 ***************************************************************************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);  //new scanner program
        Random randomNumGen = new Random();     //new random number generating program
        int i = 1;
        int answer;                     //answer of the multiplication
        int userAnswer;                 //user input for their thoughts for the answer
        int numOfQuestion;              //user input for number of questions
        int largestNum;                 //user input for smallest number
        int smallestNum;                //user input for largest number
        int randomNum1;                 //generate the first random number for the multiplication question
        int randomNum2;                 //generate the second random number for the multiplication question
        double numQuestionCorrect = 0;  //record how much question the user got correct
        double totalPercent;            //Calculates the accuracy of the user in %

        System.out.println("Multiplication Quiz Wiz!\n");

        System.out.print("How many problems do you want to work on? ");
        numOfQuestion = scnr.nextInt();

        System.out.print("what are the smallest and largest numbers to use? ");
        smallestNum = scnr.nextInt();
        largestNum = scnr.nextInt();


        while(i <=  numOfQuestion){
            randomNum1 = randomNumGen.nextInt(largestNum - smallestNum +1) + smallestNum;
            randomNum2 = randomNumGen.nextInt(largestNum - smallestNum +1) + smallestNum;

            answer = randomNum1 * randomNum2;
            System.out.print("\nQ" + i + ": What is " + randomNum1 + " x " + randomNum2 + " ? ");
            userAnswer = scnr.nextInt();
            if (userAnswer == answer) {
                System.out.println("Correct!");
                ++numQuestionCorrect;
            }
            else{
                System.out.println("Oops... Its " + answer);
            }
            i++;
        }

        totalPercent = numQuestionCorrect / numOfQuestion * 100;

        System.out.print("\nYou got ");
        System.out.printf("%.0f", numQuestionCorrect);
        System.out.print(" out of " + numOfQuestion + " or ");
        System.out.printf("%.0f", totalPercent);
        System.out.print("%");
    }
}
