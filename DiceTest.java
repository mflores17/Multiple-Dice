public class DiceTest
{
	int randRoll, m_rolls, total=0;
	String evenOrOdd = null;
	
	public DiceTest(int n) //we receive int n from the Dice.java file. It is numRolls, a user input.
	{
		for (int i=0;i<n;i++)
		{
		randRoll = 1 + (int) ( Math.random() * 6);
		total = total + randRoll; //will add up all the rolls
		}
		
		if((total%2)==0) //if the results of the dice rolls is even we can divide by two and determine the remainder with the operator %. if that result is equal to zero the result of the rolls is even.
		{
			evenOrOdd="even";
		}
		else evenOrOdd="odd";
	}
	public String EvenOrOdd()
	{
		return evenOrOdd; //returns the result of the evenOrOdd variable
	}
	public int total()
	{
		return total; //returns the total number added up from all the rolls
	}
}

// Good job, but the naming of the classes are a bit backward, isn't it?
