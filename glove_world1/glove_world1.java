package glove_world1;

public class glove_world1 {
	
	public static void main(String[] args){
		// Print a simple string to the console
		System.out.print("Hey its Kyle! \n");
		
		//Print a int to the console
		System.out.print(123 + "\n"); 
		
		//make a var to contain info
		String myString = "My string var";
		// see how to print a var
		System.out.println(myString);
		
		// print a number var
		int number = 5;
		System.out.println("Your number is " + number);
		System.out.println("Your number is " + number++);
		System.out.println("Your number is " + number);
		System.out.println("Your number is " + ++number);
		System.out.println("Your number is " + number);
		
		if(number == 5){
			System.out.print("jo mommas house \n");
		}
		if(number > 5){
			System.out.print("Well golly thats a big one \n");
		}
		else{
			System.out.print("No pot to piss in \n");
		}
		
		int pants[] = new int[10];
		for(int i=0; i < pants.length; i++){
			pants[i] = i+1;
			System.out.println(pants[i]);
		}
		
		String pants2[] = new String[3];
		pants2[0] = "Wtf";
		pants2[1] = "WhoDoesThis";
		pants2[2] = "ItsBs";
		for(int i = 0; i < pants2.length; i++){
//			System.out.println(pants2[i]);
			System.out.println(pants2[i] +" is what we got");
		}
		
		String TopoChico1[] = {"Plane", "Line", "Cake"};
		for(int i=0; i < TopoChico1.length; i++){
			System.out.println(TopoChico1[i]);
		}

		// while loop
		int me =5;
		while(me < 20){
			System.out.println("hi");
			++me;
		}
		
		// A do while loop
		int i=1;
		do{
			System.out.println(i);
			i++;
		}while(i <= 10);
	}

}
