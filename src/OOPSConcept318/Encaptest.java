package OOPSConcept318;

public class Encaptest {
	
	//datahiding +abstraction
	private String name;
	
	public void setName(String newName) {
		name=newName;
	}
	
	public String getName() {
	//	System.out.println(name);
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classname objecrefe=new<class>
		Encaptest encap=new Encaptest();
		
		encap.setName("Abu and Noman");
		String var=encap.getName();
		/* want to retrive the page 
		 * String pagetitle=driver.getTitle();
		 * pagetitle.isequals(" MS Teams")
		 * 
		 * 
		 * Webelement <element>=driver.findelement();
		 * signin.click();
		 * */
		
		
		//encap.getName();
		System.out.println("main program:"+var);

	}

}
