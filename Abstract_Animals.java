
public abstract class Abstract_Animals 
{
	String Color , breed , Name;
	
	abstract public void Eat();      // Abstract Method with no definition
	
	public void Speak()              // Non-Abstract method with proper definition
	{
		System.out.println("Animal's sound !");
	}

}
