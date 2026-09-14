// 1 2 3 4 5 6
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
1

public class Pattern5 {
	public static void main(String[] args) {

		for (int iTemp = 6; iTemp >= 1; iTemp--) {

			for (int jTemp = 1; jTemp <= iTemp; jTemp++) {
				System.out.print(jTemp + " ");
			}

			System.out.println();
		}
	}
}