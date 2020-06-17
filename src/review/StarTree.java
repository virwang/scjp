package review;

public class StarTree {

	public static void main(String[] args) {

		//row control
		for (int i = 1; i <= 5; i++) 
		{
			
			// control show space 
			for (int j = 1; j <= 5 - i; j++) 
			{
//				System.out.println("j="+j);
				System.out.print("-");
			}
			//control show *
			for (int k = 1; k <= 2 * i - 1; k++) 
			{
				System.out.print("*");
			}
			//change row
			System.out.println(); 
		}
		//downside
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("-");
			}
			for (int k = 1; k <= 2 * (4 - i) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
