class Base1 {
	int x;
	Base1 () {
		System.out.println("This is default Constructor");
	}
	
	Base1(int a){
		x=a;
		System.out.println("This is Overloaded Constructor " + x);
	}
	void setX(int x) {
		this.x=x;
	}
	
	void getX() {
		System.out.println("This Is Base Constructor");
	}
}

class Derived1 extends Base1 {
	int y;
	Derived1() {
		System.out.println("This is derived Class Constructor");
	}
}
public class Constructor_in_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived1 d = new Derived1 ();
	}

}
