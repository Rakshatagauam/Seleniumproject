package Day8;

public class Employee {
//variable
	int eid;
	String ename;
	String jobname;
	int esal;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(jobname);
		System.out.println(esal);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp1 = new Employee();
    emp1.eid= 101;
    emp1.ename= "John";
    emp1.jobname= "customer service";
    emp1.esal= 8000;
    emp1.display();
    
    Employee emp2= new Employee();
    emp2.eid=  102;
    emp2.ename= "Kim";
    emp2.jobname= "Manager";
    emp2.esal= 10000;
    emp2.display();
    
    		
	}

}
