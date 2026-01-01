# **ĐỀ SỐ 1-1**

Một công ty gồm có các cán bộ là nhân viên, quản lý.

- Mỗi cán bộ cần quản lý các thuộc tính: Họ tên, năm sinh, giới tính, địa chỉ, hệ số lương, LUONG_CO_BAN = 2.000.000.
- Lớp nhân viên có thêm thuộc tính: Ngành đào tạo.
    
    Lương = Hệ số lương * lương cơ bản.
    
- Lớp quản lý có thêm thuộc tính: Hệ số chức vụ (<1).
    
    Lương = Hệ số lương * lương cơ bản * (1 + hệ số chức vụ).
    

a) Xây dựng các lớp NhanVien, QuanLy kế thừa từ lớp CanBo (2 điểm)

b) Xây dựng các phương thức khởi tạo, các phương thức getter/setter, phương thức tính lương, in thông tin cho từng lớp. (2 điểm)

c) Xây dựng giao diện cho phép thêm mới NhanVien, QuanLy, khi ấn “Lưu” sẽ khởi tạo đối tượng lưu vào trong chương trình (2 điểm)

d) Hiển thị danh sách các cán bộ đã nhập trên giao diện bảng, hiển thị ở cửa sổ console được nửa số điểm (2 điểm)

e) Trên giao diện khi ấn “Lưu File” sẽ lưu thông tin CanBo đã nhập vào file canbo.txt (2 điểm)

# **ĐỀ SỐ 1-2**

Cửa hàng KFC gồm có các nhân viên là nhân viên bếp, nhân viên thu ngân.

- Mỗi nhân viên cần quản lý các thuộc tính: Họ tên, thâm niên, quê quán, số giờ làm việc, LUONG_GIO = 100.000.
- Lớp nhân viên bếp có thêm thuộc tính: isBepTruong (boolean), thưởng chức vụ.
    
    Lương = Số giờ làm việc * lương mỗi giờ + thưởng chức vụ (nếu là bếp trưởng).
    
- Lớp nhân viên thu ngân có thêm thuộc tính: isBietNgoaiNgu (boolean)
    
    Lương = Số giờ làm việc * lương mỗi giờ
    

a) Xây dựng các lớp NhanVienBep, NhanVienThuNgan kế thừa từ lớp NhanVien (2 điểm)

b) Xây dựng các phương thức khởi tạo, các phương thức getter/setter, phương thức tính lương, in thông tin cho từng lớp. (2 điểm)

c) Xây dựng giao diện cho phép thêm mới NhanVienBep, NhanVienThuNgan, khi ấn “Lưu” sẽ khởi tạo đối tượng lưu vào trong chương trình (2 điểm)

d) Hiển thị danh sách các nhân viên đã nhập trên giao diện bảng, hiển thị ở cửa sổ console được nửa số điểm (2 điểm)

e) Trên giao diện khi ấn “Lưu File” sẽ lưu thông tin nhân viên đã nhập vào file nhanvien.txt (2 điểm)

---

# **ĐỀ SỐ 2-1**

Một cửa hàng gồm có các loại hàng hóa là điện thoại, máy tính bảng, phụ kiện.

Mỗi hàng hóa cần quản lý các thuộc tính: Tên hàng, mã hàng, giá nhập, giá bán, THUONG_BAN_HANG = 0.2

- Điện thoại có thêm thuộc tính: Giá sim ghép.
    
    Lợi nhuận = (giá bán – giá nhập) * (1- thưởng bán hàng) – giá sim ghép.
    
- Máy tính bảng có thêm thuộc tính: Kích thước màn hình.
    
    Lợi nhuận = (giá bán – giá nhập) * (1- thưởng bán hàng)
    

a) Xây dựng các lớp DienThoai, MayTinhBang kế thừa từ lớp HangHoa (2 điểm)

b) Xây dựng các phương thức khởi tạo, các phương thức getter/setter, phương thức tính lợi nhuận, in thông tin cho từng lớp (2 điểm)

c) Đọc dữ liệu hàng hóa từ file hanghoa.txt (sinh viên tự định nghĩa cấu trúc file hanghoa.txt) (2 điểm)

d) Xây dựng giao diện cho phép tìm kiếm thông tin hàng hóa theo mã hàng (2 điểm)

e) Trên giao diện ấn nút “Sắp xếp” sẽ sắp xếp danh sách mặt hàng bán được theo thứ tự giảm dần lợi nhuận có thể thu được và hiển thị trên console hoặc giao diện cửa sổ (2 điểm)

---

# **ĐỀ SỐ 2-2**

Một nhà hàng phục vụ gồm các mặt hàng là món ăn và đồ uống.

- Mỗi mặt hàng cần quản lý các thuộc tính: tên mặt hàng, mã hàng, số lượng, giá vốn, TY_LE_GIA_VON = 0.4
- Món ăn có thêm thuộc tính là: cần trình diễn (boolean)
    
    Giá trên menu = (giá vốn)/Tỷ lệ giá vốn + 200.000 (nếu cần trình diễn).
    
- Đồ uống có thêm thuộc tính là: có nóng không (boolean).
    
    Giá trên menu = (giá vốn)/Tỷ lệ giá vốn
    

a) Xây dựng lớp MonAn, DoUong kế thừa từ lớp MatHang (2 điểm)

b) Xây dựng các phương thức khởi tạo, các phương thức getter/setter, phương thức tính giá trên menu, in thông tin cho từng lớp (2 điểm)

c) Đọc dữ liệu mặt hàng từ file mathang.txt (sinh viên tự định nghĩa cấu trúc file mathang.txt) (2 điểm)

d) Xây dựng giao diện cho phép tìm kiếm thông tin mặt hàng theo mã hàng (2 điểm)

e) Trên giao diện ấn nút “Sắp xếp” sẽ sắp xếp danh sách mặt hàng theo thứ tự giảm dần giá trên menu và hiển thị trên console hoặc giao diện cửa sổ (2 điểm)

---

# ĐỀ SỐ 3-2

Hợp tác xã phát ruộng cho người dân gồm ruộng có hình chữ nhật và hình vuông

- Mỗi ruộng sẽ có các thông tin bao gồm mã ruộng, tên chủ hộ, loại cây trồng, DIEN_TICH_MAX=100.
- Ruộng hình vuông có thêm thuộc tính: độ dài cạnh
- Ruộng hình chữ nhật có thêm thuộc tính: chiều dài, chiều rộng

a) Xây dựng các lớp Ruộng vuông, RuongChuNhat kế thừa từ lớp Ruong (2 điểm)

b) Xây dựng các phương thức khởi tạo, các phương thức getter/setter, phương thức tính diện tích, in thông tin cho từng lớp (2 điểm)

c) Xây dựng giao diện cho phép thêm một RuongVuong, RuongChuNhat, khi ấn “Lưu” sẽ lưu thông tin các mảnh ruộng vào cùng 1 List (2 điểm)

d) Xây dựng giao diện thống kê số ruộng từng loại (vuông, chữ nhật); loại cây trồng được chọn trồng nhiều nhất, số ruộng có diện tích lớn hơn diện tích tối đa (2 điểm)

e) Trên giao diện khi ấn “Lưu File” sẽ lưu thông tin danh sách ruộng đã nhập vào file ruong.txt (2 điểm)

---

# Bài 1

Trường học cần quản lý sinh viên gồm các thuộc tính: mã sinh viên, họ tên, điểm trung bình.

- Sinh viên chuyên ngành bổ sung thuộc tính: ngành học, năm nhập học.
- Sinh viên trao đổi bổ sung thuộc tính: trường trao đổi, thời gian trao đổi.

a) Xây dựng lớp SinhVien với đầy đủ các thuộc tính, phương thức khởi tạo, phương thức getter/setter, in thông tin sinh viên.

b) Xây dựng lớp SinhVienChuyenNganh và SinhVienTraoDoi kế thừa từ lớp SinhVien.

c) Xây dựng giao diệm form cho phép nhập liệu thông tin Sinh viên chuyên ngành và Sinh viên trao đổi.

d) Trên form có nút Lưu, khi được nhấn sẽ lưu thông tin NhanVien vào một List và in thông tin đã nhập ra cửa sổ Console. Form cần kiểm tra tính hợp lệ của trường điểm trung bình (là số dương nhỏ hơn hoặc bằng 10)

e) Hiển thị danh sách các sinh viên đã nhập trên giao diện bảng.

---

# Bài 2

Ngân hàng cần quản lý tài khoản gồm các thuộc tính: mã tài khoản, tên chủ tài khoản, số dư.

- Tài khoản tiết kiệm bổ sung thuộc tính: lãi suất, kỳ hạn.
- Tài khoản thanh toán bổ sung thuộc tính: loại thẻ, số lượng giao dịch.

a) Xây dựng lớp TaiKhoan với đầy đủ các thuộc tính, phương thức khởi tạo, phương thức getter/setter, in thông tin tài khoản.

b) Xây dựng lớp TaiKhoanTietKiem và TaiKhoanThanhToan kế thừa từ lớp TaiKhoan.

c) Xây dựng giao diệm form cho phép nhập liệu thông tin Tài khoản tiết kiệm và Tài khoản thanh toán.

d) Trên form có nút Lưu, khi được nhấn sẽ lưu thông tin TaiKhoan vào file taikhoan.txt.

e) Trên form tạo nút thống kê, khi được nhấn sẽ hiển thị trên form thông tin tổng số dư của tất cả các tài khoản và số dư của từng loại tài khoản đa nhập.

---

# Bài 3

Cửa hàng bán điện thoại quản lý các sản phẩm gồm các thuộc tính: mã sản phẩm, tên sản phẩm, giá bán.

- Sản phẩm chính hãng bổ sung thuộc tính: nhà sản xuất, bảo hành (số tháng).
- Sản phẩm xách tay bổ sung thuộc tính: nguồn gốc, tình trạng.

a) Xây dựng lớp sản phẩm với đầy đủ các thuộc tính, phương thức khởi tạo, phương thức getter/setter, in thông tin sản phẩm.

b) Xây dựng lớp SanPhamChinhHang và SanPhamXachTay kế thừa từ lớp SanPham.

c) Xây dựng file sanpham.txt lưu thông tin sản phẩm (chứa ít nhất 5 sản phẩm). Đọc file và in danh sách ra cửa sổ Console.

d) Xây dựng form cho phép nhập thông tin mã sản phẩm, rồi tìm kiếm theo mã sản phẩm và in ra thông tin sản phẩm tìm được trên form.

e) Trên form tạo nút sắp xếp, khi được nhấn sẽ hiển thị ra cửa sổ Console danh sách sản phẩm được sắp xếp theo chiều tăng dần của giá bán .
