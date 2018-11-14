package com.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Repository("jdbcContactDao")
public class JdbcContactDao {
    private JdbcTemplate jdbcTemplate;

    @Resource(name = "dataSource")
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void save() {
        System.out.println("ANN JDBC" + jdbcTemplate.getClass().getName());
    }
}
