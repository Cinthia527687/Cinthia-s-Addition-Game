import java.util.Scanner;

public class AdditionGame {
	public static void main(String[] args) {
		//Cinthia's Addition Game
		//Development 1412 branch
		
		//Outline for addition problem.
			int score = 0;
			int hardness = 10;
		
	//Round 1
			
		// Generate 2 Random numbers
			int number1 = (int)(Math.random() * hardness);
			int number2 = (int)(Math.random() * hardness);
			int correctAnswer = number1 = number2;
			
		// Ask the user to add these two numbers together
			System.out.println("What number is" + number1 + "+" + number2 + "?");
			
		// Read in their response
			Scanner input = new Scanner(System.in);
			int studentAnswer = input.nextInt();
			
		// Check if the answer was correct
			if(studentAnswer == correctAnswer){
				
				// IF correct
				
					// Tell them it was correct
						System.out.println("Your answer was correct.");
						
					// Give them points
					score += hardness;
					System.out.println("Your score is now: " + score);
		
					// Make next question harder
						hardness *= 10;
					
				// IF incorrect
						
					// Tell them they are incorrect
						System.out.println("Your answer was incorrect.");
						
					// Tell them the correct answer
						System.out.println("The correct answer was: " + correctAnswer);
						
					// Don't give points
						score += 0;
						
					// Make next question easier
						if(hardness>10){
							
							hardness /= 10;
							System.out.println("Your difficulty is now: " + hardness);
							
						}else{
								
							System.out.println("Your difficulty is at the lowest level");
							System.out.println("Your difficulty is now: " + hardness);
						}
						
			}
			
			System.out.println("End of first round.");

			//Round 2
			
			// Generate 2 Random numbers
				int number1 = (int)(Math.random() * hardness);
				int number2 = (int)(Math.random() * hardness);
				int correctAnswer = number1 = number2;
				
			// Ask the user to add these two numbers together
				System.out.println("What number is" + number1 + "+" + number2 + "?");
				
			// Read in their response
				Scanner input = new Scanner(System.in);
				int studentAnswer = input.nextInt();
				
			// Check if the answer was correct
				if(studentAnswer == correctAnswer){
					
					// IF correct
					
						// Tell them it was correct
							System.out.println("Your answer was correct.");
							
						// Give them points
						score += hardness;
						System.out.println("Your score is now: " + score);
			
						// Make next question harder
							hardness *= 10;
						
					// IF incorrect
							
						// Tell them they are incorrect
							System.out.println("Your answer was incorrect.");
							
						// Tell them the correct answer
							System.out.println("The correct answer was: " + correctAnswer);
							
						// Don't give points
							score += 0;
							
						// Make next question easier
							if(hardness>10){
								
								hardness /= 10;
								System.out.println("Your difficulty is now: " + hardness);
								
							}else{
									
								System.out.println("Your difficulty is at the lowest level");
								System.out.println("Your difficulty is now: " + hardness);
							}
							
				}
				
				System.out.println("End of second round.");
				
		//Round 3
		// Generate 2 Random numbers
		// Ask the user to add these two numbers together
		// Read in their response
		// Check if the answer was correct
		//  	IF correct
		//  		Give them points
		//  		Make next question harder
		//  		Tell them they are correct
		//  	IF wrong
		//  		Tell them they are wrong, why, and correct the answer
		//  		Make next question easier
		//Round 4
		// Generate 2 Random numbers
		// Ask the user to add these two numbers together
		// Read in their response
		// Check if the answer was correct
		//  	IF correct
		//  		Give them points
		//  		Make next question harder
		//  		Tell them they are correct
		//  	IF wrong
		//  		Tell them they are wrong, why, and correct the answer
		//  		Make next question easier
		

	}

}
