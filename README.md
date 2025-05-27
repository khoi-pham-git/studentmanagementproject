# Project Quản Lý Sinh Viên với Spring Boot và Redis

## Mô tả dự án

Dự án là hệ thống quản lý sinh viên đơn giản, hỗ trợ các chức năng cơ bản như thêm, sửa, xoá, xem danh sách sinh viên, quản lý lớp học, môn học và giáo viên.

Hệ thống sử dụng **Spring Boot** làm backend, **Redis** dùng để:

- Cache dữ liệu sinh viên (danh sách, chi tiết)
- Quản lý JWT token cho đăng nhập và xác thực phân quyền

Phân quyền được quản lý qua Spring Security với các vai trò: `ADMIN`, `TEACHER`, `STUDENT`. Người dùng đăng nhập lấy token JWT, token được lưu trong Redis để kiểm soát phiên làm việc.

---

## Yêu cầu chức năng chính

| STT | Mô tả yêu cầu chính                                    |
|-----|-------------------------------------------------------|
| 1   | Thêm / sửa / xoá / xem danh sách sinh viên            |
| 2   | Quản lý lớp học: thêm lớp, gán sinh viên vào lớp      |
| 3   | Quản lý môn học: tạo môn học, gán giáo viên            |
| 4   | Quản lý giáo viên: thêm, xem danh sách, gán môn học   |
| 5   | Đăng ký môn học: đăng ký, huỷ, xem danh sách đăng ký  |
| 6   | Xem danh sách sinh viên đăng ký một môn học            |
| 7   | Tìm kiếm sinh viên theo tên, mã lớp, điểm trung bình  |

---

## Yêu cầu phân quyền

| STT | Mô tả yêu cầu phân quyền                               |
|-----|-------------------------------------------------------|
| 8   | Vai trò: ADMIN, TEACHER, STUDENT                      |
| 9   | Giới hạn API theo vai trò (ADMIN mới được xoá sinh viên) |
| 10  | Đăng ký và đăng nhập nhận JWT token                   |
| 11  | Middleware kiểm tra token JWT                          |
| 12  | Mã hóa mật khẩu bằng BCrypt                            |

---

## Yêu cầu sử dụng Redis

| STT | Mục đích Redis                                        |
|-----|------------------------------------------------------|
| 13  | Cache danh sách sinh viên                             |
| 14  | Cache chi tiết sinh viên theo ID                      |
| 15  | Tự động xoá cache khi dữ liệu thay đổi               |
| 16  | Lưu JWT token sau đăng nhập với TTL                   |
| 17  | Invalidate token khi logout hoặc hết hạn              |

---

## Công nghệ sử dụng

- Spring Boot
- Spring Security + JWT
- Redis (cache và lưu token)
- MySQL / PostgreSQL
- BCrypt password encoder

---

## Hướng dẫn cài đặt

1. Cài đặt Redis (có thể dùng Docker)
2. Cấu hình kết nối Redis trong `application.properties`
3. Chạy project Spring Boot
4. Đăng ký tài khoản và đăng nhập lấy token
5. Sử dụng token gọi các API được phân quyền

---

## Liên hệ

Nếu cần hỗ trợ thêm hoặc muốn có project mẫu, vui lòng liên hệ.

