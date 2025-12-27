/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package De3_2;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public class RuongVuong extends Ruong{
    private double canh;

    public RuongVuong(String maRuong, String tenChuHo, String loaiCayTrong, double canh) {
        super(maRuong, tenChuHo, loaiCayTrong);
        this.canh=canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Hình vuông, "
                + String.format("%,.2f", canh); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

}
