package com.kaleem;

import java.util.Random;
import java.util.Scanner;

class Game{
	int noOfGuesses=0;
	int inputNumber;
	int randomNumber;
	
	Game(){
		Random r=new Random();
		 randomNumber=r.nextInt(100);
	}
	   void takeUserInput() {
		System.out.println("Guess the number");
		Scanner sc= new Scanner(System.in);
		 inputNumber=sc.nextInt();
	   }
	boolean isCorrectNumber() {
		noOfGuesses++;
		if(inputNumber==randomNumber) {
			System.out.printf("Yes you Guessed the right number,It was %d\nYou guessed the number in %d attempts",randomNumber,noOfGuesses);
	        return true;	
		}
		else if(inputNumber>randomNumber) 
			System.out.println("too high");
			
		else if(inputNumber<randomNumber) 
			System.out.println("too low");
		
	      return false;
	}
}

public class GuessTheNumberGame {

	public static void main(String[] args) {
		
       Game g=new Game();
       boolean guesses=false;
       while(!guesses) {
    	   g.takeUserInput();
    	   g.isCorrectNumber();
       }
	}
}
