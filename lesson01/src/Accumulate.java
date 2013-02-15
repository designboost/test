import javax.swing.JOptionPane;
/**
 * 
 */

/**
 * @author susdesign
 *
 */
public class Accumulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int terms;
		double rate, principal, accumulated;

		terms = 10;
		rate = 3.5;
		// accumulated = principal = 1000; // equivalent of lines 19 and 20
		principal = 1000;
		accumulated = principal;
		String s = "Initial principal " + principal;
		s += "\nInterest rate " + rate + "%";
		
		int i =0;
		
		while ( i < terms) {
			accumulated = accumulated * (1 + rate / 100);
			i++;
		}
		s += "\nAfter " + terms;
		//System.out.print(s);
		String s1 = " terms the principal amounts to " + accumulated;
		//System.out.println(s1);
		s += s1;
		JOptionPane.showMessageDialog(null, s); // display variable
	}

}
