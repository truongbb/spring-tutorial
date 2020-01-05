package vn.com.ntqsolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.com.ntqsolution.entity.StudentEntity;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, String> {

    List<StudentEntity> findByLastName(String lastName);

    @Query("select u from StudentEntity u where u.lastName like %?1")
    List<StudentEntity> findByLastNameEndWiths(String lastName);

    @Query("select u from StudentEntity u where u.lastName like %:lastName")
    List<StudentEntity> findByLastNameEndWithsUsingParameter(@Param("lastName") String lastName);


}
