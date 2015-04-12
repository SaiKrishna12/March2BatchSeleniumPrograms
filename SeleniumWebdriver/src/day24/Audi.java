package day24;

public class Audi extends Car {

	String model;
	public void acclelerate()
	{
		System.out.println("abc");
	}
	public static void main(String[] args) {
		Audi a=new Audi();
		a.model="Audi";
		a.acclelerate();
		a.start();
		a.price=1111;
	}

}
