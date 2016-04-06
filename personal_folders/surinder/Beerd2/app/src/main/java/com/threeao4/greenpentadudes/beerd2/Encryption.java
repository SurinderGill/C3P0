package com.threeao4.greenpentadudes.beerd2;
public class Encryption {

	private static int[] chain = { 1, 2, 3 };

	public static String encrypt(String key) {

		String result = "";
		int l = key.length();
		char ch;
		int currentKey = 0;

		for (int i = 0; i < l; i++) {

			if (currentKey >= chain.length - 1) {
				currentKey = 0;
			}

			ch = key.charAt(i);
			ch += chain[currentKey];
			result += ch;
			currentKey++;
		}

		return result;
	}

	public static String decrypt(String key) {

		String result = "";
		int l = key.length();
		char ch;
		int currentKey = 0;

		for (int i = 0; i < l; i++) {

			if (currentKey >= chain.length - 1) {
				currentKey = 0;
			}

			ch = key.charAt(i);
			ch -= chain[currentKey];
			result += ch;
			currentKey++;
		}

		return result;
	}
}
