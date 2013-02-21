import javax.swing.JOptionPane;

public class WordPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String t;
		String s = JOptionPane.showInputDialog("Enter a phrase: ");
		String u = Palindrome.clean(s); // remove white noise
		if (Palindrome.isPalindrome(u))
			t = "\"" + s + "\"" + "\nis a palindrome";
		else
			t = s + "\nis not a palindrome";
		JOptionPane.showMessageDialog(null, t);
		System.out.println(t);
	}
}
