### CÁCH SPRING TẠO MỘT BEAN

Một chương trình java bình thường cũng vậy, sẽ có một hàm ```main``` chính. Khi thực hiện chạy chương trình, hàm ```main``` được gọi tới và thực thi.
Nó sẽ chạy lần lượt từ trên xuống dưới, công việc khởi tạo đối tượng, gọi hàm, xem xét các thuộc tính con bên trong hay các thuộc tính của cha nó mà nó kế thừa, hoặc các mối quan hệ ràng buộc (```dependency```) như ```extends```, ```implements```, ```association```, ```composition```, ...

Nói tóm lại, toàn bộ chương trình được kết nối lại (```wired```).

Điều tương tự cũng xảy ra khi chúng ta sử dụng Spring, nhưng khác ở chỗ, công việc khởi tạo, đọc các liên kết hay thuộc tính, phương thức là do Spring Container đảm nhiệm. 
Nó sẽ tạo các ```instances``` (Spring gọi là các ```beans```), các mối quan hệ giữa các ```beans```, các sự phụ thuộc được inject.

Spring sẽ sử dụng ```Java reflection``` để thực hiện việc này, thay vì chúng ta sẽ phải tự tạo bằng tay (từ khóa ```new```) như trước.

Vậy thì, trình tự mà Spring tạo ra 1 bean thế nào, nó qua một vài bước như sau:

1. Framework factory sẽ load ra các bean mà ta cấu hình trong file config và bắt đầu quá trình khởi tạo bean.

2. Khi đọc cấu hình của một bean nào đó, nó sẽ đọc tới cấu hinh của các thuộc tính trong bean và inject chúng (sử dụng constructor hoặc setter). 
Nếu như có thuộc tính tham chiếu tới một bean khác thì nó sẽ đọc cấu hình của bean được tham chiếu đó và khởi tạo trước,
sau đó inject vào thuộc tính của bean mà nó đang khởi tạo. Nếu như nó khởi tạo bean được tham chiếu tới thất bại thì việc tạo bean mà nó đang tạo cũng thất bại.
Lấy ví dụ khi khởi tạo bean ```student``` hoặc ```student1```, Spring sẽ đọc các thuộc tính bên trong bean và inject cho chúng ta.
Nhưng khi đọc tới thuộc tính ```clazz```, nó tham chiếu tới bean ```clazz``` được định nghĩa trước đó.
Thì Spring sẽ tạo bean clazz ```trước```, sau đó inject vào bean ```student``` (hoặc ```student1```) của ta.
Nếu công việc tạo ```clazz``` bean thất bại thì đồng nghĩa với việc tạo bean ```student``` thất bại.

3. Nếu bean của ta ```implements``` bất kì Spring interface nào như là ```BeanNameAware```, hoặc là ```BeanFactoryAware```
thì các phương thức tương ứng cài đè sẽ được gọi

4. Spring gọi tới ```BeanPostProcessor```, nếu bean của ta có mối liên kết với nó (được định nghĩa trong cấu hình).

5. Phương thức init() sẽ được thực hiện, nếu mà chúng ta cài đè nó, còn nếu không thì sẽ qua bước này.

6. ```Post-initialization``` sẽ được thực hiện (một hành động hậu xử lý khi bean được khởi tạo).
