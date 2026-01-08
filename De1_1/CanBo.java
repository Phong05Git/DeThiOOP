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
public abstract  class CanBo {
    String ten;
    int nam;
    String sex;
    String diaChi;
    double hsLuong;
    public static final double LUONG_CO_BAN=2000000;

    public CanBo() {
    }

    public CanBo(String ten, int nam, String sex, String diaChi, double hsLuong) {
        this.ten = ten;
        this.nam = nam;
        this.sex = sex;
        this.diaChi = diaChi;
        this.hsLuong = hsLuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getHsLuong() {
        return hsLuong;
    }

    public void setHsLuong(double hsLuong) {
        this.hsLuong = hsLuong;
    }

    @Override
    public String toString() {
        return String.format("%s-%d-%s-%s-%.2f",
                ten, nam, sex, diaChi, hsLuong);
    }
    public abstract double tinhLuong();
}
