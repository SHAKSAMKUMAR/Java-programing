package Oops;

public class volume {

	 int l,b,h;
	 volume(int l,int b,int h){
		 this.l=l;
		 this.b=b;
		 this.h=h;
		 System.out.println("Length: " +l);
		 System.out.println("Breadth: " +b);
		 System.out.println("Height: " +h);
	}
	 void getvol() {
		 int volume = l*b*h;
		 System.out.println("volume: " +volume);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 volume vol = new volume(2,4,6);
		 vol.getvol();

	}

}
