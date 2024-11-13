// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	   String cheer = args[0];
           String upperCheer = cheer.toUpperCase();
           int count = Integer.parseInt(args[1]);
           for (int p=0;p<upperCheer.length();p++) {
                char c = upperCheer.charAt(p);
                String anLetters = "AEFHILMNORSX";
                if (anLetters.indexOf(c)==-1){
                        System.out.println("Give me a  " + c + ": " + c + "!");
                }
                else {
                        System.out.println("Give me an " + c + ": " + c + "!");
                }
           }
           System.out.println("What does that spell?");
           for (int i=0;i<count;i++) {
                System.out.println(upperCheer + "!!!");
           }
        }
}
