package selenium.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class java {
public static  void main(String[] args) {
	Vector s=new Vector();
	for(int i= 1;i<=10;i++)
	{
		s.add(i);
	}
	System.out.println(s);
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
		Object obj=itr.next();
		//System.out.println(obj);
		Integer n=(Integer)obj;
		if(n%2==0)
		{
			System.out.println(n);
			itr.remove();
		}
	}
	System.out.println(s);
	
	
}
}
