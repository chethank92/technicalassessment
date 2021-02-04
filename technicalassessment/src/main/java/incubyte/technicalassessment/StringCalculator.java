package incubyte.technicalassessment;

import java.util.*;
import java.util.regex.*;

/**
 * @author Chethan
 *
 */
public class StringCalculator {

	private static int count = 0;

	public int add(String numbers) throws Exception {

		int sum = 0;

		if (Objects.isNull(numbers) || numbers.isEmpty()) {
			return sum;
		}

		List<String> negativeNumbers = findForNegativeNumbers(numbers);

		if (!negativeNumbers.isEmpty()) {
			throw new Exception("negatives not allowed" + negativeNumbers);
		}

		for (char ch : numbers.toCharArray()) {
			if (Character.isDigit(ch)) {
				int number = Integer.parseInt(String.valueOf(ch));
				sum += number;
			}
		}
		count++;
		return sum;
	}

	private List<String> findForNegativeNumbers(String numbers) {
		List<String> negativeNumbers = new ArrayList<String>();
		Pattern pattern = Pattern.compile("-[0-9]");
		Matcher matcher = pattern.matcher(numbers);

		while (matcher.find()) {
			negativeNumbers.add(matcher.group());
		}
		return negativeNumbers;
	}

	public int getCalledCount() {
		return count;
	}
}
