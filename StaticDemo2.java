class SomeRandomClass{
	
	static int x = 10;
	static int y = 20;
	public static void main(String... args){
	static void m1(){
		System.out.println("SomeRandomClass ka m1");
	}
	static void m2(){
		System.out.println("SomeRandomClass ka m2");
	}
}

class A{
	static int a = 50;
	static void m1(){
		System.out.println("A ka m1");
	}
	static void m3(){
		System.out.println("A ka m3");
	}
}

class StaticDemo2{
	
	static int a = 10;
	static int b = 20;
	
	static void m1(){
		System.out.println("StaticDemo2 ka m1");
	}
	
	public static void main(String[] args){
		int c = 30;
		int d = 40;
		int a = 30;
		
		System.out.println(a);// search in main method
		System.out.println(StaticDemo2.a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//System.out.println(x);
		//System.out.println(y);
		System.out.println(SomeRandomClass.x);
		System.out.println(SomeRandomClass.y);
		//System.out.println(p);
		System.out.println(A.a);
		//m1();
		StaticDemo2.m1();
		A.m1();
		A.m3();
		SomeRandomClass.m1();
		SomeRandomClass.m2();
	}
}