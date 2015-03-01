public class NestedWhileLoop {
	public static void main(String[] args) {
		
		String name = "Micke";
		String guess = "";
		int numTries = 0;
		
		while (!guess.equals(name.toLowerCase())) {
			guess = "";
			while (guess.length() < name.length()) {
				char asciiChar = (char) (Math.random() * 26 + 97);
				guess = guess + asciiChar;
				// System.out.println(guess);
			}
			numTries++;
		}
		System.out.println(name + " found after " + numTries + " tries!");
	}
}
