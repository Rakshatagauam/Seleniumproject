package Day8;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Apprch 1: using reference method
     // Student stud= new Student();
    /*  stud.sid= 1001;
      stud.sname= "Robert";
      stud.grade= 'A';
      // stud.display(); */
      
     //  Approch 2nd: using method()
     // stud.setDate(1001, "Robert", 'A');
     // stud.display();
      
      //using contrctor
      Student stud= new Student(1001, "John",'A');
    	  stud.display();
      
	}

}
