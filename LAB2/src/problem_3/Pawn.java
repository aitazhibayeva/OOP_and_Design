package problem_3;

public class Pawn extends Piece {
	
	public Pawn(int row,int col,boolean color) {
		super(row,col,color);
	}
	
    @Override
    public boolean isLegalMove(Pos A, Pos B) {
    	if (!this.getTouched()) {
            if (!this.getColor()) {
                return (A.col == B.col && A.row == B.row + 2) || (A.col == B.col && A.row == B.row + 1);
            } else {
                return (A.col == B.col && A.row == B.row - 2) || (A.col == B.col && A.row == B.row - 1);
            }
        } else {
            if (!this.getColor()) {
                return A.col == B.col && A.row == B.row + 1;
            } else {
                return A.col == B.col && A.row == B.row - 1;
            }
        }
    }
}
