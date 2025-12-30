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
public class SanPhamChinhHang extends SanPham{
    private String nxs;
    private int baoHanh;

    public SanPhamChinhHang(String nxs, int baoHanh, String maSP, String tenSP, double gia) {
        super(maSP, tenSP, gia);
        this.nxs = nxs;
        this.baoHanh = baoHanh;
    }

    public String getNxs() {
        return nxs;
    }

    public void setNxs(String nxs) {
        this.nxs = nxs;
    }

    public int getBaoHanh() {
        return baoHanh;
    }

    public void setBaoHanh(int baoHanh) {
        this.baoHanh = baoHanh;
    }

    @Override
    public String toString() {
        return super.toString() + 
                String.format(", %s, %s, %d tháng, %,.2f", "chính hãng", nxs, baoHanh, gia); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
