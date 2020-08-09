# CONTAINER TRONG SPRING


```Container``` là xương sống của Spring framwork, nó là nhân tố quan trọng để làm việc với ```bean```.
Các ```container``` sẽ khởi tạo ```bean```, thiết lập các mối quan hệ giữa các bean và inject các thuộc tính của `bean`.
Ngoài ra, các `container` còn cung cấp API để truy vấn và sử dụng bean đã được khởi tạo.

Lưu ý rằng các bean được `lazy load` vào `container`. Tức là trừ khi chúng ta yêu cầu tạo `bean`,
hoặc là khi tạo bean có thuộc tính là một bean khác thì các `container` sẽ không tự động tạo `bean` một cách bừa bãi,
nhằm tránh các vấn đề về hiệu năng và bộ nhớ.
`Lazy load` được áp dụng cho tất cả các container trong spring, chỉ trừ khi load `Singletons` vào trong `ApplicationContext container` mà thôi.

Các `container` trong Spring chủ yếu được chia làm 2 loại: `Bean Factories` và `Application Contexts`.
`BeanFactory` đơn giản là một `container` cung cấp việc inject sử dụng DI, còn `ApplicationContxet` là một phần mở rộng của `BeanFactory`
chứa các công cụ để thực hiện giao tiếp với `beans`.
