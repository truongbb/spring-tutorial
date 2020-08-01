# SPRING BEANS

# 1. Beans 

- Trong spring, các đối tượng được nó quản lý gọi là ```bean``` (hạt đậu :v). Các ```bean``` này sẽ được <strong>IoC container</strong> quản lý và <strong>inject</strong>. Các bean được định nghĩa trong file ```applicationContext.xml``` và được đọc ra như trong hàm [main](./src/main/java/com/github/truongbb/MainRun.java).
     
- ```Context``` (ngữ cảnh) trong spring là phạm vi hoạt động của spring, các ``bean`` được quản lý bởi IoC trong Context của chương trình. 
Spring sẽ tự tạo các bean khi cần thiết mà chúng ta không phải khởi tạo nó như trước kia ta vẫn làm ta không cần phải ```Message m = new Message();``` nữa, mà Spring sẽ tự động khởi tạo, inject các thành phần cần thiết.
     
- Để định nghĩa ra các ```bean```, trước kia, cách được sử dụng đàu tiên chính là file ```xml``` như bài đã làm. 
Nhưng về sau, khi spring phát triển hơn, thì việc định nghĩa các bean bằng file ```xml``` bộc lộ nhiều khuyết điểm như là số lượng bean gia tăng ta phải tách file, hoặc quá nhiều bean trong file dẫn tới khó quản lý và inject, người ta đã sinh ra các annotation để thực hiện việc đó, theo dõi các bài sau nữa để thấy thêm.


# 2. Bean scopes

Phạm vi hoạt động của bean trong Spring:

- singleton
- prototype
- request
- session
- global-session
     
     
## 2.1 Singleton

- Dựa vào ```Singleton design pattern```, chỉ tạo 1 ```bean``` duy nhất trong suốt toàn bộ quá trình chạy của container.

- Singleton beans được khởi tạo bởi ```IoC container```. Khi sử dụng scope này, đảm bảo rằng ```bean``` không share instance nếu ko nó sẽ dấn đến vấn đề bất ổn trong dữ liệu.

- Là kiểu mặc định của các ```bean``` trong spring (nếu không nói gì trong file config) hoặc có thể chỉ rõ ra phạm vi hoạt động của nó trong file config bằng các sử dụng thuộc tính scope.

```xml
<bean id="Mess1" class="vn.com.ntqsolution.theory.Message" scope="singleton">
  <property name="message" value="inject by setter"/>
</bean>
```

## 2.2 Prototype

- Một instance mới sẽ được tạo mỗi lần bean được request

```xml
<bean id="Mess1" class="vn.com.ntqsolution.theory.Message" scope="prototype">
    <property name="message" value="bla bla"/>
</bean>
```

## 2.3 Request (WEB ONLY)

- Khá giống ```prototype scope```, tuy nhiên nó được sử dụng cho ứng dụng web. Một instance mới của bean sẽ được tạo cho mỗi HTTP request.

- Config bằng cách chỉ rõ scope của nó trong file config

```xml
<bean id="Mess1" class="vn.com.ntqsolution.theory.Message" scope="request">
    <property name="message" value="bla bla"/>
</bean>
```

## 2.4 Session (WEB ONLY) 

- Một bean mới sẽ được tạo cho mỗi HTTP session bởi container.

```xml
<bean id="Mess1" class="vn.com.ntqsolution.theory.Message" scope="session">
    <property name="message" value="bla bla"/>
</bean>
```

- <strong><em>GLOBAL_SESSION (WEB ONLY)</em></strong>: Cái này được sử dụng để tạo các ```global session beans``` cho các ứng dụng Portlet. 
Spring Framework có khả năng mở rộng được và chúng ta có thể tạo scope riêng nếu thích, tuy nhiên, hầu hết mọi thời điểm thì các scope được cung cấp bởi framework là quá đủ rồi.

```xml
<!-- http://kungfulaptrinh.com/gioi-thieu-ve-portal-va-portlet/ -->
<bean id="Mess1" class="vn.com.ntqsolution.theory.Message" scope="global-session">
    <property name="message" value="bla bla"/>
</bean>
```
