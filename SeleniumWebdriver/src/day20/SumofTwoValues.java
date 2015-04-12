package day20;

public class SumofTwoValues {

	public static void sum(int a,int b)
	{
		int temp=a+b;
		System.out.println(temp);
	}
	public static void sum(double a,double b)
	{
		double temp=a+b;
		System.out.println(temp);
	}
	public static void sum(String a,String b)
	{
		String temp=a+b;
		System.out.println(temp);
	}
	public static void main(String[] args) {
		sum(10,20);
		sum(15.67,34.78);
		sum("Hello ","Friends");
   }

}
