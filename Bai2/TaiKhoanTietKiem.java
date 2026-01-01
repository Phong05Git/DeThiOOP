/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai2;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public class TaiKhoanTietKiem extends TaiKhoan{
    private double lai;
    private int kyHan;

    public TaiKhoanTietKiem(double lai, int kyHan, String ma, String ten, double soDu) {
        super(ma, ten, soDu);
        this.lai = lai;
        this.kyHan = kyHan;
    }

    public double getLai() {
        return lai;
    }

    public void setLai(double lai) {
        this.lai = lai;
    }

    public int getKyHan() {
        return kyHan;
    }

    public void setKyHan(int kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(", %s, %.2f, %d",
                        "tiết kiệm", lai, kyHan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
