package vn.com.ntqsolution.theory;

public class BeanScope {


    /**
     *
     * ==========BEAN SCOPE============
     *
     * Phạm vi hoạt động của bean trong Spring
     * 	- singleton
     * 	- prototype
     * 	- request
     * 	- session
     * 	- global-session
     *
     *
     * 	***SINGLETON****
     * 	Dựa vào Singleton design pattern, chỉ tạo 1 bean duy nhất trong suốt toàn bộ quá trình chạy của container
     * 	Singleton beans được khởi tạo bởi IoC container
     * 	Khi sử dụng scope này, đảm bảo rằng bean không share instance nếu ko nó sẽ dấn đến vấn đề bất ổn trong dữ liệu
     * 	Là kiểu mặc định của các bean trong spring (nếu không nói gì trong file config)
     * 	hoặc có thể chỉ rõ ra phạm vi hoạt động của nó trong file config bằng các sử dụng thuộc tính scope
     * 		<bean id="Mess1" class="vn.com.ntqsolution.theory.Message" scope="singleton">
     *         <property name="message" value="inject by setter"/>
     *     	</bean>
     *
     *	***PROTOTYPE****
     *	Một instance mới sẽ được tạo mỗi lần bean được request
     * 		<bean id="Mess1" class="vn.com.ntqsolution.theory.Message" scope="prototype">
     * 			<property name="message" value="bla bla"/>
     * 		</bean>
     *
     * ***REQUEST (WEB ONLY)***
     * Khá giống prototype scope, tuy nhiên nó được sử dụng cho ứng dụng web. Một instance mới của bean sẽ được tạo cho mỗi HTTP request
     * Config bằng cách chỉ rõ scope của nó trong file config
     * 		<bean id="Mess1" class="vn.com.ntqsolution.theory.Message" scope="request">
     * 			<property name="message" value="bla bla"/>
     * 		</bean>
     *
     *
     * ***SESSION (WEB ONLY) ***
     *  Một bean mới sẽ được tạo cho mỗi HTTP session bởi container.
     * 		<bean id="Mess1" class="vn.com.ntqsolution.theory.Message" scope="session">
     * 			<property name="message" value="bla bla"/>
     * 		</bean>
     *
     * ***GLOBAL_SESSION (WEB ONLY) ***
     *	Cái này được sử dụng để tạo các global session beans cho các ứng dụng Portlet. Spring Framework có khả năng mở rộng được
     *	và chúng ta có thể tạo scope riêng nếu thích, tuy nhiên, hầu hết mọi thời điểm thì các scope được cung cấp bởi framework là quá đủ rồi.
     *
     * http://kungfulaptrinh.com/gioi-thieu-ve-portal-va-portlet/
     *      *
     * 		<bean id="Mess1" class="vn.com.ntqsolution.theory.Message" scope="global-session">
     * 			<property name="message" value="bla bla"/>
     * 		</bean>
     *
     */

}
