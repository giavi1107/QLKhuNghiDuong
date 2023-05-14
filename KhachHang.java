/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhunghiduong;

/**
 *
 * @author ACER
 */
public class KhachHang extends Person{
    
    
    private LoaiKhachHang loaiKhachHang;
    // constructor 

    public KhachHang(LoaiKhachHang loaiKhachHang, String ccd, String sdt, String email, String diachi, int id, String name, String ngay) {
        super(ccd, sdt, email, diachi, id, name, ngay);
        this.loaiKhachHang = loaiKhachHang;
    }

   

    public LoaiKhachHang getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(LoaiKhachHang loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }
    
    public static KhachHang nhapKhachHang(int id)
    {
        String name=Input.inputString("Nhap ten khach hang: ");
        String diachi=Input.inputString("nhap dia chi cua khach hang: ");
        String sdt=Input.inputString("nhap so dien thoai: ");
        String ccd=Input.inputString("Nhap can cuoc cong dan: ");
        String email=Input.inputString("Nhap email: ");              
        String ngay=Input.inputDate();
        System.out.println("Chon loai khach hang ");
        System.out.println("1. VIP");
        System.out.println("2.Normal");
        
        int choice1 =Input.inputInt("Nhap lua chon cua ban bang so(1 hoac 2): ");
        switch(choice1)
        {
        
            case 1:
                return new KhachHang(LoaiKhachHang.VIP, ccd, sdt, email, diachi, id, name, ngay);
            
            case 2 :
                return new KhachHang(LoaiKhachHang.NORMAL, ccd, sdt, email, diachi, id, name, ngay);
 
            default:
                return new KhachHang(LoaiKhachHang.VIP, ccd, sdt, email, diachi, id, name, ngay);    
        }
        
    }

    @Override
    public String toString() {
        return "KhachHang{" + "loaiKhachHang=" + loaiKhachHang + '}';
    }
    
    
}
