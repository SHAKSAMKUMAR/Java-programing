package Oops;

import java.util.Scanner;

public class Area {
	int radius;
	void setDim(int r){
		radius=r;
		}
	void getDim() {
		System.out.println("Area of the circle: "+ 3.14*radius*radius);
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius  of the circle:");
		int x = sc.nextInt();
		Area a = new Area();
		a.setDim(x);
		a.getDim();
		sc.close();
		// TODO Auto-generated method stub

	}
	

}
