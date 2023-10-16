package stackADT;
//demonstrating the use of the GenericStack in a modular way
public class test {
	public static void main(String[] args)
	{
		GenericStack<Integer> s = pushInt();
		doStuff(s, "ints");
		GenericStack<String> a = pushString();
		doStuff(a, "Strings");
		System.exit(0);
	}
	//pushes ints into a GenericStack and then returns the GenericStack
	public static GenericStack pushInt()
	{
		GenericStack g = new GenericStack();
		for(int i=0;i<5;i++)
		{
			g.push(i);
		}
		return g;
	}
	//pushes Strings into a GenericStack and then returns the GenericStack
	public static GenericStack pushString()
	{
		GenericStack g = new GenericStack();
		String[] s = {"how", "now", "brown", "cow"};
		for(int i=0;i<4;i++)
		{
			g.push(s[i]);
		}
		return g;
	}
	//Shows implementation of pop(), peek(), and size() elements
	public static void doStuff(GenericStack g, String type)
	{
		System.out.println("Now I will demonstrate a stack of " + type + ":");
		while(!g.isEmpty())
		{
			System.out.println("Now we'll just peek at the top without removing: " + g.peek());
			System.out.println("Stack size: " + g.size());
			System.out.println("Now we'll actually pop it off. Goodbye, " + g.pop());
			System.out.println("Now the size is " + g.size());
			System.out.println(" ");
		}
		System.out.println("Goodbye, Generic Stack");
		System.out.println(" ");
		System.out.println(" ");
	}
}
