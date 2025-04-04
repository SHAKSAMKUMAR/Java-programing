package Oops;

public class p5 {
int id;
String name;
int sem;
String branch;
p5(int n,int s){
	id =n;
	name="Aman";
	sem=s;
	branch="cse";
	
}
void logic() {
	System.out.print(id+" "+name+" "+sem+" "+branch);
	
}
	public static void main(String[] args) {
		p5 c1=new p5(30,6);
		c1.logic();
		// TODO Auto-generated method stub

	}

}
