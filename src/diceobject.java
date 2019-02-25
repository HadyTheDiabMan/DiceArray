import java.util.Random;

/**
 * 
 * @author hdiab22
 *
 */
public class diceobject 
{
	//create fields
	//fields always get private access, our methods usually have public access
	//fields == each object own copy
	
	private int numRolls=0;
	//methods get public access, dont type static because we need to get method through object
	
	public int roll()
	{
		Random rand= new Random();
		int num= rand.nextInt(6)+1; //inclusive of 0, exclusive of 6
		numRolls++;
		return num;
		
	}
	
	public int getNumRolls()
	{
		return numRolls;
	}
	
	public void reset()  //doesnt return anything
	{
		numRolls=0;
	}
	//a complete dice class
}
