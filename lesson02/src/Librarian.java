/**
 * 
 */

/**
 * @author susdesign
 *
 */
public class Librarian extends Person{
	
	private double empFrac;         // employment fraction, 1.0= fulltime
    private String position;

	/**
	 * @param args
	 */
    
    public Librarian(String name, Cprno cpr, String address, double time, String job) {
        super(name, cpr, address);
        this.empFrac = time;
        this.position = job;
    }
    
    
    public boolean isFullTime() {
        double hours;
        hours= this.empFrac; 
        
        if (hours >= 1) 
    	return true;
        else
        return false;
        
    }
    
    public String getPosition() {
        return this.position;
    }
    
    public String toString() {
        String s = String.format("The position: %40s has a fraction of: %1.2f ", this.getPosition(), this.empFrac);
        return s;
    }
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cprno c = new Cprno(2511450007L);
        Person l1 = new Librarian("Niels Muller Larsen", c, "Sønderhøj 30", 1.2, "IT Specialist");
        System.out.println(l1);
        
        

	}

}
