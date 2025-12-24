/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package De1_1;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public class QuanLy extends CanBo{
    private double heSoChucVu;

    public QuanLy() {
    }

    public QuanLy(int heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    public QuanLy(String hoTen, int namSinh, String gioiTinh, String diaChi, double heSoLuong, double heSoChucVu) {
        super(hoTen, namSinh, gioiTinh, diaChi, heSoLuong);
        this.heSoChucVu = heSoChucVu;
    }

    public double getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(double heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    @Override
    public double tinhLuong() {
        return this.LUONG_CO_BAN  * this.getHeSoLuong() * (1 + this.getHeSoChucVu());
    }

    @Override
    public Object[] toRow() {
        return new Object[] {
            hoTen, namSinh, gioiTinh, diaChi, heSoLuong, heSoChucVu, tinhLuong()
        };
    }

    @Override
    public String toString() {
        return String.format("Họ tên: %s | Năm sinh: %d | Giới tính: %s | Địa chỉ: %s | Hệ số lương: %.2f | Hệ số chức vụ: %.2f | Lương: %.2f",
                hoTen, namSinh, gioiTinh, diaChi, heSoLuong, heSoChucVu, tinhLuong());
    }
    
    
    
}
