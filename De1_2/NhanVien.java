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
public abstract class NhanVien {
    protected String hoTen;
    protected int thamNien;
    protected String queQuan;
    protected double gio;
    public static final double LUONG_GIO=100000;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int thamNien, String queQuan, double gio) {
        this.hoTen = hoTen;
        this.thamNien = thamNien;
        this.queQuan = queQuan;
        this.gio = gio;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getGio() {
        return gio;
    }

    public void setGio(double gio) {
        this.gio = gio;
    }
    
    public abstract double tinhLuong();
    
    public abstract Object[] toRow();

    @Override
    public String toString() {
        return String.format("%s, %d, %s, %,.2f", hoTen, thamNien, queQuan, gio);
    }
    
    
}
