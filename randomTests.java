package testing;

import org.junit.Test;
import static org.junit.Assert.*;


public class randomTests {
	// Checks to see if two arrays are equal
	@Test
    public void checkArrayEquals() throws Exception {
		int[] array = {2, 5, 6};
		int[] array2 = {2, 5,6};
		assertArrayEquals(array, array2);
}
	// Checks to see if two strings are not the same
	@Test
    public void checkNotSame() throws Exception {
        String name = new String();
        String name2 = new String();
        name = "John Smith";
        name2 = "John Michales";
        assertNotSame(name, name2);
}
	// Checks to see if two objects are equal
	@Test
    public void checkSame() throws Exception {
		String name = new String();
        name = "John";
        assertSame("John", name);
}
	// Short boolean method to test the next assert
	public boolean isEvenNumber(int number){   
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
	}
	
	// Checks to see if the method returns false with the value of 3
	@Test
	public void checkFalse() throws Exception {
        boolean mer = isEvenNumber(3);
        assertFalse(mer);
    }
	
	// Checks to see if the string "name" is not null
	@Test
    public void notNotNull() throws Exception {
        String name = new String();
        name = "Billy";
        assertNotNull(name);
}
	
	// Checks to see if the string "name" is null
	@Test
    public void Null() throws Exception {
        String name = new String();
        name = null;
        assertNull(name);
}
	
}
