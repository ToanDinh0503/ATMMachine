package ATIMmanament;
import java.util.Scanner;

public class Menu {
	
	public static void mainMenuOptions() {
		Scanner sc = new Scanner(System.in);
		String ten;
		String matkhau;
		String ten2;
		String matkhau2;
		double tien;
		System.out.println("--------ATM DCT--------");
		System.out.println("1:Dang nhap");
		System.out.println("2:Dang ki");
		int ch= sc.nextInt();
		if(ch == 2)
		{
			System.out.println("ten tai khoan: ");
			ten  = sc.next();
			System.out.println("mat khau: ");
			matkhau = sc.next();
			System.out.println("vui long nap 10 de tao tai khoan: ");
			tien = sc.nextInt();
			Accounts moi  =new Accounts(ten,matkhau,tien);
		}
		else
		{
			System.out.println("ten tai khoan: ");
			System.out.println("mat khau: ");
			ten2  = sc.next();
			matkhau2 = sc.next();
			
			
		}
		
		
	}

	
}
