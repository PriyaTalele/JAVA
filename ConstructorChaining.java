class A{
	static{
		System.out.println("A:static");
	}
	{
		System.out.println("A:init");
	}
	A(){
		System.out.println("A:init");
	}
}
class B{
	static{
		System.out.println("B:static");
	}
	{
		System.out.println("B:init");
	}
	B(){
		System.out.println("B:init");
	}
}
class ConstructorChaining{
	public static void main (String[]args){
		