package com.maryanto.dimas.webapp.example.repository;

import com.maryanto.dimas.webapp.example.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Repository(value = "employeeRepository")
@Transactional(readOnly = true)
public class EmployeeRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public String lastNameByEmployeeId(Integer id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("employeeId", id);
        return jdbcTemplate.queryForObject(
                "select concat(concat(first_name, ' '), last_name) as nama_lengkap from employees where employee_id = :employeeId", params, new RowMapper<String>() {
                    @Override
                    public String mapRow(ResultSet resultSet, int i) throws SQLException {
                        return resultSet.getString("nama_lengkap");
                    }
                });
    }

    public Employee findById(Integer id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("employeeId", id);
        return jdbcTemplate.queryForObject(
                "select * from employees where employee_id = :employeeId",
                params,
                new RowMapper<Employee>() {
                    @Override
                    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                        return new Employee(
                                resultSet.getInt("employee_id"),
                                resultSet.getString("first_name"),
                                resultSet.getString("last_name"),
                                resultSet.getBigDecimal("salary"),
                                resultSet.getDouble("commission_pct"));
                    }
                });
    }
}
