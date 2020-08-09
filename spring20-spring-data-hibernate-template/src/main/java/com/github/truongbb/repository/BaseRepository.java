package com.github.truongbb.repository;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Data
@Repository
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseRepository {

  @Autowired
  JdbcTemplate jdbcTemplate;

  @Autowired
  NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  @Autowired
  SessionFactory sessionFactory;

  public Session getSession() {
    return sessionFactory.openSession();
  }

}
