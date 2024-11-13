// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    double sum = 1;
		int length = Integer.parseInt(args[0]);
		for (int i=1;i<length;i++) {
			if (i%2 == 1) {
				sum = sum - (1/(2* (double) i+1));
			}
			else{
				sum = sum + (1/(2*(double) i+1));
			}
		}
		System.out.println("pi according to Java: " +Math.PI);
		System.out.println("pi, approximated:     " +(sum*4));
	}
}
