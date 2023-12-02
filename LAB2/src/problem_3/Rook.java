package problem_3;

public class Rook extends Piece {
	
	public Rook(int row,int col,boolean color) {
		super(row,col,color);
	}

	@Override
	public boolean isLegalMove(Pos A, Pos B) {
		return A.col == B.col || A.row == B.row;
	}
}
