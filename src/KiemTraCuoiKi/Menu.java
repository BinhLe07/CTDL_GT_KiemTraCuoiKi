package KiemTraCuoiKi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Menu {

	static Scanner Nhap = new Scanner(System.in);
	public static KhoHang kho = new KhoHang();
	
	public static void main(String[] args) {
		
		Date a = new Date();
		
		DienMay headDM = new DienMay(1001, "Tivi", 1, a);
		SanhSu headSS = new SanhSu(2001, "Ly", 2, a);
		ThucPham headTP = new ThucPham(3001, "Gao", 3, a);
		
		DienMay DM1 = new DienMay(1002, "Tu lanh", 4, a);
		headDM.next = DM1;
		SanhSu SS1 = new SanhSu(2002, "Binh nuoc", 5, a);
		headSS.next = SS1;
		ThucPham TP1 = new ThucPham(3002, "Thit ga", 6, a);
		headTP.next = TP1;
		
		DienMay DM2 = new DienMay(1003, "Bep ga", 7, a);
		DM1.next = DM2;
		SanhSu SS2 = new SanhSu(2003, "Dia", 9, a);
		SS1.next = SS2;
		ThucPham TP2 = new ThucPham(3003, "Thit bo", 9, a);
		TP1.next = TP2;

		DienMay DM3 = new DienMay(1004, "May nuoc nong", 7, a);
		DM2.next = DM3;
		SanhSu SS3 = new SanhSu(2004, "Lo thuy tinh", 9, a);
		SS2.next = SS3;
		ThucPham TP3 = new ThucPham(3004, "Xuc xich", 9, a);
		TP2.next = TP3;

		kho.headDienMay = headDM;
		kho.headSanhSu = headSS;
		kho.headThucPham = headTP;
		while (true){
        	System.out.println();
    		System.out.println("------------MENU---------");
            System.out.println("1.Them san pham");
            System.out.println("2.In danh sach hang hoa");
            System.out.println("3.Xoa san pham");
            System.out.println("4.Tim san pham");
            System.out.println("5.Thong ke hang trong kho");
            System.out.println("6.Thoat");

            System.out.print("Lua chon 1->6: ");
            int key = Nhap.nextInt();
            
            switch(key){
        	case 1:	ThemHang(kho);break;
        	case 2:	InTT(kho);break;
        	case 3:	XoaHang(kho);break;
        	case 4:	TimHang(kho);break;
        	case 5:	ThongKeKho(kho);break;
        	default: break;
        	}
		}
	}
	
	public static void ThemHang(KhoHang kho) {
		kho.ThemHang(Nhap);
	}
	
	public static void InTT(KhoHang kho){
		kho.inThongTin();
	}
	
	public static void XoaHang(KhoHang kho) {
		kho.XoaHang(Nhap);
	}
	
	public static void TimHang(KhoHang kho) {
		kho.TimHang(Nhap);
	}
	
	public static void ThongKeKho(KhoHang kho) {
		kho.ThongKe(Nhap);
	}
}