package Loops;

public class Prime2 {
	public static void main(String args[])
			{
		Prime2 pp=new Prime2();
		int no=2;
		while(no<=20)
		{
			pp.find_prime(no);
			no=no+1;
		}
		
			}

	private void find_prime(int no) {
		// TODO Auto-generated method stub
		int div=2;
		int count=0;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				System.out.println(no+"Not prime");
				count=count+1;
				break;
			}
			div=div+1;
		}
		if(count==0)
		{
			System.out.println(no+"Prime");
		}
		
	}

}
