
public class Cargo {
	private Block[] coordinates = new Block[4];
	
	public Block[] getCoordinates() {
		return this.coordinates;
	}
	
	//Move all blocks down by 1
	public void moveDownOne() {
		for(Block b : coordinates) {
			b.incrementY();
		}
	}
	
	//Constructor based on type of shape
	public Cargo(int x, char c) {
		if(c == 'O') {
			//OO
			//OO
			coordinates[0] = new Block(x, 0, c);
			coordinates[1] = new Block(x, 1, c);
			coordinates[2] = new Block(x + 1, 0, c);
			coordinates[3] = new Block(x + 1, 1, c);
		}
		else if(c == 'I') {
			//I
			//I
			//I
			//I
			coordinates[0] = new Block(x, 0, c);
			coordinates[1] = new Block(x, 1, c);
			coordinates[2] = new Block(x, 2, c);
			coordinates[3] = new Block(x, 3, c);
		}
		else if(c == 'S') {
			// SS
			//SS
			coordinates[0] = new Block(x, 1, c);
			coordinates[1] = new Block(x + 1, 1, c);
			coordinates[2] = new Block(x + 1, 0, c);
			coordinates[3] = new Block(x + 2, 0, c);
		}
		else if(c == 'Z') {
			// SS
			//SS
			coordinates[0] = new Block(x, 0, c);
			coordinates[1] = new Block(x + 1, 1, c);
			coordinates[2] = new Block(x + 1, 0, c);
			coordinates[3] = new Block(x + 2, 1, c);
		}
		else if(c == 'L') {
			//L
			//L
			//LL
			coordinates[0] = new Block(x, 0, c);
			coordinates[1] = new Block(x, 1, c);
			coordinates[2] = new Block(x, 2, c);
			coordinates[3] = new Block(x + 1, 2, c);
		}
		else if(c == 'J') {
			// J
			// J
			//JJ
			coordinates[0] = new Block(x, 2, c);
			coordinates[1] = new Block(x + 1, 2, c);
			coordinates[2] = new Block(x + 1, 1, c);
			coordinates[3] = new Block(x + 1, 0, c);
		}
		else if(c == 'T') {
			//TTT
			// T
			coordinates[0] = new Block(x, 0, c);
			coordinates[1] = new Block(x + 1, 0, c);
			coordinates[2] = new Block(x + 1, 1, c);
			coordinates[3] = new Block(x + 2, 0, c);
		}
	}
	
}
