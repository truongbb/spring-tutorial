package vn.com.ntqsolution.mapper;

import org.springframework.jdbc.core.RowMapper;
import vn.com.ntqsolution.bean.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class StudentMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        String id = resultSet.getString("ma_sv");
        String firstName = resultSet.getString("ho_sv");
        String lastName = resultSet.getString("ten_sv");
        String gender = resultSet.getString("gioi_tinh");
        String address = resultSet.getString("noi_sinh");
        Date birthday = resultSet.getDate("ngay_sinh");
        return new Student(id, firstName, lastName, gender, birthday, address);
    }
}
