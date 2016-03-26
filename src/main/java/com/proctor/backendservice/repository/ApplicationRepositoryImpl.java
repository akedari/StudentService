package com.proctor.backendservice.repository;

import com.proctor.backendservice.model.output.LoginOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by ashekar on 3/26/2016.
 */
@Component
public class ApplicationRepositoryImpl implements ApplicationRepository {

  @Autowired
  JdbcTemplate jdbcTemplate;

  @Override
  public Optional<LoginOutput> getUserByUseridAndPassword(String userId, String password) {
    LoginOutput output = jdbcTemplate.queryForObject("select idAssigned  , isStudent from authentication where userid = ? and password = ?", new Object[]{userId, password}, (rs, rowNum) -> new LoginOutput(rs.getLong("idAssigned"), rs.getString("isStudent")));
    return Optional.of(output);

  }
}
