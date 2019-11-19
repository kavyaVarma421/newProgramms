package com.blz.dataStructures;

public class CalenderByQueue 
{
public static void calenderQue()
{
	Queue<String> weekQ = new Queue<>();
	Queue<String> daysQue = new Queue<>();
	for(int i = 0 ;i < Calender. dayOfWeek.length;i++)
	{
	   weekQ.enque(Calender.dayOfWeek[i]);
	}
	weekQ.enque("\n");
	for(int i = 0;i < Calender.wholeDays.length;i++)
	{
		for(int j = 0 ;j < Calender.wholeDays[i].length;j++)
		{
			int str = Calender.wholeDays[i][j];
			if(str < 10)
			{
				daysQue.enque(((str == 0||str == -1) ? " ":str)+"  ");
				
			}
			else {
				daysQue.enque(((str == 0||str == -1) ? "  ":str)+" ");
			}
			
			
		}
		daysQue.enque("\n");
	}
	while( weekQ.size() != 0)
	{
		System.out.print( weekQ.deque()+" ");
	}
	while(daysQue.size() != 0)
	{
		System.out.print(daysQue.deque()+" ");
	}
}
public static void main(String[] args) 
{
	Calender c = new Calender();
	Calender.calender(11, 2019);
	calenderQue();
}
}
