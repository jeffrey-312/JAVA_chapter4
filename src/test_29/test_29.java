package test_29;

public class test_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[]vc=new Vehicle[2];
		
		vc[0]=new Car(1234,45.6);
		vc[0].setSpeed(60);
		
		vc[1]=new Plane(7);
		vc[1].setSpeed(288);
		
		for(int i=0;i<vc.length;i++) {
			vc[i].show();
		}
	}

}
abstract class Vehicle{		//�����O
	protected int speed;
	public void setSpeed(int s) {
		speed=s;
		System.out.println("�N�t�׳]��"+speed);
	}
	abstract void show();
}
class Car extends Vehicle{
	private int num;
	private double gas;
	
	public Car(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�����O"+num+"�A�o�q�O"+gas);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�o�q�O"+gas);
		System.out.println("�t�׬O"+speed);
	}
}
class Plane extends Vehicle{
	private int flight;
	
	public Plane(int f) {
		flight=f;
		System.out.println("�Ͳ��F"+f+"�Z��������");
	}
	public void show() {
		System.out.println("�������Z���O"+flight);
		System.out.println("�t�׬O"+speed);
	}
}