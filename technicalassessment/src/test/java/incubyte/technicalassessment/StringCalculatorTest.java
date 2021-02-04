package incubyte.technicalassessment;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Chethan
 *
 */
public class StringCalculatorTest {

	StringCalculator target = new StringCalculator();;

	@Test
	public void testAddWithEmptyString() throws Exception {
		int result = target.add("");
		assertEquals(0, result);
	}

	@Test
	public void testAddWithNullString() throws Exception {
		int result = target.add(null);
		assertEquals(0, result);
	}

	@Test
	public void testAddWithNumbers() throws Exception {
		assertEquals(1, target.add("1"));
		assertEquals(3, target.add("1,2"));
		assertEquals(6, target.add("1,2,3"));
		assertEquals(15, target.add("abc456"));
		assertEquals(7, target.add("x4y1z2"));
	}

	@Test
	public void testAddwithDelimiters() throws Exception {
		assertEquals(6, target.add("//[*][%]\\n1*2%3”"));
	}
	
	@Test(expected = Exception.class)
	public void testAddwithNegativeNumbers() throws Exception {
		target.add("//[*][%]\\n-1*2%3”");
	}
	
	@Test(expected = Exception.class)
	public void testAddwithMultipleNegativeNumbers() throws Exception {
		target.add("a-2c4.s-5t/n-9");
	}
	
	
}
