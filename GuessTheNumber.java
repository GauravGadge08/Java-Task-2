import java.util.Scanner;
//class
class GuessTheNumber {
	
	// static method 

	public static int takeIntegerInput(int limit) {
		int input = 0;
		boolean flag = false;
		
		while ( !flag ) {
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				flag = true;
				
				if ( flag && input > limit || input < 1 ) {
					System.out.println("Choose the number between 1 to " + limit);
					flag = false;
				}
			}
			catch ( Exception e ) {
				System.out.println("Enter only integer value");
				flag = false;
			}
		}
		return input;
	}
	
	// main method for program
	public static void main(String[] args) {
		
		// input for game
		System.out.println("1. Start the Game \n2. Exit");

		System.out.print("Enter your choice : ");
		int choice = takeIntegerInput(2);

		int nextRound = 1;
		int noOfRound = 0;
		
		if ( choice == 1 ) {
			
			// for next round
			while ( nextRound == 1 ) {
				
				Game game = new Game();
				boolean isMatched = false;

				boolean isLimitCross = false;

				System.out.println("\nRound " + ++noOfRound + " starts...");
				
				// Correct Guess and limit cross

				while ( !isMatched && !isLimitCross) {
					isLimitCross = game.takeUserInput();
					isMatched = game.isCorrectGuess();
				}
				// next round
				System.out.println("1. Next Round \n2. Exit");

				System.out.println("Enter your choice : ");

				nextRound = takeIntegerInput(2);

				if ( nextRound != 1 ) {
					System.exit(0);
				}
			}
		}
		else {
			System.exit(0);
		}
	}
}