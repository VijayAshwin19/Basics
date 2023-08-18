package Loops;

public class PowerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PowerDemo pd=new PowerDemo();
    int no=1;
    while(no<=5)
    {
    pd.find_power(no,no+1);
    no=no+1;
    }
	}

	private void find_power(int base, int power) {
		// TODO Auto-generated method stub
		int no=1;
		while(power>0)
		{
			no=no*base;
			power=power-1;
		}
		System.out.println(no);
		}
		
	}


