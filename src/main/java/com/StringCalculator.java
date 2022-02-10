package com;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author affes
 *
 */
public class StringCalculator {
	/**
	 * 
	 * @param numbers
	 * @return
	 * @throws Exception
	 */
	public static int Add(String numbers) throws Exception {
		if (numbers.isEmpty()) {
			return 0;
		}
		String[] listValues;
		String delimiter = ",";
		List<String> listNegatives = new ArrayList<String>();
		int result = 0;
		try {

			if (!numbers.endsWith("/n")) {

				if (numbers.startsWith("//")) {
					delimiter = numbers.substring(2, 3);
					numbers = numbers.substring(3, numbers.length());
				}
				listValues = numbers.split("['" + delimiter + "/n']+");
				for (String value : listValues) {
					result += Integer.parseInt(value);
					if (Integer.parseInt(value) < 0) {
						listNegatives.add(value);
					}
				}
				if (!listNegatives.isEmpty())
					throw new Exception("negatives not allowed" + listNegatives);
				
			}else {
				throw new Exception("Number not allowed: "+numbers);
			}
		} catch (NumberFormatException ex) {
            throw new NumberFormatException("Number not allowed: "+ex);

		}

		return result;
	}

}
