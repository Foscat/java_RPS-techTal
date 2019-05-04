package glove_world1;

import java.util.Random;
import java.util.Scanner;

public class breakfastCerial {

	// function make computer choose a answer
	public static String getComputerAnswer(){
		Random rand =  new Random(); 
		int compChoice = rand.nextInt(3); 
		String rps[] = {"Rock", "Paper", "Scissors"};
//		System.out.println(rps[compChoice]);
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
		String comp = getComputerAnswer();
		String me = myAnswer();
		
		if(me == comp){
			System.out.println("It's a tie!");
		}
		if(me == "Rock"){
			if(comp == "Paper"){
				System.out.println("Computer wins");
			}
			if(comp == "Scissors"){
				System.out.println("You won!");
			}
		}
		if(me == "Paper"){
			if(comp == "Rock"){
				System.out.println("You won!");
			}
			if(comp == "Scissors"){
				System.out.println("Computer wins");
			}
		}
		if(me == "Scissors"){
			if(comp == "Rock"){
				System.out.println("Computer wins");
			}
			if(comp == "Paper"){
				System.out.println("You won!");
			}
		}
		else{
			System.out.println("You have entered a invalid input");
		}
		
		String response = ("Computer answer: " + comp + "\n" + "Your answer: " + me);
		return response;
	}
	
	///////////// main function only put what you want to print here!
	public static void main(String[] args){
		String play = gameLogic();
	
		System.out.println("Play: "+ play + "\n");
		
	}


}
