package fizzbuzz;

public class FizzBuzz {

	 
	/**
	 * FizzBuzz gibt unterbestimmten Bedingungen einen Text aus:
	 * 
	 * Sollte 
	 * i durch 3 teilbar sein: Fizz
	 * i durch 5 teilbar sein: Buzz
	 * i durch 3 und 5 teilbar sein: FizzBuzz
	 * 
	 * Sonst wird i selbt zurück gegeben.
	 * 
	 * @param i
	 * @return
	 */
	public static String fizzBuzz(int i) {
		
		if(i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		}
		
		if(i % 3 == 0) {
			return "Fizz";
		}
		
		if(i % 5 == 0) {
			return "Buzz";
		}
		
		return String.valueOf(i);
	}
}
