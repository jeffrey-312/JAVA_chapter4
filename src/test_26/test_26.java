package test_26;

public class test_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars;
		cars=new Car[2];
		
		cars[0]=new Car();
		cars[1]=new RacingCar();
		
		for(int i=0;i<cars.length;i++) {
			Class cl = cars[i].getClass();
			System.out.println("第"+(i+1)+"個物件的類別是"+cl);
		}
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
class RacingCar extends Car{
	public RacingCar() {
		System.out.println("create a racingcar");
	}
}