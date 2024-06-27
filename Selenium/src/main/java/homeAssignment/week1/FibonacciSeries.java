package homeAssignment.week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 0;
int b = 1;
int n= 8;
System.out.println("The Fibonacci series is : "+a);
System.out.println("The Fibonacci series is : "+b);
for (int a1 = 0; a1<n-2; ++a1) {
	int c = a+b;
	a=b;
	b=c;	
	System.out.println("The Fibonacci series is : "+c);
}
	}

}
