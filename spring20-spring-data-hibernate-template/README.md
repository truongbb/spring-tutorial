# Spring data - HIBERNATE TEMPLATE

Quay trở lại với `Hibernate` quen thuộc, nó sử dụng `SessionFactory` để sinh ra `Session` và quản lý các entity trong đó.
Thực hiện việc mở, đóng kết nối và truy vấn dữ liệu, tạo, sửa, xóa dữ liệu, ...

Với Spring, cách để lấy ra `SessionFactory` là thông qua 3 session factory bean mà Spring cung cấp:
- `org.springframework.orm.hibernate3.LocalSessionFactoryBean`
- `org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean`
- `org.springframework.orm.hibernate4.LocalSessionFactoryBean` (hibernate 4 or higher)

Cũng có 2 cách cấu hình đó là sử dụng file xml (đã cũ) và sử dụng annotation cấu hình trên java.
Trong ví dụ này, ta sử dụng cách thứ 2 và config vào `DataSourceConfig`.

Nhớ là thêm thự viện `spring-orm` và `hibernate-core`
