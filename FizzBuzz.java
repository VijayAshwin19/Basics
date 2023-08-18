package Loops;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FizzBuzz fb=new FizzBuzz();
			//fb.display(1);
			fb.display1(1);

	}

	private void display1(int num) {
		// TODO Auto-generated method stub
		while(num<=50)
		{
			if(num%15==0)//(num%3==0&&num%5==0)
			{
			System.out.println("FizzBuzz");
			}
			else if(num%5==0)
			{
			System.out.println("Buzz");
			}
			else if(num%3==0)
			{
			System.out.println("Fizz");
			}
			else{
			System.out.println(num);
			}
			num=num+1;
			//when you are filtering numbers within any loop follow higher order numbers
			//to lower order number in conditions.
		}
		
	

	/*private void display(int num) {
		// TODO Auto-generated method stub
		while(num<=50)
		{
		if(num%3!=0&&num%5!=0)
		{
		System.out.println(num);
		}
		if(num%3==0&&num%5==0)
		{
			System.out.println("FizzBuzz");
		}
		else
		{
		if(num%3==0)
		{
			System.out.println("Fizz");
		}
		if(num%5==0)
		{
			System.out.println("Buzz");
		}
		
		}
		num=num+1;
		}	*/
	}
}

