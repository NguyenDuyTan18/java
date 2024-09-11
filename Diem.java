package buoi2;
import java.util.Scanner;

public class Diem {
	private int x, y;
	
	public  Diem() {  
		x = y = 0;
		System.out.println("ham 1");
		// ham xd 1
	}
	
	public Diem(int x1) {
		x = y = x1;
		System.out.println("ham 2");
		// ham xd 2
	}
	public Diem(int x1, int y1) {
		this.x = x1;
		this.y = y1;
		System.out.println("ham 3");
		// ham xd 3
	}
	
	public void gan(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap x: ");
		x = sc.nextInt();
		System.out.println("Nhap y: ");
		y = sc.nextInt();
	}
	
	public void in() {
		System.out.println("(" + x + "," + y + ")");
	}

	public int layX() {
		return x;
	}
	
	public int layY() {
		return y;
	}
	
	public void tinhtien(int dx, int dy) {
		x +=  dx;
		y += dy;
	}
	
	public float kcach() {
		return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public float kcach(Diem B) {
		return (float)Math.sqrt(Math.pow(x - B.x, 2) + Math.pow(y - B.y, 2));
	}
}
