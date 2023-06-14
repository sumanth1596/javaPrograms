
public class fibonacciSeries{
	public static void main(String[]args) {
		int num1=0,num2=1,sum=0;
		
		System.out.print("The fibonacci series of the first 10 numbers is\n"+num1+" "+num2);
		
			for (int i=1;i<9;i++)
			{
				sum=num1+num2;
				System.out.print(" "+sum);
				num1=num2;
				num2=sum;

			
		}
	}
}

