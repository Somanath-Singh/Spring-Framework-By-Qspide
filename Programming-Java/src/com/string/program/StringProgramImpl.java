package com.string.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.string.programInterface.IStringProgram;

public class StringProgramImpl implements IStringProgram, Comparator<String> {

	// ✅ Reverse a String
	@Override
	public String findReverse(String str) {

		String strrev = "";

		for (int i = 0; i < str.length(); i++) {
			strrev = str.charAt(i) + strrev;
		}

		return "Reversed string is : " + strrev;
	}

	// ✅ Check if a String is a Palindrome
	@Override
	public boolean isPalindrome(String str) {

		String strrev = "";

		for (int i = 0; i < str.length(); i++) {
			strrev = str.charAt(i) + strrev;
		}

		return strrev.equals(str);
	}

	// ✅ Count the no of consonant, vowels, special characters and numbers
	@Override
	public String printCharacterContainsInString(String str) {

		String vowels = "";
		String consonant = "";
		String uppercase = "";
		String lowercase = "";
		String nos = "";
		String special = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 65 && ch <= 90) {

				uppercase += ch;

				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					vowels += ch;
				} else {
					consonant += ch;
				}

			} else if (ch >= 97 && ch <= 122) {

				lowercase += ch;

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels += ch;
				} else {
					consonant += ch;
				}

			} else if (ch >= '0' && ch <= '9') {

				nos += ch;

			} else {
				special += ch;
			}
		}

		return "The give string contains : Vowels:" + vowels + " consonant:" + consonant + " uppercase:" + uppercase
				+ " lowercase:" + lowercase + " numbers:" + nos + " special character:" + special;
	}

	// ✅ Implement atoi() (Convert String to Integer)
	@Override
	public String sumOfDigitsInString(String str) {

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= '0' && ch <= '9') {

				sum = sum + (int) (ch - 48);

			}
		}
		return "Sum of integer in a string is : " + sum;
	}

	// ✅print duplicates elements of string using own logic
	@Override
	public String printDuplicatesElement(String str) {

		String duplicates = "";
		String notDuplicates = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (!notDuplicates.contains(String.valueOf(ch))) {
				notDuplicates += ch;
			} else {
				if (!duplicates.contains(String.valueOf(ch))) {
					duplicates += ch;
				}
			}

		}

		return "Duplicate characters are : " + duplicates + " NonDuplicate characters are : " + notDuplicates;
	}

	// ✅print non duplicates elements of string using own logic
	@Override
	public String printNonDuplicatesElement(String str) {

		String str2 = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (!str2.contains(String.valueOf(ch))) {
				str2 += ch;
			}

		}
		return "Original string : " + str + " After removing duplicates : " + str2;
	}

	// ✅ Remove Duplicates from a String (best)
	@Override
	public String printDuplicatesUsingInternalMethod(String str) {

		String res = "";

		while (str.length() != 0) {

			char ch = str.charAt(0);
			String str2 = str.replace(ch + "", "");
			int len = str.length() - str2.length();

			if (len > 1) {

				if (!res.contains(ch + "")) {
					res += ch;
				}
			}
			str = str2;
		}

		return "Duplicates elements in a string is : " + res;
	}

	// ✅ Remove Non Duplicates from a String
	@Override
	public String printNonDuplicatesUsingInternalMethod(String str) {

		String res = "";

		while (str.length() != 0) {

			char ch = str.charAt(0);
			String str2 = str.replace(ch + "", "");
			int len = str.length() - str2.length();

			if (len == 1) {
				if (!res.contains(ch + "")) {
					res += ch;
				}
			}
			str = str2;
		}
		return "Non duplicates elements in a string is : " + res;
	}

	// ✅ Run-Length Encoding (RLE) - By own logic
	@Override
	public String replaceDuplicateCharacterUsingLogic(String str) {

		String res = "";
		int j = 0;

		for (int i = 0; i < str.length(); i++) {

			int count = 1;
			for (j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					count++;
				} else {
					i = j - 1;
					break;
				}
			} // for

			res = res + str.charAt(i) + count;

			if (j == str.length()) {
				break;
			} // if

		} // for

		return "After removing duplicates using logic : " + res;
	}

	// ✅ Run-Length Encoding (RLE)
	@Override
	public String replaceDuplicateCharacterUsingMethod(String str) {

		String res = "";

		while (str.length() != 0) {

			char ch = str.charAt(0);
			String str2 = str.replace(ch + "", "");

			int count = str.length() - str2.length();

			res = res + ch + count;

			str = str2;
		}

		return "After removing duplicates using string method : " + res;
	}

	// ✅ Run-Length Encoding (RLE) - Reversed of this
	@Override
	public String printNoOfCharacterPresentString(String str) {

		String res = "";

		for (int i = 0; i < str.length() - 1; i = i + 2) {

			char ch = str.charAt(i);
			int no = str.charAt(i + 1) - 48;

			for (int j = 0; j < no; j++) {
				res += ch;
			}
		}
		return str + "is converted into : " + res;
	}

	// ✅ Count Occurrences of a Character in a String
	@Override
	public void frequenceOfCharacter(String str) {

		System.out.println("frequesncy of each character is : ");

		while (str.length() != 0) {

			char ch = str.charAt(0);
			String str2 = str.replace(ch + "", "");
			int len = str.length() - str2.length();
			System.out.println(ch + "-->" + len + "  ");
			str = str2;

		}

	}

	// ✅ All the substring of a string - By own logic
	@Override
	public void printSubString(String str) {

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {

			list.add(str.charAt(i) + "");
			String sub2 = str.charAt(i) + "";

			for (int j = i + 1; j < str.length(); j++) {

				sub2 = sub2 + str.charAt(j) + "";

				list.add(sub2);
			}
		}

		Collections.sort(list, new StringProgramImpl());
		System.out.println(list);

	}

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}

	// ✅ All the substring of a string
	@Override
	public void printSubStringUsingInternalMaehod(String str) {

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {

				list.add(str.substring(i, j));
			}
		}

		System.out.println(list);

	}

	// ✅ All the substring of a string - Organised Manner
	@Override
	public void printSubStringInOrganisedMannaer(String str) {

		System.out.println("StringProgramImpl.printSubStringInOrganisedMannaer()");

		for (int i = 1; i <= str.length(); i++) {

			for (int j = 0;; j++) {

				System.out.println(str.substring(j, i + j));

				if (i + j == str.length()) {
					break;
				}
			}
		}

	}

	// ✅ All the substring of a string - In reversed order
	@Override
	public void printSubStringInOrganisedMannaerInReversed(String str) {

		System.out.println("StringProgramImpl.printSubStringInOrganisedMannaerInReversed()");

		for (int i = str.length(); i >= 1; i--) {

			for (int j = 0;; j++) {

				System.out.println(str.substring(j, i + j));

				if (i + j == str.length()) {
					break;
				}
			}
		}

	}

	// ✅ Check if Two Strings are Anagrams
	@Override
	public void checkAnnaGramOfString(String str1, String str2) {

		char ch1[] = str1.toCharArray();
		Arrays.sort(ch1);

		char ch2[] = str2.toCharArray();
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Given String is Anagram");
		} else {
			System.out.println("Given String is not Anagram");
		}
	}
	
	public boolean areAnagrams(String str1, String str2) {
	    if (str1.length() != str2.length()) {
	        return false;
	    }
	    
	    while (str1.length() != 0) {
	        char ch = str1.charAt(0);
	        
	        String s1 = str1.replace(ch + "", "");
	        String s2 = str2.replace(ch + "", "");
	        
	        int len1 = str1.length();
	        int len2 = str2.length();
	        
	        if (len1 != len2) {
	            return false;
	        }
	        
	        str1 = s1;
	        str2 = s2;
	    }
	    
	    return true;
	}

	// ✅ Check if One String is a Rotation of Another
	@Override
	public boolean checkRotationOfEachOther(String str1, String str2) {

		for (int i = 0; i < str1.length(); i++) {

			str1 = str1.substring(1, str1.length()) + str1.charAt(0);

			if (str1.equals(str2)) {
				return true;
			}

		}
		return false;
	}

	// ✅ Check if Two Strings are Pnagrams
	@Override
	public boolean checkPannaGram(String str) {

		char ch = 'a';

		if (str.length() < 26) {
			return false;
		}

		while (ch <= 'z') {

			String str2 = str.replace(ch + "", "");
			int length = str.length() - str2.length();

			if (length == 0) {
				return false;
			}
			ch++;
		}

		return true;
	}

	// ✅ Longest Palindromic Substring
	@Override
	public void longestPalindromicSubString(String str) {

		int length = str.length();
		String longestPalindrome = "";

		for (int i = length; i >= 1; i--) {

			for (int j = 0;; j++) {

				// calculate substring
				String substr = str.substring(j, i + j);
				String rev = "";
				// find reverse of string
				for (int k = 0; k < substr.length(); k++) {

					rev = substr.charAt(k) + rev;

				}
				// check string is palindrome or not
				if (substr.equals(rev)) {
					if (longestPalindrome.length() < substr.length()) {
						longestPalindrome = substr;
					}
				}

				if (i + j == length) {
					break;
				}
			}
		}

		System.out.println("Longest palindromic substring is : " + longestPalindrome);

	}

	// ✅ Reversed each words in a string
	@Override
	public void reversedEachWordInAString(String str) {

		String word[] = str.split(" ");
		String reversedWord = "";

		for (int i = 0; i < word.length; i++) {

			String rev = "";

			for (int j = 0; j < word[i].length(); j++) {

				rev = word[i].charAt(j) + rev;

			}
			reversedWord = reversedWord + rev + " ";
		}

		System.out.println("Reversed word of a string is : " + reversedWord.trim());

	}

	// ✅ Longest Common Substring
	@Override
	public void longestcommonSubString(String str1, String str2) {

		String longestSubstr = "";

		for (int i = str1.length(); i >= 1; i--) {

			for (int j = 0;; j++) {

				String substr = str1.substring(j, i + j);

				if (str2.contains(substr)) {

					if (longestSubstr.length() < substr.length()) {

						longestSubstr = substr;
					}
				}

				if (i + j == str1.length()) {
					break;
				}
			}
		}

		System.out.println("Longest common substring in both the string is : " + longestSubstr);
	}

	// ✅ Find the First Non-Repeating Character
	@Override
	public void firstNonRepeatingCharacter(String str) {

		while (str.length() != 0) {

			String newstr = str.replace(str.charAt(0) + "", "");

			if (str.length() - newstr.length() == 1) {

				System.out.println(str.charAt(0));
				break;

			}
			str = newstr;
		}
	}

	
	@Override
	public void checkOneStringIsSubSequenceOfAnother(String str1, String str2) {
		
		
	}

}
