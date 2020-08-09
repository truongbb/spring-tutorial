# Spring data - ANNOTATION CONFIGURATION

Trong ví dụ này sử dụng annotation để config, cụ thể cofig ở file [`DataSourceConfig`](./src/main/java/com/github/truongbb/config/DataSourceConfig.java),
ta config `dataSource`, `jdbcTemplate` và `NamedParameterJdbcTemplate`,
chúng là các bean do Spring quản lý.

Ngoài ra, tổ chức thêm một [`BaseRepository`](./src/main/java/com/github/truongbb/repository/BaseRepository.java), nhằm chứa các template đã được config bên trên để các `repository` khác
khi mà extends chỉ cần dùng luôn, không cần `@Autowired` lại các template đó.

Mọi thứ khi thực hiện truy vấn với 2 template này hoàn toàn giống với bài trước thực hiện, chỉ khác mục cấu hình
