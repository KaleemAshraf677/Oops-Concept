package com.kaleem;

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissorGame {

	public static void main(String[] args) {
	
		System.out.println("Enter 0 for Rock,Enter 1 for Paper,Enter 2 for Scissor");
		Scanner sc = new Scanner(System.in);
          int userChoice=sc.nextInt();
          if(userChoice !=0 && userChoice !=1 && userChoice !=2)
        	  System.out.println("Please choice right Input");
          
          Random rd=new Random();
          int computerChoice=rd.nextInt(3);
          
          if(computerChoice==0)
        	  System.out.println("Computer Choice is Rock");
          else if(computerChoice==1)
        	  System.out.println("Computer Choice is Paper");
          else
        	  System.out.println("Computer choice is Scissor");
          
          if(userChoice==computerChoice)
        	  System.out.println("Game is Draw,try one more time");
          
          else if(userChoice==0 && computerChoice==2 || userChoice==1 && computerChoice==0 || userChoice==2 && computerChoice==1)
                System.out.println("You Win");
	      else 
		        System.out.println("Computer Win");
}
}
