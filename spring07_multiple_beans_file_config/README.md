# MULTIPLE APPLICATION CONTEXT CONFIGURATION FILES 
         
         
Cách cấu hình này nhằm phân loại các bean vào các file độc lập, chia nhỏ để dễ quản lý, bảo trì, sửa lỗi.

Mỗi file config sẽ cấu hình các bean liên quan.
ví dụ `commonBeans.xml` sẽ cấu hình các bean chung, thuộc package common
`bookBeans.xml` sẽ cấu hình các bean liên quan tới book như sách, tác giả, thể loại, ...

Nếu không chia ra thành các file nhỏ, thì ở trong dự án lớn sẽ rất khó quản lý bean trong 1 file.

Xem ví dụ trong code để hiểu rõ hơn.
         
