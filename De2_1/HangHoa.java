/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package De2_1;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public abstract class HangHoa {
    protected String tenHang;
    protected String maHang;
    protected double giaNhap;
    protected double giaBan;
    public static final double THUONG_BAN_HANG = 0.2;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, double giaNhap, double giaBan) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    public abstract double tinhLoiNhuan();

    @Override
    public String toString() {
        return String.format("%s,%s,%,.2f,%,.2f", maHang, tenHang, giaNhap, giaBan);
    }
    
    public abstract Object[] toRow();

}
