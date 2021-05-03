package Day22;

import java.util.Scanner;

public class ChessBoard {
	//You are given coordinates, a string that represents the coordinates of a square of the chessboard.
	//Below is a chessboard for your reference.
	//Return true if the square is white, and false if the square is black.

//The coordinate will always represent a valid chessboard square.
//The coordinate will always have the letter first, and the number second.
static boolean squareIsWhite(String coordinates)
{
	return coordinates.charAt(0)%2==0 ^ coordinates.charAt(1)%2==0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String coordinates=sc.next();
		System.out.println(squareIsWhite(coordinates));
	}

}
