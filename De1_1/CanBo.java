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
public abstract class CanBo {
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;
    protected double heSoLuong;
    final static protected double LUONG_CO_BAN=2000000;

    public CanBo() {
    }

    public CanBo(String hoTen, int namSinh, String gioiTinh,
            String diaChi, double heSoLuong) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.heSoLuong = heSoLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    public abstract double tinhLuong();

    @Override
    public String toString() {
        return String.format("Họ tên: %s | Năm sinh: %d | Giới tính: %s | Địa chỉ: %s | Hệ số lương: %.2f | Lương: %.2f",
                hoTen, namSinh, gioiTinh, diaChi, heSoLuong, tinhLuong());         
    }
    
    public Object[] toRow(){
        return new Object[] {
            hoTen, namSinh, gioiTinh, diaChi, heSoLuong, tinhLuong()
        };
    }
    
}
