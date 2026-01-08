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
public class NhanVienBep extends NhanVien{
    private boolean isBT;
    private double thuongCV;

    public NhanVienBep(boolean isBT, double thuongCV, String ten, int thamNien, String que, int gio) {
        super(ten, thamNien, que, gio);
        this.isBT = isBT;
        this.thuongCV = thuongCV;
    }

    public boolean isIsBT() {
        return isBT;
    }

    public void setIsBT(boolean isBT) {
        this.isBT = isBT;
    }

    public double getThuongCV() {
        return thuongCV;
    }

    public void setThuongCV(double thuongCV) {
        this.thuongCV = thuongCV;
    }

    @Override
    public double tinhLuong() {
        return (isBT ? gio * LUONG_GIO + thuongCV : gio * LUONG_GIO);
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("-%s-%,.2f-%,.2f",
                        (isBT ? "bếp trưởng" : "phụ bếp"),
                        thuongCV, tinhLuong()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
