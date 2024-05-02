package Day8;

public class Student {

	int sid;
	String sname;
	char grade;
	
	void display()
	{
		System.out.println(sid+ " "+sname+ " "+grade);
	}
	void setDate(int id, String name, char g)
	{
		sid=id;
		sname=name;
		grade= g;
	}
	 Student(int id, String name, char g)
	{
		sid=id;
		sname=name;
		grade= g;
	}
	
}
