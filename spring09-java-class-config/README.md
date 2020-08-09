# Bean configuration by java class

Việc cấu hình trực tiếp bằng java không sử dụng file xml để cấu hình trở nên rất dễ dàng và tiện lợi.
     
Tất cả thứ chúng ta cần làm là có 1 class sẽ chứa cấu hình cho các `bean` (định nghĩa ra các bean như là file xml đã làm), class đó trong bài này đó chính là [`BeanConfig`](./src/main/java/com/github/truongbb/bean/BeanConfig.java).
Class này phải có 1 annotation của Spring để đánh dấu là bật mode config của Spring ở class này, đó là `@Configuration`

Bên trong chúng ta liệt kê các bean của chúng ra bằng các hàm và sử dụng `@Bean`, việc này hoàn toàn tương đương với:

```xml
<bean id="student" class="com.github.truongbb.bean.Student"/>
```

Ngoài ra, còn có @Scope để định nghĩa ra phạm vi hoạt động của bean này, rất tiện lợi.
Thêm vào đó, `@Bean` còn có một số thuộc tính như `initMethod`, hoặc `destroyMethod` có chức năng tương tự `@PostConstruct` và `@PreDestroy` đã đề cập ở các bài trước.


Ngoài ra, cũng giống việc chia nhỏ từng file config xml, việc chia nhỏ từng file config java cũng có thể được thực hiện.
Trong ví dụ này, [`SpringConfig`](./src/main/java/com/github/truongbb/config/SpringConfig.java) sẽ là class config to nhất, sau đó nó sẽ chứa [`BeanConfig`](./src/main/java/com/github/truongbb/bean/BeanConfig.java) và [`SecurityConfig`](./src/main/java/com/github/truongbb/config/SpringConfig.java).


### `@Component`

Annotation naỳ được sử dụng để định nghĩa một bean, nó được sử dụng ở mỗi class.
     
Việc sử dụng annotation này hoàn toàn tương đương với `@Configuraion` + `@Bean`,
nhưng nó hay hơn ở chỗ là nó định nghĩa ra luôn bean ở class mà ta mong muốn, không cần file xml config,
không cần file java config chứa `@Configuration` và phải `@Bean` trong đó.

Ta hoàn toàn có thể đặt tên cho bean mà ta mong muôn bằng cách cho vào ngoặc.
Demo ở class [`Car`](./src/main/java/com/github/truongbb/bean/Car.java)
