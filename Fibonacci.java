package Loops;

public class Fibonacci {
	int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibo=new Fibonacci();
		fibo.print_fibo(0,1);
	}

	private void print_fibo(int first, int second) {
		// TODO Auto-generated method stub
		while(count<10)
		{
		System.out.println(first);
		//int third=first+second;
		first=first+second;
		//second=third;
		second=first-second;
		//second=second+first;
		//first=second-first;
		count=count+1;
		}
	}

}
