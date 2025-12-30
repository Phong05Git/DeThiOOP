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
public class SinhVienChuyenNganh extends SinhVien{
    private String nganhHoc;
    private int namNhapHoc;

    public SinhVienChuyenNganh(String maSV, String hoTen, double diemTB, String nganhHoc, int namNhapHoc) {
        super(maSV, hoTen, diemTB);
        this.nganhHoc = nganhHoc;
        this.namNhapHoc = namNhapHoc;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public int getNamNhapHoc() {
        return namNhapHoc;
    }

    public void setNamNhapHoc(int namNhapHoc) {
        this.namNhapHoc = namNhapHoc;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", %s, %s, %d",
                        "Chuyên ngành",
                        nganhHoc,
                        namNhapHoc); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
