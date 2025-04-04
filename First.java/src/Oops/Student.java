package Oops;

public class Student {
	//data
	int id;
	String name;
	String course;
	String clg_name;
// operation 
	void setData(int i,String n,String c,String cl) {
		id=i;
		name=n;
		course=c;
		clg_name=cl;
	
}
	void getdata() {
		System.out.println(id + " "+name+" "+course+ " "+clg_name);
	}
		
	public static void main(String[] args) {
			Student stu1 = new Student ();
            stu1.setData(1, "Rahul"," B.tech" , " MIET ");	
            stu1.getdata();
            stu1.setData(2, "Abhi"," B.tech" , " MIET ");
            stu1.getdata();

		}
	}


