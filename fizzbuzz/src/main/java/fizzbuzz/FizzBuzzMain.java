package fizzbuzz;

import javax.swing.SwingUtilities;

/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of
 * three print "Fizz" instead of the number and for the multiples of five print
 * "Buzz". For numbers which are multiples of both three and five print
 * "FizzBuzz".
 * 
 * Für die Zahlen 1 bis 100 wird das Ergebnis ausgegeben. Anschließend wird die Grafische Oberfläche erstellt.
 * 
 * @author Julia
 *
 */
public class FizzBuzzMain {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			StringBuilder sb = new StringBuilder();
			if(i < 100) {
				String s = (i < 10) ? "  " : " ";
				sb.append(s);
			}
			
			sb.append(i).append(" ==> ");
			
			if (i % 3 == 0 && i % 5 == 0) {
				sb.append("FizzBuzz");
			} else if (i % 3 == 0) {
				sb.append("Fizz");
			} else if (i % 5 == 0) {
				sb.append("Buzz");
			} else {
				sb.append(i);
			}
			
			System.out.println(sb.toString());
		}

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FizzBuzzGUI().displayGUI();
			}
		});

	}

}
