package test_38;


public class test_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iVehicle[] ivc;
		ivc=new iVehicle[2];
		
		ivc[0]=new Car(1234,56.6);
		ivc[1]=new Plane(878);
		
		for(int i=0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}

}
interface iVehicle{		//�����O
	int weight=1000;
	abstract void show();
}
class Car implements iVehicle{
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
	}
}
class Plane implements iVehicle{
	private int flight;
	
	public Plane(int f) {
		flight=f;
		System.out.println("�Ͳ��F"+f+"�Z��������");
	}
	public void show() {
		System.out.println("�������Z���O"+flight);
	}
}