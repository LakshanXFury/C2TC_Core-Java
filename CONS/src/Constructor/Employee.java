package Constructor;

public class Employee {
	
	int id;
	String name;
	float salary;
	Employee(int id,String name,float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println(name+" "+id+" "+salary);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(100,"Lakshan",60000f);
		Employee emp1 = new Employee(101,"Anish",70000f);
		Employee emp2 = new Employee(102,"Beast",49000f);
		
		emp.display();
		emp1.display();
		emp2.display();
		
	}

}
