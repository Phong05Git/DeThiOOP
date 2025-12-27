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
public class RuongChuNhat extends Ruong{
    private double dai;
    private double rong;

    public RuongChuNhat( String maRuong, String tenChuHo, String loaiCayTrong,double dai, double rong) {
        super(maRuong, tenChuHo, loaiCayTrong);
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    @Override
    public double tinhDienTich() {
        return dai * rong;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Hình chữ nhật, "
                + String.format("%,.2f, ", dai)
                + String.format("%,.2f", rong); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
