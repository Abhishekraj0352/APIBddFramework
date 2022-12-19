package restassuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class Utils {

	public static String getName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John"+generatedString);
	}
	
	public static String getJob() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("kumar"+generatedString);
	}
	
	public static String getUserName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("kumar"+generatedString);
	}
	
	
	public static String getPassword() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("kumar"+generatedString);
	}
}
