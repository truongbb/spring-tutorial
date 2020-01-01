package vn.com.ntqsolution.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component("xexe")
@Scope("prototype")
public class Car {

    int id;
    String brand;
    String numberPlate;

}
