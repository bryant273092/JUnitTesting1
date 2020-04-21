
public class BryantHernandez {
	public static void main(String [] args) {
		new BryantHernandez().getRotatedFullName(-3);
		new BryantHernandez().getRotatedFullName(3);
	}
	public String getFullName(){
		return "Bryant Hernandez";
	}
	public String getFirstName() {
		return "Bryant";
	}
	public String getLastName() {
		return "Hernandez";
	}
	public String getUCInetID() {
		return "Bryanth1";
	}
	public int getStudentNumber() {
		return 66774600;
	}
	public String getRotatedFullName(int shift) {
		String name = getFullName();
		if (shift < name.length()) {
			 //if negative
			if (shift < 0) {
				if (shift > -name.length()) {
					//System.out.println("negative shift is: " + name.substring(name.length()+shift, name.length()) + name.substring(0,name.length()+shift));
					return  name.substring(name.length()+shift, name.length()) + name.substring(0,name.length()+shift);
				}
			
				
			}
			else {
				//probably positive if not negative
				//System.out.println("Positive shift 3 is: " + name.substring(shift, name.length()) + name.substring(0,shift));
				return name.substring(shift, name.length()) + name.substring(0,shift);
				
			}
			
		}
		
		return "Shift size is greater than Name Length, use a shift size smaller or equivalent to name length"; 
	}
	
}
