
class A { int over = 1; }
class B extends A { int over = 2; }

public class UseOfSuperReferenceExample extends B {
	int over = 3;
	public static void main(String[] args) {
		new UseOfSuperReferenceExample().go();
	}
	void go() {
		B b = new B();
		A a = new A();
		System.out.println(super.over + " " + a.over + " " + b.over);
	}
}
