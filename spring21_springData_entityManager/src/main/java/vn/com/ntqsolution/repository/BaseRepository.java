package vn.com.ntqsolution.repository;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Data
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//    @Autowired
//    SessionFactory sessionFactory;

    public Session getSession() {
        return getEntityManager().unwrap(Session.class).getSessionFactory().openSession();
    }

    @PersistenceContext
    EntityManager entityManager;

}
