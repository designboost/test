/**
 * 
 */

/**
 * @author susdesign
 *
 */
public class Palindrome {

	/**
	 * punctuation to be disregarded
	 */
	public static final String RGX = "[ ,.:,-?!]";

	/**
	 * This method prepares the string to be tested all chars to lower, all
	 * white space and punctuation removed. If done from caller it's done only
	 * once, if done from isPalindrome it's done on each recursive call
	 */
	public static String clean(String word) { // remove punctuation etc
		word = word.toLowerCase();
		return word.replaceAll(Palindrome.RGX, "");
	}

	private static char first(String word) {
		return word.charAt(0);
	}

	public static boolean isPalindrome(String word) {
		if (word.length() == 1)
			return true;
		else if (word.length() == 2)
			return first(word) == last(word);
		else {
			System.out.println(first(word) + " - " + middle(word) + " - "
					+ last(word));
			return first(word) == last(word) && isPalindrome(middle(word));
		}
	}

	private static char last(String word) {
		return word.charAt(word.length() - 1);
	}

	private static String middle(String word) {
		return word.substring(1, word.length() - 1);
	}
}