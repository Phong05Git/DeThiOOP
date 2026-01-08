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
public class DienThoai extends HangHoa{
    private double giaSim;

    public DienThoai(double giaSim, String ma, String ten, double giaN, double giaB) {
        super(ma, ten, giaN, giaB);
        this.giaSim = giaSim;
    }

    public double getGiaSim() {
        return giaSim;
    }

    public void setGiaSim(double giaSim) {
        this.giaSim = giaSim;
    }

    @Override
    public double loiNhuan() {
        return (giaB - giaN) * (1 - THUONG_BAN_HANG) - giaSim;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(" %,.2f | %,.2f |",
                        giaSim, loiNhuan()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
