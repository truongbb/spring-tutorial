<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World Spring MVC</title>
</head>
<body>
<h2>Hello, please input your info</h2>
<%--Các giá trị ở trường path của thẻ form của label phải khớp với path của thẻ mà nó label tới
    Và các giá trị của trường path ở các input, password, radio, ... phải trùng khớp với tên trường trong Student
    Tại sao Spring nhận biết được là Student,
    vì ở Controller, khi ta gõ URL: http://localhost:8080/<project_name>/student
    thì nó sẽ đi tới hàm student() của HelloController, sẽ trả về một student và trang giao diện là Student.jsp dưới dạng một mệnh lệnh (command)
    nên nó sẽ hiểu được trong form này của ta là các thuộc tính của class Student

 --%>
<form:form action="./student" method="POST">

    <form:label path="name">Name</form:label>
    <form:input path="name"/>
    <br/>
    <br/>
    <form:label path="age">Age</form:label>
    <form:input path="age"/>
    <br/>
    <br/>
    <form:label path="password">Password</form:label>
    <form:password path="password"/>
    <br/>
    <br/>
    <form:label path="description">Description</form:label>
    <form:input path="description"/>
    <br/>
    <br/>
    <form:label path="adult">Is adult?</form:label>
    <form:checkbox path="adult"/>
    <br/>
    <br/>
    <form:label path="gender">Gender</form:label>
    <form:radiobutton path="gender" value="M" label="Male"/>
    <form:radiobutton path="gender" value="F" label="Female"/>
    <br/>
    <br/>
    <form:label path="country">Country</form:label>
    <form:select path="country">
        <form:option value="NONE" label="Select"/>
        <%--    countryList này được lấy ngay tại HelloController, hàm getCountryList()    --%>
        <form:options items="${countryList}"/>
    </form:select>
    <br/>
    <br/>
    <%--  thẻ hidden là một thẻ không hiển thị lên trên giao diện, mục đích của nó là lưu trữ một số thông tin
     cần che giấu với người dùng nhưng lại có ích cho lập trình, điển hình như lưu id chẳng hạn,
     nhưng đây là một cách làm cũ và không được khuyến nghị về mặt bảo mật--%>
    <form:hidden path="hiddenItem" value="hiddennnnn"/>
    <br/>
    <br/>
    <button type="submit">Submit</button>
</form:form>
</body>
</html>
