public class Objective8Lab3 {
	public static void main(String[] args) {
		int counter = 1, i; 

		for (i=1; counter <= 20; i++) {

			if (counter % 2 == 0) {
				System.out.println(counter + " is even ");
			}

			else {
				System.out.println(counter + " is odd");
			}

			counter = counter + 1;

			
		}
	}
}