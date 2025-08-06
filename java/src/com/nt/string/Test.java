package com.nt.string;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		
		String s1="silnnt";
		String s2="listen";
		
		if(s1.length() != s2.length())
		{
			System.out.println("String is Not Anagram");
			return;
		}
		
		HashSet s=new HashSet();
		
		for(int i=0;i<s1.length();i++)
		{
			s.add(s1.charAt(i));
		}
		
		System.out.println(s);
		
		boolean f=false;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s.add(s2.charAt(i)) == false)
			{
				f=true;
			}
			else
			{
				f=false;
			}
		}
		
		System.out.println(f?"Anagram":"Not anagram");
		
		
		

	}

}
