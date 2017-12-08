package com.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenerateIP {

	private static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	private static Pattern pattern = null;
	private static Matcher matcher = null;

	public static void main(String[] args) {
		pattern = Pattern.compile(IPADDRESS_PATTERN);
		String number = "19216801";
		int l = number.length() - 3;
		for (int a = 0; a < l; a++) {
			for (int b = 0; b < l - a; b++) {
				for (int c = 0; c < l - a - b; c++) {
					StringBuilder sb = new StringBuilder(number);
					sb.insert(a + 1, ".");   // 1.
					sb.insert(a + b + 3, "."); // 1.9.
					sb.insert(a + b + c + 5, "."); // 1.9.2.16801
					
					if(validate(sb.toString()))
					    System.out.println(sb);
				}
			}
		}
	}

	public static boolean validate(final String ip) {
		Matcher matcher = pattern.matcher(ip);
		return matcher.matches();
	}

}
