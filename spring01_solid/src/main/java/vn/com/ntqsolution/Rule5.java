package vn.com.ntqsolution;

public class Rule5 {

    /*
     * ------------------------------5. Dependency inversion----------------------------------
     *
     *   RULE:
     *       1. Các module cấp cao không nên phụ thuộc vào các modules cấp thấp. Cả 2 nên phụ thuộc vào abstraction.
     *       2. Interface (abstraction) không nên phụ thuộc vào chi tiết, mà ngược lại.
     *               (Các class giao tiếp với nhau thông qua interface, không phải thông qua implementation, tức là không thông qua class implement)
     *---> Khó hiểu vc, ví dụ đi
     *
     *
     * */
}

// giả sử có trường hợp thế này
class Travel {
    Car car = new Car();

    void startJourney() {
        car.move();
    }
}

class Car {
    void move() {
        System.out.println("Move by Car");
    }
}

class Train {
    void move() {
        System.out.println("Move by Train");
    }
}

// giả tỷ như Travel bây giờ là tàu thì phải vào code rồi sửa --> bất tiện, sau này dự án to, sửa sửa thì không thể nào chấp nhận được
class Travel1 {
    Train train = new Train();

    void startJourney() {
        train.move();
    }
}

//---> sử dụng interface chung là cách giải quyết

interface Vehicle {
    void move();
}

class Train1 implements Vehicle {

    @Override
    public void move() {
        System.out.println("Train moving");
    }
}

class Car1 implements Vehicle {

    @Override
    public void move() {
        System.out.println("Train moving");
    }
}

class Travel2 {
    Vehicle vehicle;

    public Travel2(Vehicle vehicle) {// đây chính là dependency inversion, đảo ngược sự phụ thuộc
        this.vehicle = vehicle;
    }

    public void run() {
        this.vehicle.move();
    }
}

/*Phân tích: bên trên, Travel phụ thuộc vào phương tiện mà được khai báo, cụ thể nó phụ thuộc vào Car
 * khi thay đổi Car thành Train thì lại phải vào code để sửa, rất khó chịu và mất nhiều thời gian để fix bug, maintain, ....
 * thay vào đó ta sử dụng một inerface đại diện cho cả Train và Car, và trong Travel sử dụng đa hình để khai báo Vehicle
 * và khi nào cần đến vehicle ta sẽ truyền vào 1 vehicle ở constructor (inject - tiêm vào)
 * --> đến bây giờ Travel không còn phụ thuộc vào phương tiện nào tryền vào nữa,
 * khi phương tiện nào cần move thì nó truyền vào, không cần quan tâm đó là loại nào
 * --> sau này chuyển từ Car sang Train hay ngược lại đi nữa, cũng không cần vào code để sửa
 *---> đó chính là Dependency inversion
 * */

/*
 * Dependency inversion là một nguyên lý thiết kế và viết code, để triển khai nguyên lý này ta có Invesion of Control (IoC)
 * IoC là một design pattern, còn để hiện thực hóa IoC trong code thì gọi là Dependency injection (DI)
 * Các dạng DI:
 *   - Constructor injection: Truyền vào constructor(như trên sử dụng)
 *   - Setter injection: Truyền vào setter, tương tự cách trên, ta sử dụng setter để inject
 *   - Interface Injection: Class cần inject sẽ implement 1 interface.
 *          Interface này chứa 1 hàm tên Inject.
 *          Container sẽ injection dependency vào 1 class thông qua việc gọi hàm Inject của interface đó.
 *          Đây là cách rườm rà và ít được sử dụng nhất.
 *
 *
 *
 * */