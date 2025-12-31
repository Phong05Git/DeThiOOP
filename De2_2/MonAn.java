/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2_2;

/**
 *
 * @author Nguyễn Thanh Phong
 * @version 1.0
 */
public class MonAn extends MatHang {

    private boolean canTrinhDien;

    public MonAn(boolean canTrinhDien, String ma, String ten, int soLuong, double giaVon) {
        super(ma, ten, soLuong, giaVon);
        this.canTrinhDien = canTrinhDien;
    }

    public boolean isCanTrinhDien() {
        return canTrinhDien;
    }

    public void setCanTrinhDien(boolean canTrinhDien) {
        this.canTrinhDien = canTrinhDien;
    }

    @Override
    public double giaMenu() {
        double gia = giaVon / TY_LE_GIA_VON;
        if (canTrinhDien) {
            return gia + 200000;
        } else {
            return gia;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", "
                + (canTrinhDien ? "Cần trình diễn" : "Không cần trình diễn")
                + String.format(", %,.2f", giaMenu()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
