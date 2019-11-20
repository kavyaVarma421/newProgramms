package com.blz.dataStructures;

import com.bridgelabz.datastructures.base.Stack;

public class CalenderByStack 
{

	public static void calenderStack()
	{
		Stack<String> weekstk = new Stack<>();
		Stack<String> dayStk = new Stack<>();
		Stack<String> temp;
		for(int i = Calender. dayOfWeek.length-1;i >= 0;i--)
		{
		   weekstk.push(Calender.dayOfWeek[i]);
		}
		//System.out.println(Calender.wholeDays.length);
		for(int i = Calender.wholeDays.length-1;i >= 0;i--)
		{
			for(int j = Calender.wholeDays[i].length-1;j >= 0;j--)
			{
				int str = Calender.wholeDays[i][j];
				if(str < 10)
				{
					dayStk.push(((str == 0||str == -1) ? " ":str)+"  ");
					
				}
				else {
					dayStk.push(((str == 0||str == -1) ? " ":str)+" ");
				}
				
				
			}
		dayStk.push("\n");
		}
		
		while(weekstk.size() != 0)
		{
			System.out.print(weekstk.pop()+" ");
		}
		while(dayStk.size() != 0)
		{
			System.out.print(dayStk.pop()+" ");
		}
	}
	public static void main(String[] args) 
	{
		Calender c = new Calender();
		Calender.calender(11, 2019);
		calenderStack();
	}
}
