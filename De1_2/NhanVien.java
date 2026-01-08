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
    String ten;
    int thamNien;
    String que;
    int gio;
    public static final double LUONG_GIO=100000;

    public NhanVien() {
    }

    public NhanVien(String ten, int thamNien, String que, int gio) {
        this.ten = ten;
        this.thamNien = thamNien;
        this.que = que;
        this.gio = gio;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    @Override
    public String toString() {
        return String.format("%s-%d-%s-%d",
                ten, thamNien, que, gio);
    }
    
    public abstract double tinhLuong();
    
}
