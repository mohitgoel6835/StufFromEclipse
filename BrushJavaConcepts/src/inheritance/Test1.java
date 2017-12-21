package inheritance;

class A {
	void show() {
		System.out.println("Class A");
	}

	void show1() {
		System.out.println("Class test");
	}
}

class B extends A {
	void show() {
		System.out.println("Class B");
	}

	void show2() {
		System.out.println("Class test2");
	}
}

class C extends B {
	void show() {
		System.out.println("Class C");
	}

	void show3() {
		System.out.println("Class test 3");
		System.out.println("===============");
		super.show1();
	}
}

class Test1 {
	public static void main(String[] args) {
		A a = new A();
		a.show();
		B b = new B();
		b.show();
		C c = new C();
		c.show();

		/*
		 * 
		 * a2 is the reference variable of the class A and it pointing to the
		 * class C object.Here the child class object is refered by the parent
		 * class reference variable,so it is called as upcasting.In upcasting we
		 * can access all the members of the parent class and only that methods
		 * from the child class which are overriden.
		 * 
		 */
		A a2 = new C();
		a2.show();

		a2.show1();

		B b2 = new C();
		b2.show();
		b2.show1();
		b2.show2();

		C c2 = new C();
		c2.show();// class C
		c2.show1();// class test
		c2.show2();// class test2
		c2.show3();// class test3

		A a3 = new B();
		a3.show();
		a3.show1();

	}
}