package Basic_Programs;

//New features in JDK 8 for Interface
interface CheckData
{
	final int a=100;
	default void dataPrint()
	{
			System.out.println("Inside Interface \n"+a);
	}
}
public class NewInterFaceFeature implements CheckData
{
	public static void main(String args[])
	{
		NewInterFaceFeature newInterFaceFeature=new NewInterFaceFeature();
		newInterFaceFeature.dataPrint();
	}
}