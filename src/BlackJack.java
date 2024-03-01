/**************************************************************************************************************************************
 * @file    BlackJack.java
 * @brief   This program implements a program that makes the game "black Jack" which the player can play against the dealer
 * @author  Kyung mo Doh
 * @data    September 26, 2023
 **************************************************************************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);      //new scanner program
        Random randomNumGen = new Random();         //new random number generating program
        int playerScore;                            //records the current player's'score of each black jack game.
        int dealerScore;                            //records the current dealer's score of each black jack game.
        int randomCard;                             //assign a new random card
        char userMove;                              //check if user want to draw a new card
        char playAgain = 'y';                       //check if user wants to play new round of black jack
        int playerWon = 0;                          //assign number of wins of the player
        int dealerWon = 0;                          //assign number of wins of the dealer


        System.out.println("===========================================================");
        System.out.println("Black Jack Table");
        System.out.println("===========================================================");

        while(playAgain == 'y'){
            //assign each initial value for each variable
            playerScore = 0;
            dealerScore = 0;
            userMove = 'h';

            //program for player's turn
            System.out.println("\nPlayer's turn");
            while(userMove == 'h') {
                randomCard = randomNumGen.nextInt(11) + 1;
                playerScore = playerScore + randomCard;
                System.out.print("card:  ");
                System.out.printf("%2d", randomCard);
                System.out.print("  Current score:  " + playerScore);
                if (playerScore < 22){
                    System.out.print("\n(h) hit me again!  (d) I'm done : ");
                    userMove = scnr.next().charAt(0);
                }
                else{
                    userMove = 'd';
                    System.out.println("");
                }
            }
            System.out.println("Player's final score is " + playerScore);

            //program for dealer's turn
            System.out.println("\nDealer's turn");
            while(dealerScore <= 17){
                randomCard = randomNumGen.nextInt(11) + 1;
                dealerScore = dealerScore + randomCard;
                System.out.print("card:  ");
                System.out.printf("%2d", randomCard);
                System.out.println("  Current score:  " + dealerScore);
            }
            System.out.println("Dealer's final score is " + dealerScore +"\n");

            //check which side win the game
            if(playerScore > dealerScore){
                if(playerScore <= 21){
                    System.out.println("Player won!");
                    ++playerWon;
                }
                else if(dealerScore > 21){
                    System.out.println("It's a tie!");
                }
                else {
                    System.out.println("Dealer won!");
                    ++dealerWon;
                }
            }
            if(dealerScore > playerScore){
                if(dealerScore <= 21){
                    System.out.println("Dealer won!");
                    ++dealerWon;
                }
                else if(playerScore > 21){
                    System.out.println("It's a tie!");
                }
                else{
                    System.out.println("Player won!");
                    ++playerWon;
                }
            }
            if(playerScore == dealerScore){
                System.out.println("It's a tie!");
            }

            //ask the user to play the next round
            System.out.print("\nPlay again? (y/n): ");
            playAgain = scnr.next().charAt(0);
        }

        //print each player and dealer's number of wins
        System.out.println("\nPlayer won " + playerWon + " times.");
        System.out.println("Dealer won " + dealerWon + " times.");
    }
}
