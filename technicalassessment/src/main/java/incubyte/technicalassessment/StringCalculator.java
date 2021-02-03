package incubyte.technicalassessment;

import java.util.Objects;

/**
 * @author Chethan
 *
 */
public class StringCalculator {

	public int add(String numbers) {

		int sum = 0;

		if (Objects.isNull(numbers) || numbers.isEmpty()) {
			return sum;
		}

		for (char ch : numbers.toCharArray()) {
			if (Character.isDigit(ch)) {
				sum += Integer.parseInt(String.valueOf(ch));
			}
		}
		return sum;
	}
}
