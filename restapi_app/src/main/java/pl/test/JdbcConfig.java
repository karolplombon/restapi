package pl.test;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


public class JdbcConfig {

    public static DataSource getMysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:8080/test");
        dataSource.setUsername("admin");
        dataSource.setPassword("admin");

        return dataSource;
    }
}
