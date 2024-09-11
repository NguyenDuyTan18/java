package buoi2;
import java.util.Scanner;

public class SDADiem {

	public static void main(String[] args) {
		Diem ds[]; // khai báo mảng có kiểu Diem
		Scanner sc = new Scanner(System.in); 
		System.out.println("Nhap so phan tu: ");
		int n =  sc.nextInt();
		ds = new Diem[n]; // cấp phát bộ nhớ với n phần tử với Diem
		for(int i = 0 ; i < n; i++) {
			ds[i] = new Diem(); // cấp phát bộ nhớ danh sách từng phần tử i với Diem.
								// Nếu không có ds[i] = NULL 
		}
		System.out.println("Nhap danh sach phan tu ");
		for( int i = 0; i < n; i++) {
			System.out.println("nhap phan tu thu " + (i+1) + ":");
			ds[i].nhap();
		}
		System.out.println("Danh sach vua nhap ");
		for(int i = 0; i < n; i++) {
			System.out.println("phan tu thu " + (i+1) +": ");
			ds[i].in();
		}

	}

}
