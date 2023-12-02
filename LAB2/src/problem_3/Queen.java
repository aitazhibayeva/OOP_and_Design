package problem_3;

public class Queen extends Piece {
	
	public Queen(int row,int col,boolean color) {
		super(row,col,color);
	}
	@Override
	public boolean isLegalMove(Pos A, Pos B) {
		int distcol = Math.abs(A.col - B.col);
		int distrow = Math.abs(A.row - B.row);
		return (A.col == B.col || A.row == B.row)|| distcol == distrow;
	}
}