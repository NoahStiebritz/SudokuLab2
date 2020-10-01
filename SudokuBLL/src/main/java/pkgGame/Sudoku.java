package pkgGame;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {
	
	private int iSize;
	private int iSqrtSize;
	
	public Sudoku(int iSize) throws Exception {
		super();
		this.iSize = iSize;
		
	}
	
	public Sudoku(int[][] puzzle) {
		
	}
	
	public int[][] getPuzzle(){
		return null;
		
	}
}
