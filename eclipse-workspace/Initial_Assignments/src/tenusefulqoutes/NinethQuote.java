package tenusefulqoutes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Always return empty collection or array instead of null.
public class NinethQuote {

	public List<String> getListData(List<String> data)
	{
		List<String> list=new ArrayList<String>();
		for(String element:data)
		{
			if(element=="Having")
			{
				list.add(element);
			}
		}
		return list.isEmpty()? Collections.<String>emptyList():list;
	}
}
