class A{
	int a = 10;
	int b = 20;
	void print(){
		System.out.println(this.a+ " "+this.b);
	}
}
class Employee{

	int employeeId;
	String employeeName;
	double salary;
	
	void print(){
		System.out.println(this.employeeId+"  "+this.employeeName+" "+this.salary);
	}
}

class ThisDemo{
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.employeeId = 1;
		e1.employeeName = "A";
		e1.salary = 10000.0;
		e1.print();
		
		Employee e2 = new Employee();
		e2.employeeId = 2;
		e2.employeeName = "B";
		e2.salary = 20000.0;
		e2.print();
		
		Employee e3 = new Employee();
		/*e3.employeeId = 3;
		e3.employeeName = "C";
		e3.salary = 30000.0;*/
		e3.print();
		
		e1 = e2;
		e1.print();
		e2.print();
		
		A a1 = new A();
		a1.a = 100;
		a1.b = 200;
		a1.print();
		A a2 = new A();
		a2.a = 30;
		a2.b = 40;
		a2.print();
	}
}