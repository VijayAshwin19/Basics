package Loops;

public class Binary_Decimaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Decimaltest bd=new Binary_Decimaltest();
		bd.Split_Digit(1010);
		bd.Split_Digit(1011);

	}
	private void Split_Digit(int binary)
	{
		int p=0;
		int decimal=0;
		while(binary>0)
		{
			int rem=binary%10;
			int result=rem*Find_Power(2,p);
			p=p+1;
			decimal=decimal+result;
			binary=binary/10;
		}
		System.out.println(decimal);
	}
	private int Find_Power(int base,int power)
	{
		int result=1;
		while(power>0)
		{
			result=result*base;
			power=power-1;
		}
		return result;
	}

}
