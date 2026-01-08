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
    String ma;
    String ten;
    double giaN;
    double giaB;
    static final double THUONG_BAN_HANG=0.2;

    public HangHoa() {
    }

    public HangHoa(String ma, String ten, double giaN, double giaB) {
        this.ma = ma;
        this.ten = ten;
        this.giaN = giaN;
        this.giaB = giaB;
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

    public double getGiaN() {
        return giaN;
    }

    public void setGiaN(double giaN) {
        this.giaN = giaN;
    }

    public double getGiaB() {
        return giaB;
    }

    public void setGiaB(double giaB) {
        this.giaB = giaB;
    }

    @Override
    public String toString() {
        return String.format("| %s | %s | %,.2f | %,.2f |",
                ma, ten, giaN, giaB);
    }

    public abstract double loiNhuan();
    
}
