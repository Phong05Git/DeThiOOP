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
    private String nGoc;
    private String tinhTrang;

    public SanPhamXachTay(String nGoc, String tinhTrang, String ma, String ten, double gia) {
        super(ma, ten, gia);
        this.nGoc = nGoc;
        this.tinhTrang = tinhTrang;
    }

    public String getnGoc() {
        return nGoc;
    }

    public void setnGoc(String nGoc) {
        this.nGoc = nGoc;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(", %s, %s, %s",
                        "xách tay", nGoc, tinhTrang); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
