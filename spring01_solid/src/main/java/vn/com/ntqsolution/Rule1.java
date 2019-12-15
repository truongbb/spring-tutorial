package vn.com.ntqsolution;

public class Rule1 {
    /*
     * ------------------------1. Single responsibility principle---------------------------
     *                           (Luật trách nhiệm duy nhât)
     *
     * 1. RULE: Một class chỉ NÊN giữ một trách nhiệm duy nhất --> làm một việc duy nhât
     *       tức là chứa 1 hàm duy nhất hoặc thực hiện một chức năng duy nhât
     *
     * 2. WHY: Nếu 1 class chứa nhiều hàm thực hiện nhiều chức năng, sau này class sẽ mở rộng do ta thêm nhiều chức năng khác
     *       vì vậy việc kiểm soát code trở nên khó khăn, test khó khăn, code khó khăn, bảo trì khó khăn
     * */
}

// ví dụ

// class này vi phạm luật vừa rồi, nên tách thành 2 class
class Dinner {
    public void eat() {
    }

    public void drink() {
    }
}

// nên tách thành 2 class
class Eatable {
    public void eat() {
    }
}

class Drinkable {
    public void drink() {
    }
}