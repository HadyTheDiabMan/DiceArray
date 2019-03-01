/**
 * 
 * @author Hady Diab, HW due 2/29/19, DICE ARRAY, PD 5 ODD DAYS
 *
 */
public class DiceArray 
{

	public static void main(String[] args) 
	{
		diceobject dice1= new diceobject();
		diceobject dice2= new diceobject();
		
		int[] whatwasrolled= new int[11];
		
		for(int i=0;i<1000;i++)
		{
			dice1.roll();
			dice2.roll();
			if(dice1.roll()+dice2.roll()==2)
			{
				whatwasrolled[0]+=1;
			}
			if(dice1.roll()+dice2.roll()==3)
			{
				whatwasrolled[1]+=1;	
			}
			if(dice1.roll()+dice2.roll()==4)
			{
				whatwasrolled[2]+=1;
			}
			if(dice1.roll()+dice2.roll()==5)
			{
				whatwasrolled[3]+=1;
			}
			if(dice1.roll()+dice2.roll()==6)
			{
				whatwasrolled[4]+=1;
			}
			if(dice1.roll()+dice2.roll()==7)
			{
				whatwasrolled[5]+=1;
			}
			if(dice1.roll()+dice2.roll()==8)
			{
				whatwasrolled[6]+=1;
			}
			if(dice1.roll()+dice2.roll()==9)
			{
				whatwasrolled[7]+=1;
			}
			if(dice1.roll()+dice2.roll()==10)
			{
				whatwasrolled[8]+=1;
			}
			if(dice1.roll()+dice2.roll()==11)
			{
				whatwasrolled[9]+=1;
			}
			if(dice1.roll()+dice2.roll()==12)
			{
				whatwasrolled[10]+=1;
			}
		}
		System.out.print("\nA 2 was rolled "+whatwasrolled[0]+ " times!");
		System.out.print("\nA 3 was rolled "+whatwasrolled[1]+ " times!");
		System.out.print("\nA 4 was rolled "+whatwasrolled[2]+ " times!");
		System.out.print("\nA 5 was rolled "+whatwasrolled[3]+ " times!");
		System.out.print("\nA 6 was rolled "+whatwasrolled[4]+ " times!");
		System.out.print("\nA 7 was rolled "+whatwasrolled[5]+ " times!");
		System.out.print("\nA 8 was rolled "+whatwasrolled[6]+ " times!");
		System.out.print("\nA 9 was rolled "+whatwasrolled[7]+ " times!");
		System.out.print("\nA 10 was rolled "+whatwasrolled[8]+ " times!");
		System.out.print("\nA 11 was rolled "+whatwasrolled[9]+ " times!");
		System.out.print("\nA 12 was rolled "+whatwasrolled[10]+ " times!");
		
	}

}
