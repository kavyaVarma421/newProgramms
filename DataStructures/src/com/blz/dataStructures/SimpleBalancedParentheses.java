package com.blz.dataStructures;

import com.bridgelabz.datastructures.base.Stack;

public class SimpleBalancedParentheses 
{
public static void main(String[] args) 
{
	Stack st = new Stack();
	String str =  "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
	boolean balancedChar = st.balancedParentheses(str);
	if(balancedChar)
	{
		System.out.println(str+"\nthe given Arithmetic Expression is Balanced");
	}
	else {
		System.out.println(str+"\nthe given Arithmetic Expression is not Balanced");
	}
}
}
