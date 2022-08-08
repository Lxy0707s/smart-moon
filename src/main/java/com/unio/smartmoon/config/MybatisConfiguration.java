package com.unio.smartmoon.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.unio.smartmoon.**.mapper")
public class MybatisConfiguration {
    @Autowired(required = false)
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setTypeAliasesPackage("com.unio.smartmoon.**.model");
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setDataSource(dataSource);
        Resource[] resources = resolver.getResources("classpath:mapping/*.xml");
        sessionFactory.setMapperLocations(resources);
        return sessionFactory.getObject();
    }

}
