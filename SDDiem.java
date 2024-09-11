package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem A = new Diem(5,7);
		System.out.println("Toa do diem A: ");
		A.in();
		Diem B = new Diem();
		B.nhap();
		System.out.println("Toa do diem B: ");
		B.in();
		Diem D = new Diem(10);
		System.out.println("Toa do diem D: ");
		D.in();
		
		Diem C = new Diem(-B.layX(), -B.layY());
		System.out.println("Toa do diem doi xung C: ");
		C.in();
		System.out.println("Khoang cach BO: " + C.kcach());
		System.out.println("Khoang cach BA: " + C.kcach(A));
		
	}

}
