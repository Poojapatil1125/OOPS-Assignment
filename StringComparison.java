package com.Question7;
import java.util.Scanner;
//With the help of method overriding perform the string 
//comparison. User will input two string and your task is
//to compare both the string one alphabets at a time.
public class StringComparison {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first string");
	String s1=sc.next();
	System.out.println("enter the second string");
	String s2=sc.next();
	for(int i=0;i<s1.length();i++)
	{
		for(int j=i+1;j<s2.length();j++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				System.out.println("equal");
			}
			else
			{
				System.out.println("not equal");
			}
		}
	}
}
}
