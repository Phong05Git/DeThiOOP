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
public class TaiKhoan {
    protected String maTK;
    protected String tenChuTK;
    protected double soDu;

    public TaiKhoan() {
    }

    public TaiKhoan(String maTK, String tenChuTK, double soDu) {
        this.maTK = maTK;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getTenChuTK() {
        return tenChuTK;
    }

    public void setTenChuTK(String tenChuTK) {
        this.tenChuTK = tenChuTK;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return String.format("%s, %s",
                maTK, tenChuTK);
    }
    
    
}
