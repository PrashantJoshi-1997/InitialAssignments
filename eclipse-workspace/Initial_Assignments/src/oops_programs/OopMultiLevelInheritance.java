package oops_programs;

class TopMost
{
	public void topMostClass()
	{
		System.out.println("Top Most Class");
	}
}
class MiddleOne extends TopMost
{
	public void middleOneMethod()
	{
		System.out.println("Middle One Class");
	}
}
class MiddleTwo extends MiddleOne
{
	public void middleTwoMethod()
	{
		System.out.println("Middle Two Class");
	}
}
class BottomMost extends MiddleTwo
{
	public void bottomClassMethod()
	{
		System.out.println("Last Class");
	}
}
public class OopMultiLevelInheritance {

	public static void main(String args[])
	{
		//Access All super class property using single object
		BottomMost bottomMost=new BottomMost();
		bottomMost.topMostClass();
		bottomMost.middleOneMethod();
		bottomMost.middleTwoMethod();
		bottomMost.bottomClassMethod();
	}
}
