package notDefault;
import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.color.*;
import java.awt.font.*;
import java.awt.image.*;

public class ConveyMain {

	public static void main(String[] args) {
		
		init();
		
		
	}
	
	public static void init() {
		Scanner scan = new Scanner(System.in);
		int x, y;
		System.out.print("X (10-100) = ");
		x = scan.nextInt();
		System.out.print("Y (10-100) = ");
		y = scan.nextInt();
		scan.close();
		
		if(y<10) y=10;
		if(y>100) y=100;
		if(x<10) x=10;
		if(x>100) x=100;
		
		byte[][] board = new byte[x+2][y+2];
		
		board = clear(board, x, y);
	}
	
	// calc next gen
	
	public static byte[][] gen(byte[][] board, int x, int y) {
		byte[][] nfeld = new byte[x+2][y+2];
		for (int i=1;i<=x;i++) {
			for (int j=1;j<=y;j++) {
				int val = check(board, i, j);
				if(board[i][j]==0 || board[i][j]==2) {
					if(val==3) {
						board[i][j] = 1;
					}
				} else if(board[i][j]==1) {
					if(val<2 || val>3) {
						board[i][j]=2;
					}
				}
			}
		}
		return nfeld;
	}
	
	// check surrounding fields
	
	public static byte check(byte[][] board, int x, int y) {
		byte val=0;
		if(board[x-1][y-1]==1)	val += 1;
		if(board[x-1][y]==1)	val += 1;
		if(board[x-1][y+1]==1)	val += 1;
		if(board[x][y-1]==1)	val += 1;
		if(board[x][y+1]==1)	val += 1;
		if(board[x+1][y-1]==1)	val += 1;
		if(board[x+1][y]==1)	val += 1;
		if(board[x+1][y+1]==1)	val += 1;
		return val;
	}
	
	// render canvas
	
	public static void render(byte[][] feld, int x, int y) {
		
	}
	
	// clear board
	
	public static byte[][] clear(byte[][] board, int x, int y){
		for (int i=0; i<x+1;i++) {
			for (int j=0; j<y+1; j++) {
				board[i][j]=0;
			}
		}
		return board;
	}

}
