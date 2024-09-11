package buoi2;
import java.util.Scanner;

public class Date {
	private int d, m ,y;
	public Date() {
		d = 1;
		m = 1 ;
		y = 2024;
	}
	public Date(int d1, int m1, int y1) {
		this.d = d1;
		this.m = m1;
		this.y = y1;
	}
	
	public void in() {
		System.out.println(d + "/" + m + "/" + y);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhap ngay: ");
			d = sc.nextInt();
			System.out.println("Nhap thang: ");
			m = sc.nextInt();
			System.out.println("Nhap nam: ");
			y = sc.nextInt();
		} while(!hople());
		
	}
	
	public boolean hople() {
		boolean h = false;
		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(y%4==0 && y%100!=0) max[2]= 29;
		if(d > 0 && m > 0 && y > 0 && m < 13 && d < max[m]) h = true;
		return h;
	}
	
	public Date cong() {
		Date t = new Date(d,m,y);
		t.d++;
		if(!t.hople()) {
			t.d = 1;
			t.m++;
			if(!t.hople()) {
				t.m = 1;
				t.y++;
			}
		}
		return t;
	}
	
	 public Date cong(int n) {
		 Date t = new Date(d,m,y);
		 for(int i = 0 ; i < n ; i++) 
			 t = t.cong();
		 return t;
	 }
}
