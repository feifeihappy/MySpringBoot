package com.zk.springboot.core.configurer;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author zpf
 * @date 2019/1/4 9:23
 *
 * mybatis 配置
 *
 * @Configuration
 * 表示该文件是一个配置文件@Bean表示该方法是一个传统xml配置文件中的<Bean id=""></Bean>
 *
 * factory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
 * ;
 * 表示dao层的存储路径
 *
 *
 */
@Configuration
public class MybatisConfigurer {
    /**
     * @Bean注解：将方法返回值的bean对象注入spring容器中
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
        /**
         * 表示dao层的存储路径
         */
        mapperScannerConfigurer.setBasePackage("com.zk.springboot.dao");
        return mapperScannerConfigurer;
    }
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        /**
         * 表示项目中model的存储路径
         */
        factory.setTypeAliasesPackage("com.zk.springboot.model");
        // 添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        /**
         * 表示mapper.xml存储路径；
         */
        factory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        return factory.getObject();
    }



}
