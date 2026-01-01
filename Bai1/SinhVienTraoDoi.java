/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai1;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public class SinhVienTraoDoi extends SinhVien {
    private String truong;
    private int tg;

    public SinhVienTraoDoi(String truong, int tg, String ma, String ten, double diem) {
        super(ma, ten, diem);
        this.truong = truong;
        this.tg = tg;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public int getTg() {
        return tg;
    }

    public void setTg(int tg) {
        this.tg = tg;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(", %s, %s, %d","trao đổi", truong, tg); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
