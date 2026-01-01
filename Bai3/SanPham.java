/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai3;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public abstract class SanPham {
    protected String ma;
    protected String ten;
    protected double gia;

    public SanPham() {
    }

    public SanPham(String ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %,.2f",ma, ten, gia);
    }
    
    
}
