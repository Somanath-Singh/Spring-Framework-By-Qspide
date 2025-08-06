package com.string.programInterface;

public interface IStringProgram {

	// ✅ Reverse a String
	public String findReverse(String str);

	// ✅ Check if a String is a Palindrome
	public boolean isPalindrome(String str);

	// ✅ Count the no of consonant, vowels, special characters and numbers
	public String printCharacterContainsInString(String str);

	// ✅ Implement atoi() (Convert String to Integer)
	public String sumOfDigitsInString(String str);

	// ✅print duplicates elements of string using own logic
	public String printDuplicatesElement(String str);

	// ✅print non duplicates elements of string using own logic
	public String printNonDuplicatesElement(String str);

	// ✅ Remove Duplicates from a String (best)
	public String printDuplicatesUsingInternalMethod(String str);

	// ✅ Remove Non Duplicates from a String (best)
	public String printNonDuplicatesUsingInternalMethod(String str);

	// ✅ Run-Length Encoding (RLE) - By own logic
	public String replaceDuplicateCharacterUsingLogic(String str);

	// ✅ Run-Length Encoding (RLE)
	public String replaceDuplicateCharacterUsingMethod(String str);

	// ✅ Run-Length Encoding (RLE) - Reversed of this
	public String printNoOfCharacterPresentString(String str);

	// ✅ Count Occurrences of a Character in a String
	public void frequenceOfCharacter(String str);

	// ✅ All the substring of a string - By own logic
	public void printSubString(String str);

	// ✅ All the substring of a string
	public void printSubStringUsingInternalMaehod(String str);

	// ✅ All the substring of a string - Organised Manner (best)
	public void printSubStringInOrganisedMannaer(String str);

	// ✅ All the substring of a string - In reversed order
	public void printSubStringInOrganisedMannaerInReversed(String str);

	// ✅ Check if Two Strings are Anagrams
	public void checkAnnaGramOfString(String str1, String str2);
	
	public boolean areAnagrams(String str1, String str2);

	// ✅ Check if One String is a Rotation of Another
	public boolean checkRotationOfEachOther(String str1, String str2);

	// ✅ Check if Two Strings are Pnagrams
	public boolean checkPannaGram(String str);

	// ✅ Longest Palindromic Substring
	public void longestPalindromicSubString(String str);

	// ✅ Reversed each words in a string
	public void reversedEachWordInAString(String str);

	// ✅ Longest Common Substring
	public void longestcommonSubString(String str1, String str2);

	// ✅ Find the First Non-Repeating Character
	public void firstNonRepeatingCharacter(String str);
	
	//✅ Check if one string is a subsequence of another
	public void checkOneStringIsSubSequenceOfAnother(String str1,String str2);

}
