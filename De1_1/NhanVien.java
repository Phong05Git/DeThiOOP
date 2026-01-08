/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package De1_1;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public class NhanVien extends CanBo{
    private String nganh;

    public NhanVien(String nganh, String ten, int nam, String sex, String diaChi, double hsLuong) {
        super(ten, nam, sex, diaChi, hsLuong);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public double tinhLuong() {
        return hsLuong * LUONG_CO_BAN;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("-nhân viên-%s-%,.2f",
                        nganh, tinhLuong()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
