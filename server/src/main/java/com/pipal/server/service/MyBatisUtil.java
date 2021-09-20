package com.pipal.server;

import com.pipal.server.bi.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Component
@Slf4j
public class MyBatisUtil {

    @Autowired
    private Config config;

    private static SqlSessionFactory sqlSessionFactory;

    public  SqlSessionFactory build() {
        DataSource dataSource = new PooledDataSource(config.getDriver(), config.getUrl(),
                config.getUsername(), config.getPassword());
        Environment environment = new Environment("env", new JdbcTransactionFactory(), dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(AccountMapper.class);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(configuration);
        return factory;
    }

    @PostConstruct
    public void init() {
        sqlSessionFactory = build();
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}