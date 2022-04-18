
public class qaclass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="TechSolutions";
		
		System.out.println(s);
		
		/*length
		concat
		equals()
		equalsignorecase()
		contains()
		substring()
		replace()*/
		
		s.length();  //displays the length of the string
		System.out.println(s.length());
		
		//concat
		String s1="Welcome";
		String s2="To QA Training";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		//equals->compares both the string ->returns boolean value true/false
		String s3="Abu";
		String s4="Abu";
		System.out.println(s3.equals(s4));
		
		//equalsignorecase()->compares both the string and ignores the case Upper/lower->returns boolean value true/false
		
		String s5="QATRAINING";
		String s6="qatraining";
		System.out.println("EqualsIgnoreCase :"+s5.equalsIgnoreCase(s6));
		
		//contains->verifies the string contains or not and return boolean value
		
		String s7="WEL";
		String s8="COME";
		System.out.println("Contains:"+s7.contains(s8));
		
		//substring (starting index,ending index)
		
		String s9="WELCOME";
		System.out.println("Display Substring: "+s9.substring(1,5));
		
		//replace(character original,replace character)
		
		String s10="WELCOME";
		System.out.println(s10.replace('E','A'));
		
				

	}

}
