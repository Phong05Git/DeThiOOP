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
public abstract class TaiKhoan {
    protected String ma;
    protected String ten;
    protected double soDu;

    public TaiKhoan() {
    }

    public TaiKhoan(String ma, String ten, double soDu) {
        this.ma = ma;
        this.ten = ten;
        this.soDu = soDu;
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

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %.2f", ma, ten, soDu);
    }
    
}
