  
  class Student {
      static int studentCount;
	  
      int id;
	  String name;
	  String gender;
	  int age;
	  long phone;	  
	  double gpa;	  
	  char degree;
	  
	  boolean international;
	  double tuitionFees = 12000.0;
	  double internationalFees = 5000.0;
	  
	  Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
					char newDegree, boolean isInternational) {

                System.out.println("Id value is "+id);
	      id = newId;
		  name = newName;
		  gender = newGender;
		  age = newAge;
		  phone = newPhone;
		  gpa = newGpa;
		  degree = newDegree;
		  international = isInternational;
		  
		  studentCount = studentCount + 1;
		  int nextId = this.id + 1;		  
		  
		  if (international) {
		      tuitionFees = tuitionFees + internationalFees;
			  //return;
		  }		
		  
	      System.out.println("\nid: " + id);
		  System.out.println("nextId: " + nextId);
		  System.out.println("this.name: " + this.name);
		  System.out.println("gender: " + gender);
		  System.out.println("age: " + age);
		  System.out.println("phone: " + phone);
		  System.out.println("gpa: " + gpa);
		  System.out.println("degree: " + degree);
		  System.out.println("tuitionFees: " + tuitionFees);
		  System.out.println("studentCount: " + studentCount);
                   System.out.println("international: " + international);
	  }

Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
					char newDegree) {
	    /* new Student(newId,newName,newGender,newAge, newPhone, newGpa,newDegree, false);
System.out.println("***in constructor after calling parent constructor");*/

System.out.println("Id value in constructor with no flag "+id);
	  }
	  
	  Student() {
System.out.println("No args cunstructor");
}
	

	  public static void main(String[] args) {
	      Student student1 = new Student(1000, "John", "male", 18, 223_456_7890L, 3.8, 'B');
		  
		  Student student2 = new Student(1001, "Raj", "male", 21, 223_456_9999L, 3.4, 'M', true);
		  
		  Student student3 = new Student(1002, "Anita", "female", 20, 223_456_8888L, 4.0, 'M',true);
                  // Student student3 = new Student();
		  
		  System.out.println("Student.studentCount: " + Student.studentCount);
	  }
  }