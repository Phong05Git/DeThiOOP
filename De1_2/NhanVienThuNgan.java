/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package De1_2;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public class NhanVienThuNgan extends NhanVien{
    private boolean isBietNgoaiNgu;

    public NhanVienThuNgan( String hoTen, int thamNien, String queQuan, double gio, boolean isBietNgoaiNgu) {
        super(hoTen, thamNien, queQuan, gio);
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }

    public boolean isIsBietNgoaiNgu() {
        return isBietNgoaiNgu;
    }

    public void setIsBietNgoaiNgu(boolean isBietNgoaiNgu) {
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }

    @Override
    public double tinhLuong() {
        return gio * LUONG_GIO;
    }

    @Override
    public Object[] toRow() {
        return new Object[]{hoTen, thamNien, queQuan, gio, (isBietNgoaiNgu ? "Có" :"Không"), String.format("%,.2f", tinhLuong())};
    }

    @Override
    public String toString() {
        return super.toString() + (isBietNgoaiNgu ? ", Có" :", Không") + String.format(", %,.2f", tinhLuong()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
