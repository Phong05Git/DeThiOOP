/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package De2_1;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public class MayTinhBang extends HangHoa{
    private double kichThuocMan;

    public MayTinhBang( String maHang, String tenHang, double giaNhap, double giaBan,double kichThuocMan) {
        super(maHang, tenHang, giaNhap, giaBan);
        this.kichThuocMan = kichThuocMan;
    }
    
    public double getKichThuocMan() {
        return kichThuocMan;
    }

    @Override
    public double tinhLoiNhuan() {
        return (giaBan - giaNhap) * (1 - THUONG_BAN_HANG);
    }

    @Override
    public Object[] toRow() {
        return new Object[]{
            maHang,
            tenHang,
            String.format("%,.2f", giaNhap),
            String.format("%,.2f", giaBan),
            "Máy tính bảng",
            String.format("%,.2f", kichThuocMan),
            String.format("%,.2f", tinhLoiNhuan()),
        };
    }
    
    @Override
    public String toString() {
        return super.toString() + ",Máy tính bảng" +
            String.format(",%,.2f", kichThuocMan) + 
            String.format(",%,.2f", tinhLoiNhuan()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
