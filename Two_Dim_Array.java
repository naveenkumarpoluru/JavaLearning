package day8;

public class Two_Dim_Array {

	public static void main(String[] args) {
		// [rows][col]
		String[][] x = new String[3][4];
		// First Row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		// Second Row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		// Third Row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";

		System.out.println("Rows are : " + x.length);
		System.out.println("Cols are : " + x[2].length);
		// row num
		int row = x.length;
		// Zerot col 
		
		// We are passing the index of the row.[0]
		int col = x[0].length;

		for (int rowNum = 0; rowNum < row; rowNum++) {
			for (int colNum = 0; colNum < col; colNum++) {
				System.out.print(x[rowNum][colNum] + "  ");

			}
			System.out.println();
		}
	}

}
