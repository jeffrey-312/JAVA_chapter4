package test_09;

public class test_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar rccar1=new RacingCar();
		
		rccar1.newShow();
	}

}
class Car{
	protected int num;
	protected double gas;
	
	public Car() {
		num=0;
		gas=0.0;
		System.out.println("create car");
	}
	public Car(int n,double g) {
		num=n;
		gas=g;
		System.out.println("create������"+num+"�o�q��"+gas);
	}
	
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("set������"+num+"�o�q��"+gas);
	}
	
	public void show() {
		System.out.println("������"+num);
		System.out.println("�o�q��"+gas);
	}
	
}
class RacingCar extends Car{
	private int course;
	public RacingCar() {
		course=0;
		System.out.println("create a racingcar");
	}

	public void setCourse(int c) {
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	
	public void newShow() {
		System.out.println("�����O"+num);
		System.out.println("�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}





