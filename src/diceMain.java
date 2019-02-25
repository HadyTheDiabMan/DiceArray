
public class diceMain 
{

	public static void main(String[] args) 
	{
		//make dice object and store it into dice variable
		//any class can be a data type
		diceobject dice1= new diceobject();
		diceobject dice2= new diceobject();
		for(int i=0; i<10;i++)
		{
			System.out.println(dice1.roll());
		}
		for(int i=0; i<20; i++)
		{
			System.out.println(dice2.roll());
		}
		System.out.println("die1: "+dice1.getNumRolls()+"\tdie2: "+ dice2.getNumRolls());
		
		
		//start from 0.
		
		
		

	}

}
