# Spring web MVC - ANNOTATIONS AND SOME NOTES

Dựa trên code của bài trước, ở bài này sẽ giới thiệu 2 annotations cơ bản khác thuộc `data-layer` và `service-layer`,
     
`@Reposiroty` là một annotation thể hiện rằng đó là bean ở tầng `repository`, làm nhiệm vụ giao tiếp với DB và lấy ra dữ liệu
nhưng trong ví dụ không demo connect tới db.

`@Service` là một annotation thể hiện rằng đó là bean ở tầng `service`, thực hiện các nghiệp vụ cần thiết sau khi lấy được data ở tầng `repository`
hoặc đơn thuần là thực hiện các nghiệp vụ như validate, lọc dữ liệu, xử lý, tính toán, ...

Công việc còn lại là phối kết hợp các tầng; `Controller` <--- `Service` <--- `Repository` sử dụng `@Autowired`

Trong ví dụ bài này, service thực hiện validate dự liệu student mà client truyền lên, như là tuổi không âm và nhỏ hơn 150 chẳng hạn.
Tất nhiên đây chỉ là demo, còn thực tế việc validate sẽ khác và không làm thế này.
Ngoài ra nó còn lấy data từ tầng repository để đổ lên combobox trên giao diện thông qua controller.

Một số hàm ở controller sử dụng `PathVariable` hoặc `RequestParam`, ...
