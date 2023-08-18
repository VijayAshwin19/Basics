package Loops;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD gcd=new GCD();
		gcd.find_gcd(10,30);

	}

	private void find_gcd(int no1, int no2) {
		// TODO Auto-generated method stub
		int div=2,gcd=0;
		int small=no1<no2?no1:no2;
		while(div<=small)
		{
			if(no1%div==0 && no2%div==0)
			{
				gcd=div;
			}
			div++;
		}
		if(gcd!=0)
			System.out.println("GCD is"+gcd);
		else
		System.out.println("No Common Divisors found");
	}

}
