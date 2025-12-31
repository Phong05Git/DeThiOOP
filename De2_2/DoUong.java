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
public class DoUong extends MatHang {

    private boolean isHot;

    public DoUong(boolean isHot, String ma, String ten, int soLuong, double giaVon) {
        super(ma, ten, soLuong, giaVon);
        this.isHot = isHot;
    }

    public boolean isIsHot() {
        return isHot;
    }

    public void setIsHot(boolean isHot) {
        this.isHot = isHot;
    }

    @Override
    public double giaMenu() {
        return giaVon / TY_LE_GIA_VON;
    }

    @Override
    public String toString() {
        return super.toString() + ", "
                + (isHot ? "Nóng" : "Lạnh")
                + String.format(", %,.2f", giaMenu()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
