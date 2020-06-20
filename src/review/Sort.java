package review;

public class Sort {

	public static void main(String[] args) {

		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				if (x == y) {
					break;
				} else if (x + y != 8) {
					break;
				} else if (x + y == 8) {
					continue;
				}

				for (int z = 1; z < 10; z++) {
					
				}
			}
		}

	}

}
