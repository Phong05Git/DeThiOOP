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
public class SinhVienTraoDoi extends SinhVien{
    private String truongTraoDoi;
    private int tgTraoDoi;

    public SinhVienTraoDoi( String maSV, String hoTen, double diemTB,String truongTraoDoi, int tgTraoDoi) {
        super(maSV, hoTen, diemTB);
        this.truongTraoDoi = truongTraoDoi;
        this.tgTraoDoi = tgTraoDoi;
    }

    public String getTruongTraoDoi() {
        return truongTraoDoi;
    }

    public void setTruongTraoDoi(String truongTraoDoi) {
        this.truongTraoDoi = truongTraoDoi;
    }

    public int getTgTraoDoi() {
        return tgTraoDoi;
    }

    public void setTgTraoDoi(int tgTraoDoi) {
        this.tgTraoDoi = tgTraoDoi;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", %s, %s, %d",
                        "Trao đổi",
                        truongTraoDoi,
                        tgTraoDoi); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
