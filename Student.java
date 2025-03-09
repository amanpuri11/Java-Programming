package oops;

public class Student {
	int id;
	String name;
	String course;
	String clg_name;
	
	void setData(int i, String n, String c, String clg) {
		id =i;
		name = n;
		course = c;
		clg_name = clg;
	}
	void getData() {
		System.out.println(id +" "+name+" "+course+" "+clg_name);
	}
	
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setData(1, "rahul", "B.Tech", "MIET");
		stu1.getData();
		
		Student stu2 = new Student();
		stu2.setData(2, "aman", "BCA", "IIM");
		stu2.getData();
	}
}