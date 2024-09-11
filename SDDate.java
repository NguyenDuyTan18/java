package buoi2;

public class SDDate {

	public static void main(String[] args) {
		Date t = new Date(11, 9, 2024);
		t.in();
		Date t1 = new Date();
		System.out.println("nhap ngay thang nam: ");
		t1.nhap();
		t1.in();
		System.out.println("Cong sau 300 ngay: ");
		t1 = t1.cong(300);
		t1.in();
	}

}
