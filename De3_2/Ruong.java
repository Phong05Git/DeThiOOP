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
public abstract class Ruong {
    protected String maRuong;
    protected String tenChuHo;
    protected String loaiCayTrong;
    public static final double DIEN_TICH_MAX = 100;

    public Ruong() {
    }

    public Ruong(String maRuong, String tenChuHo, String loaiCayTrong) {
        this.maRuong = maRuong;
        this.tenChuHo = tenChuHo;
        this.loaiCayTrong = loaiCayTrong;
    }

    public String getMaRuong() {
        return maRuong;
    }

    public void setMaRuong(String maRuong) {
        this.maRuong = maRuong;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public String getLoaiCayTrong() {
        return loaiCayTrong;
    }

    public void setLoaiCayTrong(String loaiCayTrong) {
        this.loaiCayTrong = loaiCayTrong;
    }
    
    public abstract double tinhDienTich();

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %,.2f",
                maRuong,
                tenChuHo,
                loaiCayTrong,
                tinhDienTich());
    }
    
    

}
