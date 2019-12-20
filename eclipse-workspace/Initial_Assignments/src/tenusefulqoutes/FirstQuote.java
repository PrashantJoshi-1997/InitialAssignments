package tenusefulqoutes;

import java.util.ArrayList;
import java.util.List;

//Avoid creating unnecessary object and always prefer to do lazy initialization.
public class FirstQuote {
	private List<String> initialize;
	
	public List<String> getInitialize()
	{
		if(null==initialize)
		{
			initialize=new ArrayList<String>();
		}
		return initialize;
	}
	
	
}
