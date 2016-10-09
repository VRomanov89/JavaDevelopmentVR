package CodingInterview;

import java.util.Arrays;

public class Chapter1 {
	public boolean isUnique(String str, int charCount) {
		boolean[] charList = new boolean[charCount];
		Arrays.fill(charList, false);
		if(str.length() < 2) {
			return true;
		} else {
			for(int i = 0; i < str.length(); i++) {
				if(charList[str.charAt(i)] == true) {
					return false;
				} else {
					charList[str.charAt(i)] = true;
				}
			}
			return true;
		}
	}
	
	public boolean isPermuationOf(String str1, String str2) {
		// IS str1 a permutation of str2?
		if(str1.length() != str2.length()) {
			return false;
		}
		int[] charStorage = new int[255];
		for(int i = 0; i < str1.length(); i++) {
			charStorage[str1.charAt(i)]++;
			charStorage[str2.charAt(i)]--;
		}
		for(int i = 0; i < charStorage.length; i++) {
			if(charStorage[i] !=0)
				return false;
		}
		return true;
	}
}
