package test_04;


public class test_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar rccar1=new RacingCar();
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
	}

}
class Car{
	private int num;
	private double gas;
	
	public Car() {
		System.out.println("create car");
		num=0;
		gas=0.0;
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�o�q��"+gas);
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�o�q�O"+gas);
	}
}

class RacingCar extends Car{
	private int course;
	
	public RacingCar() {
		course=0;
		System.out.println("create racingcar");
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
}


