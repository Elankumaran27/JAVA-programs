import java.util.Scanner;
import java.lang.Math;
import java.util.Scanner;
import java.lang.Math;
public class elan1c
{public static void main(String ar[])
{
String lo;
Scanner k=new Scanner(System.in);
operations key = new operations();

do
{System.out.println("1.To find prime or not:\n2.To generate OTP:\n3.Convert number into word:\n4.Fibonacci series:");
int n=k.nextInt();
switch(n)
{
case 1:
key.primenum();
break;
case 2:
key.otp();
	
	break;

case 3:
key.word();
break;

case 4:
key.fib();
break;
}
System.out.println("Need to continue:?");
lo=k.next();
}
while(lo.equals("Y"));
}}

class operations{
	Scanner  k=new Scanner(System.in);
	void primenum()
	{
		System.out.println("Enter the prime number:");
	int num=k.nextInt();
	int flag=0;
	for(int i=2;i<num;i++)
	{
	if(num%i==0)
	{System.out.println("Not a prime number");
	flag=1;
	break;
	}
	}
	if(flag==0)
	{System.out.println("Prime number:");
	}
	}
	
	void otp()
	{
		System.out.println("Your OTP is:");
	double rand= Math.random();
	int ra=(int)(rand*10000);
	System.out.println(ra);
	}

	void word()
	{int s=0;
		System.out.println("Enter the number:");
		int num= k.nextInt();
		int num1=num;
		int num2=num;
		while (num>0)
		{
			s=s+1;
			num=num/10;
		}
		s=s-1;
		for (int i=s+1;i>0;i--)
		{num1=num2;
			for(int j=0;j<i-1;j++)
			{
				num1=num1/10;
				
			}
			num1=num1%10;
		switch(num1)
		{
			case 1:
			System.out.print("One ");
			break;
			case 2:
			System.out.print("Two ");
			break;
			case 3:
			System.out.print("Three ");
			break;
			case 4:
			System.out.print("Four ");break;
			case 5:
			System.out.print("Five ");break;
			case 6:
			System.out.print("Six ");break;
			case 7:
			System.out.print("Seven ");break;
			case 8:
			System.out.print("Eight ");break;
			case 9:
			System.out.print("Nine ");break;
			case 0:
			System.out.print("Zero ");
			break;
		}

		}


	}


	void fib()
	{
		int a=1;
		int b=1;
		System.out.println("Enter the no of terms:");
		int n=k.nextInt();
		int i=0;
		while(i<n)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;

		}
		

	}
}