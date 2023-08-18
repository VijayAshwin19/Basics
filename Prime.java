package Loops;

public class Prime {
	int prime_count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime pp=new Prime();
		pp.Find_Prime(2);

	}
	private void Find_Prime(int no)
	{
		int count=0;
		int div=2;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				//System.out.println(no+"Not prime");
				count=count+1;
				break;
			}
			div=div+1;
		}
		if(count==0)
		{
			System.out.println(no+"Prime");
			prime_count=prime_count+1;
		}
		if(prime_count<5)
		{
			//System.out.println(prime_count);
			no=no+1;
			Find_Prime(no);//method calling itself: Recursion
		}
		
		
	}
}
