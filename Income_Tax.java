package Loops;

public class Income_Tax {

	public static void main(String[] args) {
		Income_Tax Tax=new Income_Tax();
		double tax_rev=Tax.Revised_New_Tax(1600000);
		double tax_pre=Tax.Previous_Tax(1600000);
		double tax_old=Tax.Old_Tax(1600000);
		System.out.println("Revised New Tax is "+tax_rev);
		System.out.println("Previous Tax is "+tax_pre);
		System.out.println("Old Tax is "+tax_old);
		if(tax_rev<tax_pre)
		{
			if(tax_rev<tax_old)
			{
				System.out.println("Revised Tax is better "+tax_rev);
			}
			else
			{
				System.out.println("Old Tax is better "+tax_old);
			}
		}
		else
		{
			if(tax_pre<tax_old)
			{
				System.out.println("Previous Tax is better "+tax_pre);
			}
			else
			{
				System.out.println("Best Old Tax "+tax_old);
			}
		}
	}

	private double Revised_New_Tax(int salary) {
		double tax=0;
		
		if(salary<=300000)
		{
			tax=0;
		}
		else if(salary<=600000)
		{
			tax=0.05*(salary-300000);
		}
		else if(salary<=900000)
		{
			tax=(0.1*(salary-600000))+(0.05*300000);
		}
		else if(salary<=1200000)
		{
			tax=(0.15*(salary-900000))+(0.1*300000)+(0.05*300000);
		}
		else if(salary<=1500000)
		{
			tax=(0.2*(salary-1200000))+(0.15*300000)+(0.1*300000)+(0.05*300000);
		}
		else
		{
			tax=(0.3*(salary-1500000))+(0.2*300000)+(0.15*300000)+(0.1*300000)+(0.05*300000);
		}
		return tax;
		
	}
	private double Previous_Tax(int salary)
	{
		double tax=0;
		if(salary<=250000)
		{
			tax=0;
		}
		else if(salary<=500000)
		{
			tax=(0.05*(salary-250000));
		}
		else if(salary<=750000)
		{
			tax=(0.1*(salary-500000))+(0.05*250000);
		}
		else if(salary<=100000)
		{
			tax=(0.15*(salary-750000))+(0.1*250000)+(0.05*250000);
		}
		else if(salary<=1250000)
		{
			tax=(0.2*(salary-1000000))+(0.15*250000)+(0.1*250000)+(0.05*250000);
		}
		else if(salary<=1500000)
		{
			tax=(0.25*(salary-1250000))+(0.2*250000)+(0.15*250000)+(0.1*250000)+(0.05*250000);
		}
		else
		{
			tax=(0.3*(salary-1500000))+(0.25*250000)+(0.2*250000)+(0.15*250000)+(0.1*250000)+(0.05*250000);
		}
		return tax;
	}
	private double Old_Tax(int salary)
	{
		double tax=0;
		if(salary<=250000)
		{
			tax=0;
		}
		else if(salary<=500000)
		{
			tax=0.05*(salary-250000);
		}
		else if(salary<=1000000)
		{
			tax=(0.2*(salary-500000))+(0.05*250000);
		}
		else
		{
			tax=(0.3*(salary-1000000))+(0.2*500000)+(0.05*250000);
		}
		return tax;
	}
	}
		