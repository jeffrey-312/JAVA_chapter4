package test_25;

public class test_25 {

	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car();
		
		Car car3;
		car3=car1;
		
		System.out.println("car1 and car2 are same¡G"+car1.equals(car2));
		System.out.println("car1 and car3 are same¡G"+car1.equals(car3));
	}
}
class Car{
	protected int num;
	protected double gas;
	
	public Car() {
		num=0;
		gas=0.0;
		System.out.println("create a car");
	}
}