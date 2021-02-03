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
	public void testAddWithEmptyString() {
		int result = target.add("");
		assertEquals(0, result);
	}

	@Test
	public void testAddWithNullString() {
		int result = target.add(null);
		assertEquals(0, result);
	}

	@Test
	public void testAddWithNumbers() {
		assertEquals(1, target.add("1"));
		assertEquals(3, target.add("1,2"));
		assertEquals(6, target.add("1,2,3"));
		assertEquals(15, target.add("abc456"));
		assertEquals(7, target.add("x4y1z2"));
	}

}
