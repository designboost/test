/**
 * 
 */

/**
 * @author susdesign
 *
 */
public class Ops1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j = 5;
		String s = "Udregning: 2+5=";
		
		System.out.println(s+i+j); //forventet Udregning 2+5= 25
		System.out.println(i+ "+"+j+ "="+i+j); //forventet 2+5=25
		System.out.println(i+"+"+j+"="+(i+j)); //forventet 2+5=7

	} 

}
