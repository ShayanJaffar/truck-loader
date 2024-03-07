import java.util.Arrays;
import java.util.Scanner;

public class TruckLoader {

	public static void main(String[] args) {
		
		//Get input from user
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter cargo shapes and coordinates");
	    String baseInput = scanner.nextLine();  
		
		
		//String baseInput = "0O,2I,3S";
		String[] cargoLoad = baseInput.split(",");
		
		//Build out 2D array for empty truck
		char[][] truck = new char[53][10];
		for(char[] c : truck) {
			Arrays.fill(c, ' ');
		}
		
		//Calculate highest point on y-axis
		int res = getHeight(cargoLoad, truck);
		
		System.out.println("Height is: " + res);
		
		

	}
	
	//Function that does most of the work
	public static int getHeight(String[] cargoLoad, char[][] truck) {
		
		int maxHeight = -1;
		
		for(String s : cargoLoad) {
			//Parse X coordinate and type of block
			int x =  s.charAt(0) - '0';
			char c = s.charAt(1);
			
			//Initialize Cargo at the top
			Cargo cargo = new Cargo(x,c); 
			
			//Move cargo down 1 by 1, checking for collisions
			while(!willCollide(cargo, truck)) {
				cargo.moveDownOne();
			}
			
			//Placing cargo in truck once spot is decided
			for(Block b : cargo.getCoordinates()) {
				truck[b.getY()][b.getX()] = b.getC();
				//Keep track of highest Y coordinate
				maxHeight = Math.max(Math.abs(b.getY() - 52), maxHeight);
			}
						
		}
		
		//Display final configuration
		printTruck(truck);
				
		return maxHeight;
	}
	
	//Function to display truck configuration
	public static void printTruck(char[][] truck) {
		for(int i = 0; i < 53; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(truck[i][j]);
			}
			System.out.print(" " + (53 - i - 1) + "\n");
		}
		System.out.println("0123456789\n");
	}
	
	//Function to determine if the cargo block can move further down
	public static boolean willCollide(Cargo cargo, char[][] truck) {
		for(Block b : cargo.getCoordinates()) {
			if(b.getY() == 52 || truck[b.getY() + 1][b.getX()] != ' ' ) {
				return true;
			}
		}
		return false;
	}

}



