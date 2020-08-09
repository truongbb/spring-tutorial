# AUTOWIRE

Khi tạo một `bean`, chúng ta set các thuộc tính cho `bean` đó dựa vào 2 thẻ `property` và `constructor-arg` trong file config.
Nhưng, Spring có một khái niệm cao cấp hơn, đó chính là `autowiring`.

Như ta đã biết, các thuộc tính, các giá trị ban đầu, các mối quan hệ, ràng buộc, hay sự phụ thuộc của 1 bean được Spring đọc
ở trong file cấu hình và tạo bean. Những thứ Spring đọc ấy là do ta tự tay config, tự tay định nghĩa ra
và cuối cùng là Spring sẽ kết nối chúng lại (`wire`).

Công việc <strong><em>wire</em></strong> này cũng sẽ được thực hiện một cách tự động (`autowire`) dựa vào cơ chế mà chúng ta sẽ đề cập ngay sau đây.
Việc `autowire` nhằm mục đích lược giảm các cấu hình của file config xml đi khi dự án Spring quá lớn, quá nhiều bean.


Có 3 loại `autowire` trong Spring (xem file config):
- `byName`
- `byType`
- `byConstructor`

Khi config bean không nói gì tức là không bật chế độ `autowire`.
Mặc định chế độ `autowire = default`, tức là Spring sẽ sử dụng chế độ `constructor`, nếu không được nó sẽ chuyển qua chế độ `byType`


## 1. `byName`
Khi bật chế độ này lên, Spring sẽ tự detect bean con được inject trong bean đang config này bằng tên mà chúng ta cung cấp.
Nếu nó scan hết các bean mà không thấy bean nào có tên như tên ta cấu hình thì sẽ bắn ra exception và việc tạo bean thất bại.


## 2. `byType`
Tương tự byName, `byType` là chế độ mà Spring sẽ thực hiện tìm kiếm và inject bean theo type của bean, tất cả công việc cần làm là bật mode `autowire` `byType`


## 3. `byConstructor`
Detect và inject theo constructor mà ta định nghĩa
