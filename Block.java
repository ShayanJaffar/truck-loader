
public class Block {
	private int x,y;
	private char c;
	
	public Block() {
		
	}
	
	public Block(int x, int y, char c) {
		this.x = x;
		this.y = y;
		this.c = c;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public char getC() {
		return this.c;
	}
	
	public void incrementY() {
		y++;
	}
}
