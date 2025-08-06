package com.string.main;

import com.string.program.StringProgramImpl;
import com.string.programInterface.IStringProgram;

public class Main {

	public static void main(String args[]) {

		IStringProgram program = new StringProgramImpl();

		// revrse a string
		System.out.println(program.findReverse("Somanath"));

		// check the string is palindrome or not
		String str = "madam";

		System.out.println(program.isPalindrome(str) ? "Given string is palindrome : " + str
				: "Given string is not palindrome : " + str);

		// printCharacterContainsInAString
		System.out.println(program.printCharacterContainsInString("HelloSomanath543@%$698Singh"));

		// sum of the integer in string
		System.out.println(program.sumOfDigitsInString("Somanath531@gmail.com"));

		// duplicates elements in string
		System.out.println(program.printDuplicatesElement("geeksforgeeks"));

		// remove duplicates element in string
		System.out.println(program.printNonDuplicatesElement("geeksforgeeksgeeksforgeeks"));

		// replace duplicate character
		System.out.println(program.replaceDuplicateCharacterUsingMethod("aaaabbcccaaddd"));

		System.out.println(program.replaceDuplicateCharacterUsingLogic("aaaabbcccdddddeeeeeerkhil"));

		// print the no of character present in the string
		System.out.println(program.printNoOfCharacterPresentString("a5b4c6d2e1f1"));

		// count the frequency of each character
		program.frequenceOfCharacter("somanath singh is a java developer");

		// duplicates elements in string using default method
		System.out.println(program.printDuplicatesUsingInternalMethod("geeksforgeeksgeeksforgeeks"));

		// non duplicates elements in string using default method
		System.out.println(program.printNonDuplicatesUsingInternalMethod("geeksforgeeksgeeksforgeeks_somanath"));

		// substring program by own logic implementing comparator
		program.printSubString("abc");

		// substring using internal method
		program.printSubStringUsingInternalMaehod("abcd");

		program.printSubStringInOrganisedMannaer("abcd");

		// print substring in largest substring to smallest substring
		program.printSubStringInOrganisedMannaerInReversed("abcd");

		// check annagram of string
		program.checkAnnaGramOfString("listenl", "siltens");
		
		System.out.println(program.areAnagrams("listenl", "siltens"));

		// check the rotation of each other
		System.out.println(program.checkRotationOfEachOther("bca", "abd") ? "String is rotation of each other"
				: "String is not rotation of each other");

		// check the string is pannagram of not
		System.out.println(program.checkPannaGram("aaaaaaaaaasssssssssszzzzzz") ? "String is PannaGram"
				: "String is not PannaGram");

		// find the longest palindromic substring
		program.longestPalindromicSubString("baabaaba");

		// reversed each word in a string
		program.reversedEachWordInAString("Somanath Singh is a jJava Developer");

		// longest common substring
		program.longestcommonSubString("xyzabcd", "abcdxyz");

		// Find the First Non-Repeating Character
		program.firstNonRepeatingCharacter("swwissgigh");

		// ✅ Count Occurrences of a Character in a String
		// ✅ Remove Duplicates from a String
		// ✅ Longest Common Substring
		// ✅ Longest Palindromic Substring
		// ✅ Find the Most Frequent Word in a Paragraph
		// ✅ Check if One String is a Rotation of Another
		// ✅ Reverse a String
		// ✅ Check if a String is a Palindrome
		// ✅ Check if Two Strings are Anagrams
		// ✅ Longest Common Substring (✅ Frequently Asked)
		// ✅ Run-Length Encoding (RLE)
		// ✅ Implement atoi() (Convert String to Integer)		
		// ✅ Check if one string is a subsequence of another
		//  ✅ Find the First Non-Repeating Character
	 	// ✅ Group Anagrams Together

		// String str2 = "In mathematics and computer science, an algorithm is a finite
		// sequence of well defined instructions typically used to solve a class of
		// specific problems or to perform a computation. Algorithms are used as
		// specifications for performing calculations and data processing.";
		String str2 = "In mathematics and computer science, an algorithm is a finite sequence of well defined instructions, typically used to solve a class of specific problems or to perform a computation. Algorithms are used as specifications for performing calculations and data processing.";
		String res = "";
		int len = str2.length();
		boolean isPrime = true;

		for (int i = 2; i < len / 2; i++) {
			if (len % i == 0) {
				isPrime = false;
				break;
			}
		}

		for (int i = 0; i < len; i++) {

			char ch = str2.charAt(i);

			if (isPrime) {
				res = "Invalid Text";
			} else {
				if (len % (i + 1) == 0) {
					if (ch == ' ') {
						res += str2.charAt(i + 1);
					} else {
						res += ch;
					}
				}
			}

		}

		System.out.println(res);

	}

}
