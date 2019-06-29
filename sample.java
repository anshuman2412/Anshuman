package anuja;

class sample1 implements Runnable
{

	public void disp()
	{
		
		for(int i=0;i<30;i++)
		{
			System.out.println("hello");
		}
		
	}
	public void run ()
{
	disp();
}	
		
	
}





public class sample 
{
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
         sample1 s1=new sample1();
         Thread t1=new Thread(s1);
         Thread t2=new Thread(s1);  
         t1.start();
         t2.start();
	}
}
         

}
