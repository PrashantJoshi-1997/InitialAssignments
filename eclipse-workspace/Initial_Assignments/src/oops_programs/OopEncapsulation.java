package oops_programs;

class EncapsulationExample
{
	private int a;
	private String name;
	
	public EncapsulationExample(int a,String name) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.name=name;
	}
	
	public int getA()
	{
		return a+a;
	}
	public String getName()
	{
		return name;
	}
}
public class OopEncapsulation {

	public static void main(String args[])
	{
		EncapsulationExample encapsulationExample=new EncapsulationExample(50, "Java");
				
		System.out.println("Number is="+encapsulationExample.getA());
		System.out.println("Name is="+encapsulationExample.getName());
	}
}
