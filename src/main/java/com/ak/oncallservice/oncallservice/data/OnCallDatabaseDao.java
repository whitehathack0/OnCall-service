package com.ak.oncallservice.oncallservice.data;

import com.ak.oncallservice.oncallservice.model.CustomerEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

@Component
public class OnCallDatabaseDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public OnCallDatabaseDao(JdbcTemplate jt) {
        this.jdbcTemplate = jt;
    }

    public CustomerEntry add(CustomerEntry custEntry) {
        final String sql = "INSERT INTO clientInfo(name, address1, address2, zipcode, email, " +
                "phone, description) VALUES(?,?,?,?,?,?,?);";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {
            PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, custEntry.getName());
            statement.setString(2, custEntry.getAddress1());
            statement.setString(3, custEntry.getAddress2());
            statement.setString(4, custEntry.getZipcode());
            statement.setString(5, custEntry.getEmail());
            statement.setString(6, custEntry.getPhone());
            statement.setString(7, custEntry.getDescription());
            return statement;
        }, keyHolder);

        custEntry.setId(keyHolder.getKey().intValue());

        return custEntry;
    }
}
