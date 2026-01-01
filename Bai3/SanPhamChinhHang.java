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
    private int bh;

    public SanPhamChinhHang(String nxs, int bh, String ma, String ten, double gia) {
        super(ma, ten, gia);
        this.nxs = nxs;
        this.bh = bh;
    }

    public String getNxs() {
        return nxs;
    }

    public void setNxs(String nxs) {
        this.nxs = nxs;
    }

    public int getBh() {
        return bh;
    }

    public void setBh(int bh) {
        this.bh = bh;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(", %s, %s, %d",
                        "chính hãng", nxs, bh); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
