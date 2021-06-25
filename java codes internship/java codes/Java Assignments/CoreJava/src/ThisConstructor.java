
class StudentOne {
	int rollno;
	String name, course;
	float fee;

	StudentOne(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	StudentOne(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

class TestThis7 {
	public static void main(String args[]) {
		StudentOne s1 = new StudentOne(111, "ankit", "java");
		StudentOne s2 = new StudentOne(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
}