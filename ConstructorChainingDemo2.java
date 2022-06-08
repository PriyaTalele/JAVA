class P{
	{
		System.out.println("P:init");
	}
	
	P(){
		this(10);
		System.out.println("P0");
	}
	
	P(int a){
		this(10,20,30);
		System.out.println("P1");
	}
	P(int a, int b, int c){
		System.out.println("P3");
	}
}

class Q extends P{
	{
		System.out.println("Q:init");
	}
	Q(){
		this(10,20);
		System.out.println("q0");
	}
	
	Q(int a, int b){
		System.out.println("q2");
	}
}
class ConstructorChainingDemo2{
	public static void main(String[] args){
		//P p = new P();//p0,p1,p3,pinit,O0
		
		Q q = new Q();//q0,q2,qinit,p0,p1,p3,pinit,O0
	}
}