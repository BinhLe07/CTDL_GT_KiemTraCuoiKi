package KiemTraCuoiKi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhoHang {
	DienMay headDienMay;
	SanhSu headSanhSu;
	ThucPham headThucPham;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	
	KhoHang(){
		
	}
	
	KhoHang (DienMay _headDienMay, SanhSu _headSanhSu, ThucPham _headThucPham){
		headDienMay = _headDienMay;
		headSanhSu = _headSanhSu;
		headThucPham = _headThucPham;
	}
	
	public void ThemHang(Scanner scanner) {
		System.out.println("Chon loai hang muon them?");
        System.out.println("1.Dien may");
        System.out.println("2.Sanh su");
        System.out.println("3.Thuc pham");
        System.out.println("Lua chon 1->3: ");
		
		int loaiHang = scanner.nextInt();
		
		if (loaiHang == 1) {
			DienMay cur = headDienMay;
			while (cur != null) {
				if (cur.next == null) {
					DienMay itemMoi = new DienMay();
					itemMoi.id = nhapID(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}else if (loaiHang == 2) {
			SanhSu cur = headSanhSu;
			while (cur != null) {
				if (cur.next == null) {
					SanhSu itemMoi = new SanhSu();
					itemMoi.id = nhapID(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}else if (loaiHang == 3) {
			ThucPham cur = headThucPham;
			while (cur != null) {
				if (cur.next == null) {
					ThucPham itemMoi = new ThucPham();
					itemMoi.id = nhapID(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}
	}
	
	
	
	int nhapID(Scanner scanner, int loaihang) {
		
		System.out.print("Nhap ID: ");
		int id = scanner.nextInt();
		
		if (loaihang == 1) {
			DienMay cur = headDienMay;
			while (cur != null) {
				if (cur.id == id) {
					System.out.println("ID ton tai");
					return nhapID(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 2) {
			SanhSu cur = headSanhSu;
			while (cur != null) {
				if (cur.id == id) {
					System.out.print("ID ton tai");
					return nhapID(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 3) {
			ThucPham cur = headThucPham;
			while (cur != null) {
				if (cur.id == id) {
					System.out.print("ID ton tai");
					return nhapID(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		return id;
	}
	
	public void inThongTin(){
		DienMay curDM = headDienMay;
		SanhSu curSS = headSanhSu;
		ThucPham curTP = headThucPham;
		
		while (curDM != null) {
			curDM.inTT();
			curDM = curDM.next;
		}	
		while (curSS != null) {
			curSS.inTT();
			curSS = curSS.next;
		}
		while (curTP != null) {
			curTP.inTT();
			curTP = curTP.next;
		}
	}
	
	public void XoaHang(Scanner scanner) {
		System.out.println("Chon cach xoa");
		System.out.println("1) Theo Id");
		System.out.println("2) Theo ten");
		System.out.println("Lua chon 1->2");
		
		int cachxoa = scanner.nextInt();
		
		if (cachxoa == 1) {
			System.out.print("Nhap ID can xoa: ");
			int idCanXoa = scanner.nextInt();
			
			if (headDienMay.id == idCanXoa) {
				headDienMay = headDienMay.next;
				return;
			}
			
			if (headSanhSu.id == idCanXoa) {
				headSanhSu = headSanhSu.next;
				return;
			}
			
			if (headThucPham.id == idCanXoa) {
				headThucPham = headThucPham.next;
				return;
			}
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM.next != null) {
				if (curDM.next.id == idCanXoa) {
					curDM.next = curDM.next.next;
					return;
				}
				curDM = curDM.next;
			}
			
			while (curSS.next != null) {
				if (curSS.next.id == idCanXoa) {
					curSS.next = curSS.next.next;
					return;
				}
				curSS = curSS.next;
			}
			
			while (curTP != null) {
				if (curTP.next.id == idCanXoa) {
					curTP.next = curTP.next.next;
					return;
				}
				curTP = curTP.next;
			}
			System.out.println("Da xoa");
		}
		
		if (cachxoa == 2) {
			System.out.print("Nhap ten can xoa: ");
			scanner.nextLine();
			String idCanXoa = scanner.nextLine();
			
			if (headDienMay.name.equalsIgnoreCase(idCanXoa)) {
				headDienMay = headDienMay.next;
				return;
			}
			
			if (headSanhSu.name.equalsIgnoreCase(idCanXoa)) {
				headSanhSu = headSanhSu.next;
				return;
			}
			
			if (headThucPham.name.equalsIgnoreCase(idCanXoa)) {
				headThucPham = headThucPham.next;
				return;
			}
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM.next != null) {
				if (curDM.next.name.equalsIgnoreCase(idCanXoa)) {
					curDM.next = curDM.next.next;
					return;
				}
				curDM = curDM.next;
			}
			
			while (curSS.next != null) {
				if (curSS.next.name.equalsIgnoreCase(idCanXoa)) {
					curSS.next = curSS.next.next;
					return;
				}
				curSS = curSS.next;
			}
			
			while (curTP != null) {
				if (curTP.next.name.equalsIgnoreCase(idCanXoa)) {
					curTP.next = curTP.next.next;
					return;
				}
				curTP = curTP.next;
			}
			System.out.println("Da xoa");
		}
	}
	
	public void TimHang(Scanner scanner) {
		System.out.println("Chon cach tim");
		System.out.println("1) Theo Id");
		System.out.println("2) Theo khoang gia");
		System.out.println("Lua chon 1 hoac 2");
		
		int cachtim = scanner.nextInt();
		
		
		if (cachtim == 1) {
			System.out.println("\nNhap loai hang muon tim");
			System.out.println("1) Dien may");
			System.out.println("2) Sanh su");
			System.out.println("3) Thuc pham");
			System.out.println("Lua chon 1->3");
			int loai = scanner.nextInt();
			
			if (loai == 1) {
				DienMay cur = headDienMay;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}else if (loai == 2) {
				SanhSu cur = headSanhSu;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}else if (loai == 3) {
				ThucPham cur = headThucPham;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}
			
			
		}else if (cachtim == 2) {
			System.out.print("Nhap khoang gia muon tim\nTu: ");
			float start = scanner.nextFloat();
			System.out.print("Den: ");
			float end = scanner.nextFloat();
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM != null) {
				if (curDM.gia >= start && curDM.gia <= end)
					curDM.inTT();
				curDM = curDM.next;
			}
			System.out.println();
			
			while (curSS != null) {
				if (curSS.gia >= start && curSS.gia <= end)
					curSS.inTT();
				curSS = curSS.next;
			}
			System.out.println();
			
			while (curTP != null) {
				if (curTP.gia >= start && curTP.gia <= end)
					curTP.inTT();
				curTP = curTP.next;
			}
			
		}
	}
	
	public void ThongKe(Scanner scanner) {
		int tongSLHang;
		int tongSLDienMay = 0;
		int tongSLSanhSu = 0;
		int tongSLThucPham = 0;
		
		float tongGiaTri = 0;
		float tongGiaTriDienMay = 0;
		float tongGiaTriSanhSu = 0;
		float tongGiaTriThucPham = 0;
		
		DienMay curDM = headDienMay;
		SanhSu curSS = headSanhSu;
		ThucPham curTP = headThucPham;
		
		while (curDM != null) {
			tongSLDienMay++;
			tongGiaTriDienMay += curDM.gia;
			curDM = curDM.next;
		}
		
		while (curSS != null) {
			tongSLSanhSu++;
			tongGiaTriSanhSu += curSS.gia;
			curSS = curSS.next;
		}
		
		while (curTP != null) {
			tongSLThucPham++;
			tongGiaTriThucPham += curTP.gia;
			curTP = curTP.next;
		}
		
		tongSLHang = tongSLDienMay + tongSLSanhSu + tongSLThucPham;
		tongGiaTri = tongGiaTriDienMay + tongGiaTriSanhSu + tongGiaTriThucPham;
		
		System.out.println("Tong so luong hang hoa trong kho: " + tongSLHang + " san pham");
		System.out.println("Tong gia tri kho: " + tongGiaTri + "VND\n");
		
		System.out.println("Hang dien may co: " + tongSLDienMay + " san pham");
		System.out.println("Hang sanh su co: " + tongSLSanhSu + " san pham");
		System.out.println("Hang thuc pham: " + tongSLThucPham + " san pham");
		
	}
}