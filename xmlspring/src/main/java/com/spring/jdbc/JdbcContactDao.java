package com.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcContactDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save() {
        System.out.println("JDBC");
    }
}
