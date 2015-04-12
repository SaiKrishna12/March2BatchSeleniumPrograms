package OrangeHRM;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExecuteActions {
	
	public void eActions(Method[] methods,String action,String cname) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException
	{
		for(int i=0;i<methods.length;i++)
		{
			if(methods[i].getName().equals(action))
			{
				methods[i].invoke(Class.forName(cname).newInstance());
			}
		}
	}

}
