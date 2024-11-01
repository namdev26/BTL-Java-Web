package Config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:sqlserver://VUHOANGNAM\\SQLEXPRESS;databaseName=QLR");
        hikariConfig.setUsername("sa");
        hikariConfig.setPassword("888888888");
        hikariConfig.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        hikariConfig.setMaximumPoolSize(20);
        hikariConfig.setIdleTimeout(30000);
        hikariConfig.setConnectionTimeout(20000);
        hikariConfig.setMinimumIdle(5);

        return new HikariDataSource(hikariConfig);
    }
}