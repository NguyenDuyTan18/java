package buoi2;
import java.util.Scanner;
public class SDADate {

	public static void main(String[] args) {
		Date ds[] = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu: ");
		int n = sc.nextInt();
		ds = new Date[n];
		for(int i = 0; i < n; i++) {
			ds[i] = new Date();
		}
		System.out.println("Nhap phan tu: ");
		for(int i = 0 ; i < n; i++) {
			System.out.println("Nhap phan tu thu "+(i+1) +": ");
			ds[i].nhap();
		}
		System.out.println("Danh sach vua nhap date: ");
		for(int i = 0; i < n; i++) {
			ds[i].in();
		}
	}

}
