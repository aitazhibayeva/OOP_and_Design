package problem_3;

import java.util.Vector;

public class Board {
	
	Vector<Vector<Piece>> board;
    
	public Board() {
        board = new Vector<>(8);
        for (int i = 0; i < 8; i++) {
            Vector<Piece> row = new Vector<>(8);
            for (int j = 0; j < 8; j++) {
                row.add(null);
            }
            board.add(row);
        }
    }
    
	public void placePiece(Piece piece, Pos pos) {
        board.get(pos.row - 1).set(pos.col - 1, piece);
    }
    
	public boolean movePiece(Pos A, Pos B) {
    	boolean pawneat = false;
    	Piece piece = board.get(A.row - 1).get(B.col - 1);
    	Piece othpiece = getPieceAt(B);	
    	if(othpiece != null && piece instanceof Pawn && othpiece.getColor() != piece.getColor()) {
    		if(piece.getColor()) {
    			pawneat = ((A.col == B.col + 1)||(A.col == B.col - 1)) && (A.row == B.row + 1);
    		}
    		else {
    			pawneat = ((A.col == B.col + 1)||(A.col == B.col - 1)) && (A.row == B.row - 1);
    		}
    	}
	    if (piece != null && (piece.isLegalMove(A, B) || pawneat)) {
	    	if(othpiece != null) {
		    	if(othpiece.getColor() != piece.getColor()) {
		    		eatPiece(othpiece);
		        }
		    	else{
		    		System.out.println("Invalid");
		    		return false;
		    	}
	    	}
	        board.get(B.row - 1).set(B.col - 1, piece);
	        board.get(A.row - 1).set(A.col - 1, null);
	        piece.pos = B; 
	        return true;
	    } else {
	    	System.out.println("Invalid");
	        return false;
	    }
    }
	
    public void eatPiece(Piece piece) {
    	piece.setEaten(true);
    }
    
    public Piece getPieceAt(Pos pos) {
        return board.get(pos.row - 1).get(pos.col - 1);
    }
    
    public Pos findPos(String s, int i) {
    	int col = 'h' - s.charAt(i) + 1;
    	int row = Character.getNumericValue(s.charAt(i + 1));
    	return new Pos(row, col);
    }
    
    public Piece findPiece(Pos pos) {
	    Piece piece = getPieceAt(pos);
	    return piece;
	}
    
    public void printBoard() {
    	System.out.print("__");
	    for (char c = 'h'; c >= 'a'; c--) {
	        System.out.print(" " + c + " ");
	    }
	    System.out.print("__");
	    System.out.println();
	    for (int row = 0; row < 8; row++) {
	        System.out.print((row + 1) + " ");
	        for (int col = 0; col < 8; col++) {
	            Piece piece = board.get(row).get(col);
	            if (piece == null || piece.getEaten()) {
	                System.out.print("[ ]");
	            } else if (piece instanceof Rook) {
	            	System.out.print(piece.getColor() ? "[R]" : "[r]");
		        } else if (piece instanceof King) {
		        	System.out.print(piece.getColor() ? "[K]" : "[k]");
		        } else if (piece instanceof Queen) {
		        	System.out.print(piece.getColor() ? "[Q]" : "[q]");
		        } else if (piece instanceof Bishop) {
		          	System.out.print(piece.getColor() ? "[B]" : "[b]");
		        } else if (piece instanceof Pawn) {
		        	System.out.print(piece.getColor() ? "[P]" : "[p]");
		        } else if (piece instanceof Horse) {
		        	System.out.print(piece.getColor() ? "[H]" : "[h]");
		        }
	        }
	    	System.out.println(" " + (row + 1));
	    }
	    System.out.print("__");
	    for (char c = 'h'; c >= 'a'; c--) {
	        System.out.print(" " + c + " ");
	    }
	    System.out.print("__");
	    System.out.println();
	}
}