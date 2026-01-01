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
public class SinhVienChuyenNganh extends SinhVien {
    private String nganh;
    private int nam;

    public SinhVienChuyenNganh(String nganh, int nam, String ma, String ten, double diem) {
        super(ma, ten, diem);
        this.nganh = nganh;
        this.nam = nam;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(", %s, %s, %d","chuyên ngành", nganh, nam); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
