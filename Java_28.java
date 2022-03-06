package selenium.com;

public class Java_28 {
	public static void main(String[] args) {
		int num=28;
		int count=0;
		 for(int i =1;i<=num;i++)
		 {
			for(int j =1;j<=num;j++) 
			{
				int rec=i*j;
				if (rec==num)
				{
					count++;                            //1*28=28,28*1=28
					                                    //2*14=28,14*2=28
				                                        //4*7=28,	7*4=28
				}
			}
			 
		 }
		 System.out.println(count);
	}

}
