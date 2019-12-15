package vn.com.ntqsolution.theory;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Message {

    String message;

    public void showMessage() {
        System.out.println("Mess: " + this.message);
    }
}
