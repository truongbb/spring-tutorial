package vn.com.ntqsolution.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "DM_SV")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentEntity {

    @Id
    @Column(name = "MA_SV")
    String id;

    @Column(name = "HO_SV")
    String firstName;

    @Column(name = "TEN_SV")
    String lastName;

    @Column(name = "GIOI_TINH")
    String gender;

    @Column(name = "NGAY_SINH")
    Date birthday;

    @Column(name = "NOI_SINH")
    String address;

}
