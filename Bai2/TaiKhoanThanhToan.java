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
public class TaiKhoanThanhToan extends TaiKhoan{
    private String loaiThe;
    private int soLuongGD;

    public TaiKhoanThanhToan(String loaiThe, int soLuongGD, String ma, String ten, double soDu) {
        super(ma, ten, soDu);
        this.loaiThe = loaiThe;
        this.soLuongGD = soLuongGD;
    }

    public String getLoaiThe() {
        return loaiThe;
    }

    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }

    public int getSoLuongGD() {
        return soLuongGD;
    }

    public void setSoLuongGD(int soLuongGD) {
        this.soLuongGD = soLuongGD;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(", %s, %s, %d",
                        "thanh toán", loaiThe, soLuongGD); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
