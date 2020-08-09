package com.github.truongbb.repository;

import com.github.truongbb.bean.Student;
import com.github.truongbb.mapper.StudentMapper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentRepositoryImpl extends BaseRepository implements StudentRepository {

  @Autowired
  DataSource dataSource;

  // có thể sử dụng jdbc như trước
  @Override
  public List<Student> getAllUsingJdbc() {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    List<Student> students = new ArrayList<>();
    try {
      connection = dataSource.getConnection();
      preparedStatement = connection.prepareStatement("select * from dm_sv");
      resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        String id = resultSet.getString("ma_sv");
        String firstName = resultSet.getString("ho_sv");
        String lastName = resultSet.getString("ten_sv");
        String gender = resultSet.getString("gioi_tinh");
        String address = resultSet.getString("noi_sinh");
        Date birthday = resultSet.getDate("ngay_sinh");
        Student student = new Student(id, firstName, lastName, gender, birthday, address);
        students.add(student);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (!(resultSet == null || resultSet.isClosed())) {
          resultSet.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }

      try {
        if (!(preparedStatement == null || preparedStatement.isClosed())) {
          preparedStatement.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
      try {
        if (!(connection == null || connection.isClosed())) {
          connection.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    return students;
  }

  // sử dụng jdbcTemplate --> ngắn vl 3 dòng
  @Override
  public List<Student> getAllUsingJdbcTemplate() {
    String sql = "select ma_sv id, ho_sv firstName, ten_sv lastName, gioi_tinh gender, ngay_sinh birthday, noi_sinh address from dm_sv";
    return getJdbcTemplate().query(sql, BeanPropertyRowMapper.newInstance(Student.class));
    /**
     * Cách trên là lấy ra list Student và để cho Spring tự map với Class Student mà ta cung cấp,
     * bản chấ là sử dụng Reflection mà thôi, vì vậy làm thế này sẽ rất ngắn nhưng sẽ ảnh hưởng tới hiệu năng của hệ thống,
     * muốn nhanh hơn ta map bằng tay các thuộc tính (xem hàm bên dưới).
     *
     * Chú ý rằng, các cột trả ra trong câu sql phải trùng khớp với Class mà ta mong muốn, không thì sẽ null.
     * Trong ví dụ này, bảng trong DB đang trả ra các cột có tên như trong class DmSv,
     * nhưng nếu cố tính map vào class Student thì tất cả các thuộc tính đều null, vì vậy phải sửa sql
     *
     */
  }

  @Override
  public List<Student> getAllUsingJdbcTemplateMappingManual() {
    String sql = "select * from dm_sv";
    return getJdbcTemplate().query(sql, new StudentMapper());
  }

  /**
   * namedParameterJdbcTemplate là một template giống như jdbcTemplate, nhưng sử dụng các parameter có tên để truy vấn dữ liệu,
   * loại template này được sử dụng nhiều hơn vì nó linh hoạt hơn jdbcTemplate
   */
  @Override
  public Student getOneById(String id) {
    String sql = "select ma_sv id, ho_sv firstName, ten_sv lastName, gioi_tinh gender, ngay_sinh birthday, noi_sinh address from dm_sv where ma_sv = :p_id";
    // p_id chính là namedParameter, có dấu hai chấm ở đầu.
    Map<String, Object> parameters = new HashMap<>();
    parameters.put("p_id", id);
    List<Student> result = getNamedParameterJdbcTemplate().query(sql, parameters, BeanPropertyRowMapper.newInstance(Student.class));
    if (!(result.size() == 0)) {
      return result.get(0);
    }
    return null;
  }

}
