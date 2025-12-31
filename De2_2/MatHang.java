/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2_2;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public abstract class MatHang {

    protected String ma;
    protected String ten;
    protected int soLuong;
    protected double giaVon;
    public static final double TY_LE_GIA_VON = 0.4;

    public MatHang() {
    }

    public MatHang(String ma, String ten, int soLuong, double giaVon) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.giaVon = giaVon;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaVon() {
        return giaVon;
    }

    public void setGiaVon(double giaVon) {
        this.giaVon = giaVon;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %,.2f",
                ma, ten, soLuong, giaVon);
    }

    public abstract double giaMenu();

}
