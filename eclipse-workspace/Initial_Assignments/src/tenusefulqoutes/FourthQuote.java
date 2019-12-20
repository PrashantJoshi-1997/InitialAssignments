package tenusefulqoutes;

/*Try to prefer interface instead of Abstract class.
when you clear about methods that want use. */

interface Coder
{
	public void knowOOPs();
	public void goodLogic();
	public void goodCommunication();
}
public class FourthQuote implements Coder{

	@Override
	public void knowOOPs() {
		// TODO Auto-generated method stub
		System.out.println("Having Knowledge of OOPs");
	}

	@Override
	public void goodLogic() {
		// TODO Auto-generated method stub
		System.out.println("Having good Logic");
	}

	@Override
	public void goodCommunication() {
		// TODO Auto-generated method stub
		System.out.println("Having good Communication skill");
	}
	
}
