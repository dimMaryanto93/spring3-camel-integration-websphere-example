package com.maryanto.dimas.scheduler.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class EmployeeRepository {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    public Integer count() {
        return this.jdbcTemplate.queryForObject("select count(*) as jumlah from employees", new HashMap<String, Object>(), new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getInt("jumlah");
            }
        });
    }
}
