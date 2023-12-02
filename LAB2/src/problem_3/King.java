package problem_3;

public class King extends Piece {
	
	public King(int row,int col, boolean color) {
		super(row,col,color);
	}

	@Override
	public boolean isLegalMove(Pos A, Pos B) {
		int distcol = Math.abs(A.col - B.col);
		int distrow = Math.abs(A.row - B.row);
		return distcol <= 1 && distrow <= 1;
	}
}
