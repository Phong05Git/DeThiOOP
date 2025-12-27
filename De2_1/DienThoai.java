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
public class DienThoai extends HangHoa {
    private double giaSimGhep;

    public DienThoai( String maHang, String tenHang, double giaNhap, double giaBan, double giaSimGhep) {
        super(maHang, tenHang, giaNhap, giaBan);
        this.giaSimGhep = giaSimGhep;
    }

    public double getGiaSimGhep() {
        return giaSimGhep;
    }

    public void setGiaSimGhep(double giaSimGhep) {
        this.giaSimGhep = giaSimGhep;
    }

    @Override
    public double tinhLoiNhuan() {
        return (giaBan - giaNhap) * (1 - THUONG_BAN_HANG) - giaSimGhep;
    }

    @Override
    public Object[] toRow() {
        return new Object[]{
            maHang,
            tenHang,
            String.format("%,.2f", giaNhap),
            String.format("%,.2f", giaBan),
            "Điện thoại",
            String.format("%,.2f", giaSimGhep),
            String.format("%,.2f", tinhLoiNhuan()),
        };
    }

    @Override
    public String toString() {
        return super.toString() + ",Điện thoại" +
            String.format(",%,.2f", giaSimGhep) + 
            String.format(",%,.2f", tinhLoiNhuan()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
