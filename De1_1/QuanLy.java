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
    private double hscv;

    public QuanLy(double hscv, String ten, int nam, String sex, String diaChi, double hsLuong) {
        super(ten, nam, sex, diaChi, hsLuong);
        this.hscv = hscv;
    }

    public double getHscv() {
        return hscv;
    }

    public void setHscv(double hscv) {
        this.hscv = hscv;
    }

    @Override
    public double tinhLuong() {
        return hsLuong * LUONG_CO_BAN * (1 + hscv);
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("-quản lý-%s-%,.2f",
                        hscv, tinhLuong()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
