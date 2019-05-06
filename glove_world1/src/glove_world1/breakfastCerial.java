package glove_world1;

import java.util.Random;
import java.util.Scanner;

public class breakfastCerial {

	// function make computer choose a answer
	public static String getComputerAnswer(){
		Random rand =  new Random(); 
		int compChoice = rand.nextInt(3); 
		String rps[] = {"Rock", "Paper", "Scissors"};

		System.out.println("Computer answer was: " + rps[compChoice]);
		
		//Holder for computer answer
		String comAn = rps[compChoice];
		return comAn;
	}
	
	public static String myAnswer(){
		// Initialize the Scanner we'll need
	    Scanner input = new Scanner(System.in);
	    System.out.println("Type either Rock Paper or Scissors and hit enter  **warning case sensetive");
	    String newAns = input.nextLine();
	    return newAns;
	}
	
	public static String gameLogic(){
		String me = myAnswer();
		String comp = getComputerAnswer();
		///////////////////////////////////////
		if(me.equals(comp)){
			System.out.println("It's a tie!");
			return me;
		}

		/////////////////////////////////////////////////////
		if(me.equals("Rock")){
			if(comp.equals("Paper")){
				System.out.println("Computer wins");
			}
			if(comp.equals("Scissors")){
				System.out.println("You won!");
			}
			return me;
		}

		////////////////////////////////////////////////
		if(me.equals("Paper")){
			if(comp.equals("Rock")){
				System.out.println("You won!");
			}
			if(comp.equals("Scissors")){
				System.out.println("Computer wins");
			}
			return me;
		}
		/////////////////////////////////////////////////
		if(me.equals("Scissors")){
			if(comp.equals("Rock")){
				System.out.println("Computer wins");
			}
			if(comp.equals("Paper")){
				System.out.println("You won!");
			}
			return me;
		}
		/////////////////////////////////////////////////////////
		String response = ("You typed a invaild input.");
		return response;
	}
	
	///////////// main function only put what you want to print here!
	public static void main(String[] args){
		String play = gameLogic();
	
		
	}


}
