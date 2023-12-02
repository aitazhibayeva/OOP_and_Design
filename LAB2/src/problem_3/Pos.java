package problem_3;

public class Pos {
	
	public int row;
	public int col;
	
	public Pos (int row,int col) {
		this.row = row;
		this.col = col;
	}
	
	public String toString() {
		return " r "+ row + " c " + col;
	}
}
