import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class TestBryantHernandez {

	@Test
	public void getFullName()
	{
		
		Assertions.assertEquals("Bryant Hernandez", new BryantHernandez().getFullName());
	}
	@Test
	public void getFirstName() {
		Assertions.assertEquals("Bryant", new BryantHernandez().getFirstName());
	}
	@Test
	public void getLastName() {
		Assertions.assertEquals("Hernandez", new BryantHernandez().getLastName());
	}
	@Test
	public void getUCInetID() {
		Assertions.assertEquals("Bryanth1", new BryantHernandez().getUCInetID());
	}
	@Test
	public void getStudentNumber() {
		Assertions.assertEquals(66774600, new BryantHernandez().getStudentNumber());
		
	}
	@Test
	public void getRotatedFullName1() {
		Assertions.assertEquals("dezBryant Hernan", new BryantHernandez().getRotatedFullName(-3));
	}
	@Test
	public void getRotatedFullName2() {
		Assertions.assertEquals("ant HernandezBry", new BryantHernandez().getRotatedFullName(3));
	}
	@Test 
	public void getRotatedFullName3() {
		Assertions.assertEquals("Shift size is greater than Name Length, use a shift size smaller or equivalent to name length", new BryantHernandez().getRotatedFullName(23));
	}
	@Test
	public void getRotatedFullName4() {
		Assertions.assertEquals("Shift size is greater than Name Length, use a shift size smaller or equivalent to name length", new BryantHernandez().getRotatedFullName(-23));
	}
}
