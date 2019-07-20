package restassuredtests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	
	public static String getFirstName(){
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return ("Naga" +generatedString);
	}

	public static String getLastName(){
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return ("Praveen" +generatedString);
	}
	
	public static String getUserName(){
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return ("Kumar" +generatedString);
	}
	
	public static String getPassword(){
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return ("Kuma12" +generatedString);
	}
	
	public static String getMail(){
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return (generatedString+"@gmail.com");
	}
	
	public static String empName(){
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return ("Naga" +generatedString);
	}
	
	public static String empSal(){
		String generatedString=RandomStringUtils.randomNumeric(5);
		return (generatedString);
	}
	
	public static String empAge(){
		String generatedString=RandomStringUtils.randomNumeric(2);
		return (generatedString);
	}
	
}
