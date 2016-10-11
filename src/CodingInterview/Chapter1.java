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
	
	public String URLify(String str) {
		String[] strArr = str.split(" ");
		String finalStr = String.join("%20", strArr);
		return finalStr;
	}
	
	public boolean permutationPalindrome(String str) {
		// Can the string have a palindrome?
		// 1. We don't care about spaces based on Example
		String newStr = str.replaceAll(" ", "").toLowerCase();
		// 2 conditions: 1. odd characters, so we can allow one mid char.
		// 2. even characters, all need to be even!
		int[] charSet = new int[255];
		for(int i = 0; i < newStr.length(); i++) {
			charSet[newStr.charAt(i)]++;
		}
		int leftOver = 0;
		for(int i = 0; i < charSet.length; i++) {
			System.out.println(charSet[i]);
			leftOver += charSet[i] % 2;
		}
		if (newStr.length() % 2 == 0 && leftOver == 0) {
			return true;
		} else if(newStr.length() % 2 == 1 && leftOver == 1) {
			return true;
		}
		return false;
	}
	
	public boolean oneEditAway(String str1, String str2) {
		//IS str2 one edit away from str1? Edit: insert, delete, replace.
		// IF insert, str1 + 1 char = str2.
		// IF delete, str1 - 1 char = str2.
		// IF replace, str1 (change one char) = str2.
		boolean flaw = false;
		if(str1.length() == str2.length()) {
			for(int i = 0; i < str1.length(); i++) {
				if(str1.charAt(i) != str2.charAt(i)) {
					if(flaw == true) {
						return false;
					} else {
						flaw = true;
					}
				}
			}
		} else if (str1.length() + 1 == str2.length()) {
			for(int i = 0, j = 0;j < str2.length(); i++, j++) {
				if(i == str2.length() - 1) {
					break;
				}
				if(str1.charAt(i) != str2.charAt(j)) {
					if(flaw == true) {
						return false;
					} else {
						flaw = true;
						i--;
					}
				}
			}
		} else if (str1.length() == str2.length() + 1) {
			for(int i = 0, j = 0; i < str1.length(); i++, j++) {
				if(i == str1.length() - 1) {
					break;
				}
				if(str1.charAt(i) != str2.charAt(j)) {
					if(flaw == true) {
						return false;
					} else {
						flaw = true; 
						j--;
					}
				}
			}
		} else {
			return false;
		}
		return true;
	}
	
	public String q6StringCompression(String str) {
		StringBuilder stringB = new StringBuilder();
		stringB.append(str.charAt(0));
		for(int i = 1, counter = 1; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				counter++;
			}else {
				stringB.append(counter);
				stringB.append(str.charAt(i));
				counter = 1;
			}
			if(i == str.length()-1) {
				stringB.append(counter);
			}
		}
		String string1 = stringB.toString();
		return string1;
	}
	
	public void q7MatrixRotate(int[][] matrix, int n) {
		for(int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last - offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
	}
	
	public void q8MatrixZeroElements(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		//Change correct rows to 0.
		for(int i = 0; i < row.length; i++) {
			if(row[i]) {
				for(int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		//Change correct columns to 0.
		for(int i = 0; i < column.length; i++) {
			if(column[i]) {
				for(int j = 0; j < matrix.length; j++) {
					matrix[j][i] = 0;
				}
			}
		}
	}
	
	public boolean q9RotationString(String str1, String str2) {
		int len = str1.length();
		if(len == str2.length() && len > 0) {
			String s1s1 = str1 + str1;
			//return isSubstring(s1s1, str2);
		}
		return false;
	}
	
}
