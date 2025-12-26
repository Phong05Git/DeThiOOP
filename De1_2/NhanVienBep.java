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
public class NhanVienBep extends NhanVien{
    private boolean isBepTruong;
    private double thuongCV;

    public NhanVienBep( String hoTen, int thamNien, String queQuan, double gio, boolean isBepTruong, double thuongCV) {
        super(hoTen, thamNien, queQuan, gio);
        this.isBepTruong = isBepTruong;
        this.thuongCV = thuongCV;
    }

    public boolean isIsBepTruong() {
        return isBepTruong;
    }

    public void setIsBepTruong(boolean isBepTruong) {
        this.isBepTruong = isBepTruong;
    }

    public double getThuongCV() {
        return thuongCV;
    }

    public void setThuongCV(double thuongCV) {
        this.thuongCV = thuongCV;
    }
    
    

    @Override
    public double tinhLuong() {
        double luong = gio * LUONG_GIO;
        if (isBepTruong) return luong + thuongCV;
        else return luong;
    }

    @Override
    public Object[] toRow() {
        return new Object[]{hoTen, thamNien, queQuan, gio, (isBepTruong ? "Bếp trưởng" :"Phụ bếp"), String.format("%,.2f", thuongCV), String.format("%,.2f", tinhLuong())};
    }

    @Override
    public String toString() {
        return super.toString() + (isBepTruong ? ", Bếp trưởng" :", Phụ bếp") + String.format(", %,.2f", thuongCV) + String.format(", %,.2f", tinhLuong()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
