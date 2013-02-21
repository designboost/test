/**
 * 
 */

/**
 * @author susdesign
 *
 */
public class Cprno {
	
	private long cprno;

	/**
	 * @param args
	 */
	
	/**
     * Constructor
     * 
     */
    public Cprno(Long cprInd) {
       cprno = cprInd;
    }
    
    /**
     * Accessor method
     * @param void
     * @return cprno, value of property
     */
    public long getCprno() {
        return this.cprno;
    }
    
    /**
     * toString 
     * @param void
     * @return aString, representing the object
     */
    public String toString() {
        String aString = String.format("%06d-%04d", this.cprno / 10000, this.cprno % 10000);
        if (!this.checkCprno())
            aString += ", invalid";
        return aString;
    }
    
    /**
     * Method 
     * @param none
     * @return boolean
     */
    public boolean checkCprno() {
        long sum;
        long restcpr = this.cprno;
        sum = 0L;

        sum += (restcpr % 10) * 1;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 5;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 6;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 7;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        if (sum % 11 == 0 && sum != 0)
          return true;
        else
          return false;
     }

    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cprno c0 = new Cprno(2511450007L);
        System.out.println(c0);
        Cprno c1 = new Cprno(702900020L);
        System.out.println(c1);
        c1 = new Cprno(411940020L);
        System.out.println(c1);
	}

}
