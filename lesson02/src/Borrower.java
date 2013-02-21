
/**
 * 
 */

/**
 * @author susdesign
 *
 */
public class Borrower extends Person {
	
	private String[]  interests;
	private boolean newsletter;
	private String email; 
	
	//constructor 1
	
	public Borrower(Person p, String[] interests, boolean newsletter, String email) {
        super(p.name, p.cpr, p.address);
        this.interests = interests;
        this.newsletter = newsletter;
        this.email = email;
    }
	

	public boolean hasInterest(String lookForInterest) {
		boolean hasInterest = false;
		for (String currentInterest : this.interests) {
			if (lookForInterest ==currentInterest) {
				hasInterest = true;
			}
	}
	return hasInterest;
			}
	
	public String getEmail() {
		return this.email;
	}
	
	public boolean wantsNewsletter() {
		return this.newsletter;
    }
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cprno cpr = new Cprno((long) 311882945);
		Person p1 = new Person(cpr, "Lucas", "Belleville", 0);
		String[] interests = { "i1", "i2", "i3" };
		Borrower b1 = new Borrower(p1, interests, false, "hahaha@wohoo.it" ); // let's
																				// say
																				// the
																				// Person
																				// already
																				// exists..
		System.out.println(b1.toString() + " " + b1.getEmail());
		System.out.println("Interested in jogging? "
				+ b1.hasInterest("jogging"));
		System.out.println("Wants newsletters? " + b1.wantsNewsletter());
	}

	}


