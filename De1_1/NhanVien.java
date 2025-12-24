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
public class NhanVien extends CanBo{
    private String nganhDaoTao;

    public NhanVien() {
    }

    public NhanVien(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public NhanVien(String hoTen, int namSinh, String gioiTinh, String diaChi, double heSoLuong, String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi, heSoLuong);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setnganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public double tinhLuong() {
        return this.getHeSoLuong() * this.LUONG_CO_BAN;
    }

    @Override
    public Object[] toRow() {
        return new Object[]{
            hoTen, namSinh, gioiTinh, diaChi, heSoLuong, nganhDaoTao, tinhLuong()
        };
    }

    @Override
    public String toString() {
        return String.format("Họ tên: %s | Năm sinh: %d | Giới tính: %s | Địa chỉ: %s | Hệ số lương: %.2f | Ngành đào tạo: %s | Lương: %.2f",
                hoTen, namSinh, gioiTinh, diaChi, heSoLuong, nganhDaoTao, tinhLuong());
    }
    
    
}
