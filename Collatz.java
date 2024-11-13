// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		if (args[1].equals("v")) {
			System.out.println("1 4 2 1 (4)");
			int times = Integer.parseInt(args[0]);
			for (int i=2;i<=times;i++) {
				int sum = i;
				int counter = 1;
				while (sum!=1) {
					System.out.print(sum+" ");
					if (sum%2 == 0) {
						sum = sum/2;
					}
					else {
						sum = sum*3+1;
					}
					counter++;
				}
				System.out.print("1 ");
				System.out.println("(" + counter + ")");
			}
			System.out.println();
			System.out.println("Every one of the first " + times +" hailstone sequences reached 1.");
		}
		else {
				int times = Integer.parseInt(args[0]);
				for (int i=2;i<=times;i++) {
					int sum = i;
					while (sum!=1) {
						if (sum%2 == 0) {
							sum = sum/2;
						}
						else {
							sum = sum*3+1;
						}
					}
		}
			System.out.println("Every one of the first " + times +" hailstone sequences reached 1.");
	}
}
}
