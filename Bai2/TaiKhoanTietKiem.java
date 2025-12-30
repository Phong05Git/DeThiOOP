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
    private double laiSuat;
    private int kiHan;

    public TaiKhoanTietKiem(String maTK, String tenChuTK, double soDu, double laiSuat, int kiHan) {
        super(maTK, tenChuTK, soDu);
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return super.toString() + 
                String.format(", %s, %.2f, %d, %,.2f",
                        "Tiết kiệm",
                        laiSuat,
                        kiHan,
                        soDu); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
