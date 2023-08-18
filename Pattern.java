package Loops;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern=new Pattern();
		pattern.pattern2();
		pattern.pattern3();
		pattern.pattern4();
		pattern.pattern5();
		pattern.pattern6();
		pattern.pattern7();
for(int row=1;row<=7;row++)
{
	for(int col=1;col<=7;col++)
	{
		if(row==1)
		{
		System.out.print("* ");
		}
		else
		{
			if(col!=4)
			{
				System.out.print("  ");
			}
			else
			{
				System.out.print("* ");
			}
		}
	}
	System.out.println();
}
	}

	private void pattern7() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1||row==col)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		
	}

	private void pattern6() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1 || col==1 ||row==7||col==7)
				{
					if(row==1&&col==7||row==7&&col==7)
					{
					System.out.print("  ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int row=1;row<=7;row++)
			{
				System.out.print("* ");
				System.out.println();
			}
		
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1 || col==1 ||row==7||col==7)
				{
					if(row==1&&col==7||row==7&&col==7||row==1&&col==1||row==7&&col==1)
					{
					System.out.print("  ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1 || col==1 ||row==7||col==7)
				{
					if(row==1&&col==7||row==7&&col==7)
					{
					System.out.print("  ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1 || col==1 ||row==7||col==7)
				{
					System.out.print("* ");
					
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
		
	

	private void pattern2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1 || col==1 ||row==7)
				{
					if(row==1&&col==1 || row==7 && col==1)
					{
						System.out.print(" ");
					}
					else
					{
					System.out.print("* ");
					}
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
