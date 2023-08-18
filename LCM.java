package Loops;

public class LCM {
	public static void main(String args[])
			{
			LCM lcm=new LCM();
			lcm.find_lcm(18,29);
			System.out.println(0%10);
			}

	private void find_lcm(int no1, int no2) {
		// TODO Auto-generated method stub
		int big=no1>no2?no1:no2;
		while(true) {
		if(big%no1==0 && big%no2==0)
		{
			System.out.println("LCM "+big);
			break;
		}
		big++;
		}
			
		
	}
	

}
