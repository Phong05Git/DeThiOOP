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
    private double ktMan;

    public MayTinhBang(double ktMan, String ma, String ten, double giaN, double giaB) {
        super(ma, ten, giaN, giaB);
        this.ktMan = ktMan;
    }

    public double getKtMan() {
        return ktMan;
    }

    public void setKtMan(double ktMan) {
        this.ktMan = ktMan;
    }

    @Override
    public double loiNhuan() {
        return (giaB - giaN) * (1 - THUONG_BAN_HANG);
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(" %,.2f inch | %,.2f |",
                        ktMan, loiNhuan()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
