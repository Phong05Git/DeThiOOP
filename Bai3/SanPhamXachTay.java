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
public class SanPhamXachTay extends SanPham{
    private String nguonGoc;
    private String tinhTrang;

    public SanPhamXachTay(String nguonGoc, String tinhTrang, String maSP, String tenSP, double gia) {
        super(maSP, tenSP, gia);
        this.nguonGoc = nguonGoc;
        this.tinhTrang = tinhTrang;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return super.toString() + 
                String.format(", %s, %s, %s, %,.2f", "xách tay", nguonGoc, tinhTrang, gia); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
