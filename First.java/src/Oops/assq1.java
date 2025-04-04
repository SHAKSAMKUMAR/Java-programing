package Oops;

public class assq1 {
		//data
		int age;
		String name;
		String city;
		String pincode;
		void setData(int a,String n,String c,String pn) {
		    age=a;
			name=n;
			city=c;
			pincode=pn;
		}

			void getdata() {
				System.out.println(age + " "+name+" "+city+ " "+pincode);
			}
	public static void main(String[] args) {
		Student stu1 = new Student ();
        stu1.setData(17, "Rahul"," jammu" , " 180001 ");	
        stu1.getdata();
        stu1.setData(19, "Abhi"," kashmir" , " 181122 ");
        stu1.getdata();

	}
}
