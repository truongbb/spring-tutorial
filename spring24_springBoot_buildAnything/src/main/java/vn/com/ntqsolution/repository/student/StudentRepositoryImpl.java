package vn.com.ntqsolution.repository.student;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.type.DateType;
import org.hibernate.type.StringType;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import vn.com.ntqsolution.entity.StudentEntity;
import vn.com.ntqsolution.repository.BaseRepository;
import vn.com.ntqsolution.util.DataUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Slf4j
public class StudentRepositoryImpl extends BaseRepository implements StudentRepository {

    @Override
    public List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name) {
        List<StudentEntity> result = null;
        try {
            String sql = "select sv.ma_sv id, sv.ho_sv firstName, sv.ten_sv lastName, sv.gioi_tinh gender, sv.noi_sinh address, sv.ngay_sinh birthday from dm_sv sv where sv.ten_sv like :p_name";
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("p_name", DataUtil.removeWildcardCharacters(name));
            result = getNamedParameterJdbcTemplate().query(sql, parameters, BeanPropertyRowMapper.newInstance(StudentEntity.class));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return result;
    }

    @Override
    public List<StudentEntity> findByNameUsingSession(String name) {
        List<StudentEntity> result = null;
        try {
            String sql = "select sv.ma_sv id, sv.ho_sv firstName, sv.ten_sv lastName, sv.gioi_tinh gender, sv.noi_sinh address, sv.ngay_sinh birthday from dm_sv sv where sv.ten_sv like :p_name";
            result = getSession().createSQLQuery(sql)
                    .setParameter("p_name", DataUtil.removeWildcardCharacters(name))
                    .addScalar("id", new StringType())
                    .addScalar("firstName", new StringType())
                    .addScalar("lastName", new StringType())
                    .addScalar("gender", new StringType())
                    .addScalar("address", new StringType())
                    .addScalar("birthday", new DateType())
                    .setResultTransformer(new AliasToBeanResultTransformer(StudentEntity.class)).list();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return result;
    }
}
