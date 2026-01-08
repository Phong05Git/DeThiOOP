/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package De1_2;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public class NhanVienThuNgan extends NhanVien{
    private boolean isBietNN;

    public NhanVienThuNgan(boolean isBietNN, String ten, int thamNien, String que, int gio) {
        super(ten, thamNien, que, gio);
        this.isBietNN = isBietNN;
    }

    public boolean isIsBietNN() {
        return isBietNN;
    }

    public void setIsBietNN(boolean isBietNN) {
        this.isBietNN = isBietNN;
    }

    @Override
    public double tinhLuong() {
        return gio*LUONG_GIO;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("-thu ngân-%s-%,.2f",
                        (isBietNN ? "có" : "không"),
                        tinhLuong()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
