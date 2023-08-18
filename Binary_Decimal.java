package Loops;

public class Binary_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Binary_Decimal bd= new Binary_Decimal();
         bd.split_digit(1011);
         bd.split_digit(1010);
	}

	private void split_digit(int binary) {
		// TODO Auto-generated method stub
		int p=0;
		int decimal=0;
		while(binary>0)
		{
			int rem=binary%10;
			int result=rem * find_power(2,p);
			p=p+1;
			decimal=decimal+result;
			//System.out.println(result);
			binary=binary/10;
		}
		System.out.println(decimal);
	}
		private int find_power(int base, int power)
		{
			int no=1;
			while(power>0)
			{
				no=no*base;
				power=power-1;
			}
			//System.out.println(no);
			return no;
			}
            
		}
		
	


